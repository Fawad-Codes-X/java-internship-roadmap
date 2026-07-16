public class ClassesBasic {

   public class Employee {

        int employeeID;
        String name;
        String department;
        double salary;



        public Employee(int empID, String n, String dep, double sal) {
            employeeID = empID;
            name = n;
            department = dep;
            salary = sal;
        }

        public void displaySalary() {
            System.out.println("Employee ID : " + employeeID);
            System.out.println("Employee Name : " + name);
            System.out.println("Employee Department : " + department);
            System.out.println("Employee Salary : " + salary);

        }

        public void increaseSalary(){
            salary = salary + 50000;
        }


    }

    public static void main(String[] args){

      ClassesBasic cb = new ClassesBasic();
      Employee obj1 = cb.new Employee(1122, "Fawad", "IT", 100000);
      obj1.displaySalary();
      obj1.increaseSalary();
      obj1.displaySalary();


    }

}