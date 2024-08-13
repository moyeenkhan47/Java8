public interface MyInterface {
    default void sayHello(){
        System.out.println("Hello");
    }
  public  class Child implements MyInterface{
    @Override
    public void sayHello(){
        System.out.println("Hello in child class");
    }
    }
    public class MyClass{
        public static void main(String[] args) {
            Child c= new Child();
            c.sayHello();
        }
    }
}
