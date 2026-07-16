public class Employee {

    private int employeeID;
    private int age;
    private String name;
    private String department;
    private String country;
    private String city;
    private double salary;

    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = 60;
    private static final double MIN_SALARY = 0;


    public Employee(int employeeID, String name, String department,
                    String country, String city, int age, double salary) {

        setEmployeeID(employeeID);
        setName(name);
        setDepartment(department);
        setCountry(country);
        setCity(city);
        setAge(age);
        setSalary(salary);
    }


    public int getEmployeeID() {
        return employeeID;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public double getSalary() {
        return salary;
    }



    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {

        if (name == null) {
            System.out.println("Name cannot be null");
            return;
        }

        name = name.trim();

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty");
            return;
        }

        this.name = name;
    }

    public void setAge(int age) {

        if (age < MIN_AGE) {
            System.out.println("Age should be at least " + MIN_AGE);
            return;
        }

        if (age > MAX_AGE) {
            System.out.println("Age should not be greater than " + MAX_AGE);
            return;
        }

        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSalary(double salary) {

        if (salary <= MIN_SALARY) {
            System.out.println("Invalid Salary Input");
            return;
        }

        this.salary = salary;
    }

    // Display Method
    public void displayResult() {

        System.out.println("Employee ID         : " + getEmployeeID());
        System.out.println("Employee Name       : " + getName());
        System.out.println("Employee Age        : " + getAge());
        System.out.println("Employee Department : " + getDepartment());
        System.out.println("Employee Country    : " + getCountry());
        System.out.println("Employee City       : " + getCity());
        System.out.println("Employee Salary     : " + getSalary());
    }

    public static void main(String[] args) {

        System.out.println("Employee 1");
        Employee emp1 = new Employee(
                1102,
                "Fawad",
                "IT",
                "Pakistan",
                "Islamabad",
                130,
                100000
        );

        emp1.displayResult();

        System.out.println("\n-----------------------------\n");

        System.out.println("Employee 2");
        Employee emp2 = new Employee(
                1103,
                "   Ali   ",
                "HR",
                "Pakistan",
                "Lahore",
                25,
                50000
        );

        emp2.displayResult();
    }
}