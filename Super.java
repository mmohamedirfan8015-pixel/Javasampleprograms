class Animal{
    String color="black";
}
class Dog extends Animal{
    String color="white";
    void display(){
        System.out.println("Child color:"+color);
        System.out.println("Parent color:"+super.color);
    }
}
public class Super {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.display();
    }
}
