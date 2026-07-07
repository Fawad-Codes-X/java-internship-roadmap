import java.util.Scanner;

public class SalaryCalculator {

    String name;
    double baseSalary;
    double bonusPercentage;
    double taxPercentage;


    public void getEmployeeDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        name = sc.nextLine();

        System.out.println("Enter Your Base Salary");
        baseSalary = sc.nextDouble();

        System.out.println("Enter Bonus Percentage");
        bonusPercentage = sc.nextDouble();

        System.out.println("Enter Tax Percentage");
        taxPercentage = sc.nextDouble();

        sc.close();
    }


    public void calculateSalary(){
        double bonusAmount = baseSalary * bonusPercentage / 100;
        double bonusSalary = baseSalary + bonusAmount;

        double taxAmount = bonusSalary * taxPercentage / 100;
        double finalSalary = bonusSalary - taxAmount;

        System.out.println("Employee Name : " + name);
        System.out.println("Base Salary : " + baseSalary);
        System.out.println("Bonus Percentage : " + bonusPercentage);
        System.out.println("Bonus Amount : " + bonusAmount);
        System.out.println("Salary After Bonus : " + bonusSalary);
        System.out.println("Tax Percentage : " + taxPercentage);
        System.out.println("Tax Amount : " + taxAmount);
        System.out.println("Final Salary : " + finalSalary);
    }


    public static void main(String[] args){
        SalaryCalculator obj = new SalaryCalculator();
        obj.getEmployeeDetails();
        obj.calculateSalary();
    }
}