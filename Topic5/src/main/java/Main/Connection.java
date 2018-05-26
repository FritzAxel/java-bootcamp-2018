package Main;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.*;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.bson.types.ObjectId;
import DAO.*;
import Entity.*;

public class Connection {

	public static void main(String[] args) throws UnknownHostException {
	
		String dbName = new String("high_school");
		MongoClient mongo = new MongoClient();
		Morphia morphia = new Morphia();
		Datastore ds = morphia.createDatastore(mongo, dbName);
		morphia.mapPackageFromClass(Student.class);
		
		StudentDAO studentDAO = new StudentDAO(morphia, mongo, dbName);
		
		NoteDAO noteDAO = new NoteDAO(morphia, mongo, dbName);
		
		Query<Note> queryNote = ds.createQuery(Note.class);
		queryNote.and(
					queryNote.criteria("score").greaterThan(4),
					queryNote.criteria("course_id").equal(2)			
				);
		QueryResults<Note> retrievedNotes = noteDAO.find(queryNote);
		
		List<Integer> studentsId = new ArrayList<Integer>();
		for(Note n : retrievedNotes) {
			studentsId.add(n.getStudent_id());
		}
		
		Query<Student> queryStudent = ds.createQuery(Student.class);
		queryStudent.criteria("registrationNumber").in(studentsId);
		QueryResults<Student> retrievedStudents = studentDAO.find(queryStudent);
		for(Student s : retrievedStudents) {
			System.out.println("First Name: " + s.getFirstName() + " Last Name: " + s.getLastName());
		}
	}
}
