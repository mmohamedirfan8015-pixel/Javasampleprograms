
import java.util.Scanner;

class Student {
    void student() {
        
        System.out.println("This is Student age");
    }
}

public class InputMismatchException1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Age: " + age);
sc.nextLine();
        
        Student s = new Student();
        s.student();
        sc.close();
    }
}
