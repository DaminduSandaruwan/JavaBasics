
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Your Name");

        String userName = myObj.nextLine();
        System.out.println("User Name is : " + userName);
        myObj.close();
    }
}
