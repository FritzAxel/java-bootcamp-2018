package DAO;

import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

import com.mongodb.Mongo;

import Entity.Student;

public class StudentDAO extends BasicDAO<Student, String>{

	public StudentDAO(Morphia morphia, Mongo mongo, String dbName) {       
        super(mongo, morphia, dbName);   
    }
	
}
