package UserService;

public class User {

	private String id;
	private String name;
	private String mail;
	
	/**
	 * Constructor of the class
	 * @param id
	 * @param name
	 * @param mail
	 */
	public User(String id, String name, String mail) {
		this.id = id;
		this.name = name;
		this.mail = mail;
	}

	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mail=" + mail + "]";
	}



	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
