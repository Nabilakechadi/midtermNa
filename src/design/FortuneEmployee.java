package design;
import java.io.*;


/*public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
/*	public static void main(String[] args) {
		




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

		}



}*/
package employee.info.system;

import java.io.*;

import javax.servlet.*;

import javax.servlet.http.*;

import java.sql,*;

public class EmployeeInfo{

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

}