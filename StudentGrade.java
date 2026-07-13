import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        double average;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        average = total / 5.0;
        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average = " + average);
        if (average >= 90) {
            System.out.println("Grade: A+");
        } else if (average >= 80) {
            System.out.println("Grade: A");
        } else if (average >= 70) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else if (average >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
         sc.close();
    }
}