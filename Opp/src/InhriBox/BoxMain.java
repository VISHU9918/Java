package InhriBox;

public class BoxMain {
 public static void main(String[] args) {
     Box3D box3D = new Box3D(5, 3, 4);
     System.out.println("Area: " + box3D.area());
     System.out.println("Volume: " + box3D.volume());
 }
}
