import java.util.Scanner;

public class ElectricityBillCalculator {


    static final int FIRST_SLAB_RATE = 10;
    static final int SECOND_SLAB_RATE = 15;
    static final int THIRD_SLAB_RATE = 20;
    static final int FOURTH_SLAB_RATE = 25;


    String customerName;
    int customerId;
    int unitsConsumed;
    double ratePerUnit;
    double totalBill;

    public void getCustomerDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        customerName = sc.nextLine();
        System.out.println("Enter Customer ID : ");
        customerId = sc.nextInt();
        System.out.println("Enter Units Consumed : ");
        unitsConsumed = sc.nextInt();
    }

    public void calculateBill(){
        if(unitsConsumed <= 100){
            ratePerUnit = FIRST_SLAB_RATE;
            totalBill = ratePerUnit * unitsConsumed;
        } else if (unitsConsumed >=101 && unitsConsumed<=200) {
            ratePerUnit = SECOND_SLAB_RATE;
            totalBill = ratePerUnit * unitsConsumed;
        } else if (unitsConsumed >=201 && unitsConsumed<=300) {
            ratePerUnit = THIRD_SLAB_RATE;
            totalBill = ratePerUnit * unitsConsumed;
        }
        else {
            ratePerUnit = FOURTH_SLAB_RATE;
            totalBill = ratePerUnit * unitsConsumed;
        }
    }

    public void showResults(){
        System.out.println("Customer Name : " + customerName);
        System.out.println("Customer ID : " + customerId);
        System.out.println("Units Consumed : " + unitsConsumed);
        System.out.println("Total Bill : " + totalBill);
    }

    public static void main(String[] args){
        ElectricityBillCalculator obj = new ElectricityBillCalculator();
        obj.getCustomerDetails();
        obj.calculateBill();
        obj.showResults();
    }
}