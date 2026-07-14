public class Polymorphism {

    static class Person{
        protected String name;
        protected int age;

        public Person(String name, int age){
            this.name;
            this.age;
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

    }

    public static void main(String[] args){

    }

}