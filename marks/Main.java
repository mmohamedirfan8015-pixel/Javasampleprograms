package marks;

import marks.overall.result;
import marks.overall.studentnames;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        result s1;
        s1 =new result();
        s1.display();
        studentnames s2;
        s2 =new studentnames();
        s2.names();
    }
}
