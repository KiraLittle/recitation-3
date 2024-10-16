import java.util.Scanner;

public class Recitation3 {
    public static void main(String[] argv)
    {
        Scanner scan = new Scanner(System.in);

        // add your code here
        System.out.println("Enter x:");
        System.out.println("Enter y:");
        int x = scan.nextInt();
        int y = scan.nextInt();
        Circle circle16 = new Circle(new Point(x,y),16);
        Circle circle40 = new Circle(new Point(14,12),40);
        if (circle16.intersects(circle40)) {
            System.out.println(true);
        } else{
            System.out.println(false);
        }


    }
}
