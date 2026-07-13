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

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}