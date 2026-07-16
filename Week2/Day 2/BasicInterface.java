public class BasicInterface {

    interface Vehicle{
        void changeGear(int a);
        void speedUp(int a);
        void applyBrakes(int a);
    }

    static class Bicycle implements Vehicle{
        int speed;
        int gear;

        @Override
        public void changeGear(int newGear){
            gear = newGear;
        }

        @Override
        public void speedUp(int increment){
            speed = speed + increment;
        }

        @Override
        public void applyBrakes(int decrement){
            speed = speed - decrement;
        }

        public void printStates(){
            System.out.println("Speed : " + speed + " Gear : " + gear);
        }

    }

    static class Car implements Vehicle{
        int speed;
        int gear;

        @Override
        public void changeGear(int newGear){
            gear = newGear;
        }

        @Override
        public void speedUp(int increment){
            speed = speed + increment;
        }

        @Override
        public void applyBrakes(int decrement){
            speed = speed - decrement;
        }

        public void printStates(){

            System.out.println("Speed : " + speed + " Gear : " + gear);
        }

    }


    public static void main(String[] args){
        Bicycle b = new Bicycle();
        b.changeGear(2);
        b.speedUp(3);
        b.applyBrakes(1);

        System.out.println("Bicycle Present State.... ");
        b.printStates();

        Car c = new Car();
        c.changeGear(1);
        c.speedUp(4);
        c.applyBrakes(2);

        System.out.println("Car Current State...");
        c.printStates();
    }

}