import java.util.Scanner;

class Person {
    String name;

    void getName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        sc.close();
    }
}

class Student extends Person {
    void display() {
        System.out.println("Student Name: " + name);
    }
}

class singleuserinput {
    public static void main(String[] args) {
        Student s = new Student();

        s.getName();
        s.display();
    }
}