package design;





public interface Employee {

/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
    //please read the following method and understand the business requirements of these following methods
    //and then implement these in a concrete class.


    public static void main(String[] args) {
        private int Emp_id;

        private String Emp_name;

        private String Emp_department;
        private int Emp_salary;
        private int Emp_benefit;

        public int getid () {

            return Emp_id;

        }

        public void setid () {

            this.Emp_id = Emp_id;

        }

        public String getname () {

            return Emp_name;

        }

        public void setname () {

            this.Emp_name = Emp_name;

        }

        public int getdeprtment () {

            return Emp_department;

        }

        public void setdepartment () {

            this.Emp_department = Emp_department;

        }
        public int getsalary () {

            return Emp_salary;

        }

        public void setsalary () {

            this.Emp_salary = Emp_salary;
        }
        public int getdeprtment () {

            return Emp_department;

        }

        public void setbenefit () {

            this.Emp_benefit = Emp_benefit;
        }
    }
}
}