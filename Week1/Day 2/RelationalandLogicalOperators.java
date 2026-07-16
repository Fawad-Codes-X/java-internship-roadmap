public class RelationalandLogicalOperators {

    String empName = "Ahmad";
    int age = 21;
    int experience = 4;
    double salary = 200000;
    boolean isPermanent = true;

    public void checkEligibility(){
        if(age >=21 && experience >=3){
            if(salary <=50000 || isPermanent){
                System.out.println("You are eligible for bonus");
            }
        }
        else{
            System.out.println("Not Eligible For Bonus");
        }
    }


    public static void main(String[] args){
        RelationalandLogicalOperators obj = new RelationalandLogicalOperators();
        obj.checkEligibility();
    }
}
