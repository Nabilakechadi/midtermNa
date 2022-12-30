package math.problems;

import java.sql.*;

public class LowestNumber {

	public static void main(String[] args) {

		int[] initializedArray

				= new int[] { 25, 110, 74, 75, 5 };



		System.out.println("Given array ");



		for (int i = 0; i < initializedArray.length; i++) {



			System.out.println(initializedArray[i]);

		}



// Initialize minValue with first element of array.

		int minValue = initializedArray[0];



// Loop through the array

		for (int i = 0; i < initializedArray.length; i++) {



// Compare elements of array with minValue and

// if condition true, make minValue to that

// element



			if (initializedArray[i] < minValue)



				minValue = initializedArray[i];

		}



		System.out.println(

				"Smallest element present in given array: "

						+ minValue);

	}

	public static class connection {

		Connection con = null;

		public static Connection connectDB() throws ClassNotFoundException {

			try {


				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con = DriverManager.getConnection(

						"jdbc:mysql://localhost:3306/nadb",

						"root92", "0202");


				return con;

			} catch (SQLException e) {

				System.out.println(e);
			}


			return null;
		}

	}
}

