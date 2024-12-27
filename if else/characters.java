import java.util.Scanner;
public class characters {
    public static void main(String[] Args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter your character");
        char c = myObj.next().charAt(0);
        System.out.println(c);
        /* so the default value index of char input from user starts from 0,
        don't use index 1 as default index is 0 */
        if (c >= 'a' && c <= 'z') {
            System.out.println("character is lowercase alphabet");
        } else if (c >= 'A' && c <= 'Z') {
            System.out.println("entered character is uppercase");
        } else {
            System.out.println("entered character is symbol not letter");
        }
    }
}