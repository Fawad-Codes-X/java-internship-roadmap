package Week3.Day1;

public class GenericsBasics {
    static class Box <T>{
        private T item;

        public void setItem(T item){
            this.item = item;
        }

        public T getItem(){
            return item;
        }
    }

    public static void main(String[] args){
        Box<String> b = new Box<>();
        b.setItem("Hello");
        System.out.println(b.getItem());
    }
}
