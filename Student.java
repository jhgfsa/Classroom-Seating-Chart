//Author: Luca Fulmor
//Program Description: Student object that makes up the classroom/seats array. has two variables and 3 methods

public class Student {

	// initial variables
	String lastName;
	String firstName;

	public Student() {

		// constructor with default values
		lastName = "bar";
		firstName = "foo";
	}

	public Student(String info) {

		// method to take in a student info and using split
		// put it into an array and then assign it to first name last name
		String[] stringArray = info.split("/");
		this.lastName = stringArray[1];
		this.firstName = stringArray[0];
	}

	public String getLastName() {

		// gets and returns lastname
		return lastName;

	}

	public String getFirstName() {

		// gets and returns firstname
		return firstName;

	}

	@Override
	public String toString() {

		// toString method that takes first letter of first name and last name
		// and concats it with a . in between
		String result = firstName.charAt(0) + "." + lastName.charAt(0) + ".";
		return result;

	}

}
