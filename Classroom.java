//Author: Luca Fulmor
//Program Description: Array of student objects that intakes student data and sets it to a index
//also checks if the request index is valid and prints out the full classroom layout

public class Classroom {

	// initial array object
	Student[][] seats;

	public Classroom(int rowNum, int columnNum) {

		// sets the paramater for the array of student objects
		seats = new Student[rowNum][columnNum];

		// nested for loop that goes through each position
		// and creates a student object on each one
		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < columnNum; j++) {

				seats[i][j] = new Student();
			}
		}

	}

	private Student getStudentAt(int row, int col) {

		// gets the student that is sitting at an index
		return seats[row][col];

	}

	public boolean setStudentAt(int row, int col, Student data) {

		// gets student data and sets it to a temp variable
		Student temp = getStudentAt(row, col);

		// checks if the student there is default foobar or not

		if (temp.getFirstName().equals("foo") && temp.getLastName().equals("bar")) {

			// if it is it sets the new student to that spot
			seats[row][col] = data;

			return true;

		}

		// elsewise it returns false and the main program says a student is already
		// there
		else {

			return false;

		}

	}

	public boolean isValid(int row, int col) {

		// checks if row and col entered are less than zero
		if (row < 0 || col < 0) {

			return false;

		}
		// checks if they are larger than 3
		if (row > 3 || col > 3) {

			return false;
		}

		// returns true if the dimensions of the index are valid
		else {

			return true;
		}

	}

	public String toString() {

		// to string method that prints out the classroom seating utilizing the student
		// tostring on the seats array
		return "The current seating: " + "\n" + seats[0][0].toString() + " " + seats[0][1].toString() + " "
				+ seats[0][2].toString() + "\n" + seats[1][0].toString() + " " + seats[1][1].toString() + " "
				+ seats[1][2].toString() + "\n" + seats[2][0].toString() + " " + seats[2][1].toString() + " "
				+ seats[2][2].toString();

	}
}
