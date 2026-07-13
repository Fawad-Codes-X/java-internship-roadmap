public class Employee {

    private int employeeID, age;
    private String name;
    private String department;
    private String country;
    private String city;
    private double salary;

    private static final int MIN_AGE=18;
    private static final int MAX_AGE=60;
    private static final int MIN_SALARY=0;

    public Employee(int employeeID, String name, String department, String country, String city, double salary){
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.country = country;
        this.city = city;
        this.salary = salary;
    }


    public static void main(String[] args){

    }
}