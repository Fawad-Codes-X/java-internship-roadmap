import java.util.Scanner;

public class SwitchStatements {

    String empName;
    int empID;
    int depNumber;

    public void getEmpDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        empName = sc.nextLine();
        System.out.println("Enter Your Employee ID : ");
        empID = sc.nextInt();
        System.out.println("Enter Your Department Number : ");
        depNumber = sc.nextInt();
    }

    public void showDetails(){
        switch (depNumber){
            case 1 -> System.out.println("HR Department");

            case 2 -> System.out.println("IT Department");

            case 3 -> System.out.println("Finance Department");

            case 4 -> System.out.println("Marketing Department");

            case 5 -> System.out.println("Sales Department");

            default -> System.out.println("Invalid Input For Department....!");
        }
    }

    public static void main(String[] args){
        SwitchStatements obj = new SwitchStatements();
        obj.getEmpDetails();
        obj.showDetails();
    }
}