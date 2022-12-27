package datastructure;
import java.io.IOException;
import java.io.InputStream;


import java.nio.file.Files;
import java.nio.file.Paths;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;


/*public class MysqlConnect {

/*	public static Connection load() {
		Properties prop = new Properties();
		try {
			InputStream ism = Files.newInputStream(Paths.get("C:sers\nabil\IdeaProjects\midterm-coding-exam\src\secret.properties");
			prop.load(ism);
			ism.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return prop;
		public static Connection connectToMySQL() {
			Properties prop = load();
			String driverClass = prop.getProperty("MYSQLJDBC.driver ");
			String url = prop.getProperty("MYSQLJDBC.url");
			String username = prop.getProperty("MYSQLJDBC.userName");
			String password = prop.getProperty("MYSQLJDBC.password ");
			try {
				Class.forName(driverClass);
			} catch (ClassNotFoundException e) {
				throw new RuntimeException(e);
			}
			Connection connect = null ;
			try{
				
				connect = DriverManager.getConnection(url, username, password);

			} catch (SQLException e) {
				throw new RuntimeException(e);

			}
			
			System.out.println("database is connected ");
			return connect;

		}
		public static void main (String[] args) throws SQLException {
		ResultSet rs = connectToMySQL()
				 .PrepareStatement("select * from profile;").executeQuery();
			rs.toString()
		}
	}
}



		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */




							/*try{
								{
									Class<?> c = loadClassOrNull(cn, resolve);
									if (c == null)
										throw new ClassNotFoundException(cn);
									return c;
								}
//register driver class
								Class.forName("MYSQLJDBC.driver");
//establish connection
								Connection con = DriverManager.getConnection("MYSQLJDBC.url","MYSQLJDBC.username","MYSQLJDBC.password");
//execute queries
								Statement st = con.createStatement();
								ResultSet rs = st.executeQuery("select * from login");
								while(rs.next()){
									System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
								}
//close connection
								con.close();
							}
							catch(Exception e){
								e.printStackTrace();
							}
						}
					}*/