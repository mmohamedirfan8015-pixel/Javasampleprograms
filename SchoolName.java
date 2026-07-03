class School{
    String schoolName="ABC sachool";
    class Student{
        String name="Arun";
        void display(){
            System.out.println("School:"+schoolName);
            System.out.println("Student:"+name);
        }
    }
}
public class SchoolName {
    public static void main(String[] args){
        School s=new School();
        School.Student a=s.new Student();
        a.display();
    }
}
