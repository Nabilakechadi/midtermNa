package algorithm;

import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.Statement;

public class Sort {


    public static void main(String[] args) {}
        private long startTime, stopTime;
        public long executionTime;
        //--------------------
        public void selectionSort (int[] num){
            startTime = System.nanoTime();
            int N = num.length;
            for (int i = 0; i < N - 1; i++) {
                int min_idx = i;
                for (int j = i + 1; j < N; j++) {
                    if (num[j] < num[min_idx])
                        min_idx = j;
                }
                int temp = num[min_idx];
                num[min_idx] = num[i];
                num[i] = temp;
            }
            stopTime = System.nanoTime();
            executionTime = stopTime - startTime;
        }
        //---------------------
        public void insertionSort (int[] num){
            startTime = System.nanoTime();
            int n = num.length;
            for (int i = 1; i < n; ++i) {
                int k = num[i];
                int j = i - 1;

                while (j >= 0 && num[j] > k) {
                    num[j + 1] = num[j];
                    j = j - 1;
                }
                num[j + 1] = k;
            }
            stopTime = System.nanoTime();
            executionTime = stopTime - startTime;
        }
        //------------------------
        public void bubbleSort (int[] num){
            startTime = System.nanoTime();
            int N = num.length;
            for (int i = 0; i < N - 1; i++)
                for (int j = 0; j < N - i - 1; j++)
                    if (num[j] > num[j + 1]) {
                        int temp = num[j];
                        num[j] = num[j + 1];
                        num[j + 1] = temp;
                    }
            stopTime = System.nanoTime();
            executionTime = stopTime - startTime;
        }


        private String DATABASE_URL = "jdbc:mysql://localhost:3306/nabdb";
        private Connection connection;
        private Statement statement;
        private ResultSet resultSet;
        private String query;
        public void ConnectToSqlDB () {
            try {
//connect to the database and create the Prepared Statements
//latest version jdbc driver
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(DATABASE_URL, "root92", "0202");
                statement = connection.createStatement();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        public void insertDataFromArrayToSqlTable ( int num[], String sortAlgo, String database){
//---------------------------------
            try {
                for (int i = 0; i < num.length; i++) {
                    query = "insert into " + sortAlgo + "(element) values('" + num[i] + "')";
                    statement.executeUpdate(query);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        //---------------------------------------
        public ArrayList<String> readDataBase (String sortAlgo, String database){
            ArrayList<String> list = new ArrayList<String>();
            query = "select * from " + sortAlgo;
            try {
                resultSet = statement.executeQuery(query);
                while (resultSet.next()) {
                    list.add(resultSet.getString(1));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            return list;
        }
    }


