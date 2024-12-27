import java.util.Scanner;
public class area {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter radius");
        double r = myObj.nextDouble();
        System.out.println("area of circle is " + 3.14*r*r);
    }
}
