public class Polymorphism {

    static class Person{
        protected String name;
        protected int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
            System.out.println("Parent Constructor Called.");
        }

        public void displayInfo(){
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
        }

    }

    static class Employee extends Person{
        private int employeeId;
        private double salary;

        public Employee(String name, int age, int employeeId, double salary) {
            super(name, age);
            this.employeeId = employeeId;
            this.salary = salary;
        }


        //Method Overrding
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Employee ID : " + employeeId);
            System.out.println("Employee Salary : " + salary);
        }


        //Method Overloading
        public double calculateSalary(){
            return salary;
        }

        public double calculateSalary(double bonus){
            return salary + bonus;
        }

        public double calculateSalary(double bonus, double tax){
            return (salary + bonus) - tax;
        }

    }

    public static void main(String[] args){

        Person person = new Employee("Fawad", 22, 1102, 100000.0);

        System.out.println("\n===== Display Info =====");
        person.displayInfo();

        Employee emp = (Employee) person;

        System.out.println("\n===== Salary Calculations =====");
        System.out.println("Salary : " + emp.calculateSalary());
        System.out.println("Salary After Bonus : " + emp.calculateSalary(5000));
        System.out.println("Salary After Bonus & Tax : " + emp.calculateSalary(5000, 2000));

    }

}