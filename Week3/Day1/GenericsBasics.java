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
        Box<Integer> b = new Box<>();
        b.setItem(12);
        System.out.println(b.getItem());
    }
}
