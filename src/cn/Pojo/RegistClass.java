package cn.Pojo;

public class RegistClass {
	private int id;
	private String username;
	private String password;
	private String sex;
	private String hobby;
	private String city;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	
	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
		System.out.println("是否执行username");
		System.out.println(username);
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;

	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
		System.out.println("是否执行password");
	}

	/**
	 * @return the six
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param six
	 *            the six to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the hobby
	 */
	public String getHobby() {
		return hobby;
	}

	/**
	 * @param hobby
	 *            the hobby to set
	 */
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 
	 */
	public RegistClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param username
	 * @param password
	 * @param six
	 * @param hobby
	 * @param city
	 */
	public RegistClass(int id, String username, String password, String sex, String hobby, String city) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.hobby = hobby;
		this.city = city;
	}
}
