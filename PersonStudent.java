class Person{
    String name="Rahul";
}
class Student extends Person{
    String name="Kumar";
    void display(){
        System.out.println("Student Name:"+name);
        System.out.println("Person name:"+super.name);
    }
}
public class PersonStudent {
    public static void main(String[] args) {
        Student s=new Student();
        s.display();
    }  
}
