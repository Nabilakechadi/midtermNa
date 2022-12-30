/*package design;
public interface Employee {
    class EmployeeDetails {
        //Creating properties of Employee class
        int employee_id;
        int salary;
        int benefitLayout;
        String name;
        String department;

        //Getter and setters for getting and setting properties


	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
        //please read the following method and understand the business requirements of these following methods
        //and then implement these in a concrete class.

        //employeeId() will return employee id.
       /* public int getEmployee_id() {
            return employee_id;
        }


        //employeeName() will return employee name
        public String getEmployeeName() {
            return name;
        }

        //assignDepartment() will assign employee to departments
        public void getDepartment() {
            return department;
        }

        //calculate employee salary
        public int getSalary() {
            return salary;
        }

        //employee benefit
        public void getBenefitLayout() {
            return benefitLayout;
        }

        public String toString() {
            return "Employee [emp_id = " + employee_id + ",name = " + name + ", + ",
            department = " + department +", salary = " + salary + "
            ",benefitlayout = " + benefitLayout() + "]";
        }*/


        //Creating main class

        //main() method start
       /* public static void main(String args[]) {

            //Creating object of EmployeeDetails class
            EmployeeDetails emp = new EmployeeDetails();
            //Setting values to the properties
            emp.getEmployee_id(101);
            emp.getEmployeeName("Nabila");
            emp.getDepartment("IT");
            emp.getSalary(15000);
            emp.getBenefitLayout(30);
            //Showing Employee details
            System.out.println(emp);
        }
    }
}*/


           /* //Getting salary using getter
            int sal = emp.getSalary();
            int increment = 0;
            //Incrementing salary based on condition
            if ((sal >= 1000) && (sal <= 1500)) {
                //incrementing salary 2%
                increment += (sal * 2) / 100;
                sal = sal + increment;

                emp.setSalary(sal);
                System.out.println("\n Salary is incremented \n");
                System.out.println(emp);

            } else if ((sal >= 1500) && (sal <= 20000)) {
                //incrementing salary 5%
                increment += (sal * 5) / 100;
                sal = sal + increment;

                emp.setSalary(sal);
                System.out.println("\n Salary is incremented \n");
                System.out.println(emp);
            } else {
                System.out.println("\n Salary is not incremented \n");
                System.out.println(emp);
            }
        }*/

