package design;

import java.io.*;





import java.sql.*;

import java.util.Scanner;

/*public class EmployeeInfo {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	/*static String companyName;
	
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	/*public EmployeeInfo(int employeeId){
		
	}
    public EmployeeInfo(String name, int employeeId){
		
	}*/
	
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	/*public static int calculateEmployeeBonus(int numberOfYearsWithCompany){
		int total=0;
		return total;
	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
/*	public static int calculateEmployeePension(){
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
		//Calculate pension



		return total;
	}
	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}*/




/*public class EmployeeInfo{

	private int Emp_id;

	private String Emp_name;

	private int Emp_age;

	public int getid(){

		return Emp_id;

	}

	public void setid(){

		this.Emp_id=Emp_id;

	}

	public String getname(){

		return Emp_name;

	}

	public void setname(){

		this.Emp_name=Emp_name;

	}

	public int getage(){

		return Emp_age;

	}

	public void setage(){

		this.Emp_age=Emp_age;

	}

}

public class FortuneEmployee extends HttpServlet

{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IoException,ServletException

	{

		ResultSet rs;

		PrintWriter out=res.getWriter();

		res.setContentType("text/html");

		out.println("<html><body>");

		try

		{

			EmployeeInfo info=new EmployeeInfo();

			info.setid(Integer.parseInt(request.getParameter("Emp_id")));

			Class.forName("oracle.jdbc.driver.OdbcDriver");

			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"."system","abc123");

			PreparedStatement ps=con.prepareStatement("Select * from employee where Emp_id=?");

			rs=ps.executeQuery();

			ps.setInt(1,info.getid());

			out.println("table border=1 width=50% height=50%>");

			out.println("<tr><th>Employee name</th><th>Employee age</th></tr>");

			while(rs.next())

			{

				String name=rs.getString("Emp_name");

				int age=rs.getInt("Emp_age");

				out.println("<tr><td>" + name + "</td><td>" + age + " </td> </tr>");

			}

			out.println("</table>);

					out.println("</html></body>");

			con.close();

		}

		catch(Exception e)

		{

			out.println("error");

		}

	}

}*/