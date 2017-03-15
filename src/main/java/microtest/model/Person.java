package microtest.model;

public class Person {

	String firstName;
	String lastName;

	public void Person(String firstName, String lastName) 
	{
	  this.firstName = firstName;
	  this.lastName = lastName;
	}

	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	
        public String getLastName() {
		return lastName;
	}
	
	public String toString() {
		return "firstName: " + firstName + " lastName: " + lastName;
	}
}