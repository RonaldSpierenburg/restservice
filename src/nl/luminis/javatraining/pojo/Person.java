package nl.luminis.javatraining.pojo;

import java.io.Serializable;

public class Person implements Serializable {

	private String firstName;
	private String lastName;
	
	public Person() {}
	
	public Person(String aFirstName, String aLastName) {
		setFirstName(aFirstName);
		setLastName(aLastName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
