package Entity;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity("note")
public class Note {

	@Id
	@Property("_id")
	private ObjectId id;
	
	@Property("type")
	private TypeNote type;
	
	@Property("score")
	private double score;
	
	@Property("course_id")
	private int course_id;
	
	@Property("student_id")
	private int student_id;
	
	private enum TypeNote{ PARTIAL, FINAL}

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(ObjectId id) {
		this.id = id;
	}

	/**
	 * @return the type
	 */
	public TypeNote getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(TypeNote type) {
		this.type = type;
	}

	/**
	 * @return the score
	 */
	public double getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(double score) {
		this.score = score;
	}

	/**
	 * @return the course_id
	 */
	public int getCourse_id() {
		return course_id;
	}

	/**
	 * @param course_id the course_id to set
	 */
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	/**
	 * @return the student_id
	 */
	public int getStudent_id() {
		return student_id;
	}

	/**
	 * @param student_id the student_id to set
	 */
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	
	
	
}
