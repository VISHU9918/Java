package inheritance.Method;

public class Main {
 public static void main(String[] args) {
     Parent parent = new Parent();
     parent.display();

     Child child = new Child();
     child.display();

     Parent childAsParent = new Child();
     childAsParent.display();
 }
}
