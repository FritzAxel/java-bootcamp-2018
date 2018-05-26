package DAO;

import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.QueryResults;

import com.mongodb.Mongo;

import Entity.Note;
import Entity.Student;

public class NoteDAO extends BasicDAO<Note, String>{

	public NoteDAO(Morphia morphia, Mongo mongo, String dbName) {       
        super(mongo, morphia, dbName);   
    }
	
}
