import java.util.Scanner;

public class ConditionalStatements {

    String name;
    int rollNo;
    int marks;
    int attendance;

    public void getStudentDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        name = sc.nextLine();
        System.out.println("Enter Your Roll Number : ");
        rollNo = sc.nextInt();
        System.out.println("Enter Your Marks : ");
        marks = sc.nextInt();
        System.out.println("Enter Attendance Percentage : ");
        attendance = sc.nextInt();`
    }

    public void checkResult(){
        if(marks < 50){
            System.out.println("You Are Failed...!");
        } else if (attendance < 75) {
            System.out.println("Failed Due To Low Attendance....!");
        } else if (marks >=90) {
            System.out.println("You Got A+ Grade.");
        } else if (marks >=80 && marks <=89) {
            System.out.println("You Got A Grade.");
        } else if (marks >=70 && marks <=79) {
            System.out.println("You Got B Grade.");
        }else if (marks >=60 && marks <=69) {
            System.out.println("You Got C Grade.");
        } else {
            System.out.println("You Got D Grade.");
        }

    }

    public static void main(String[] args){
        ConditionalStatements obj = new ConditionalStatements();
        obj.getStudentDetails();
        obj.checkResult();
    }

}