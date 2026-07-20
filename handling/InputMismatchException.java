import java.util.Scanner;

public class  InputMismatchException{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter your age: ");

            int age = sc.nextInt();

            System.out.println("Age: " + age);

        } catch (Exception e) {

            System.out.println("Invalid input! Please enter a valid number.");

        }

        sc.close();
    }
}