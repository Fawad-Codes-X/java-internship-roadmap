public class Inheritance {

    public static class Animal{
        public void eat(){
            System.out.println("Animal is eating");
        }
    }

    public static class Dog extends Animal{
        public void sound(){
            System.out.println("Dog is barking");
        }
    }

    public static void main (String[] args){
        Dog obj = new Dog();
        obj.eat();
        obj.sound();

    }

}