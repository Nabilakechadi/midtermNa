package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

/*/public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
	/*	int temp, size;
		int array[] = {10, 20, 25, 63, 96, 57};
		size = array.length;

		for(int i = 0; i<size; i++ ){
			for(int j = i+1; j<size; j++){
				if(array[i]>array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Smallest element of the array is:: "+array[0]);
	}
}


		//find lowest number from the array

		/*ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		List<String> lowestValue = new ArrayList<String>();
		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
			lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for(String st:lowestValue){
			System.out.println(st);
		}
	}

}
*/