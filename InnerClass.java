class Car{
    static String company="BMW";
    class Engine{
        void start(){
            System.out.println("Engine Started");
            System.out.println("Company:"+company);
        }
    }
}
public class InnerClass {
    public static void main(String[] args){
            Car c=new Car();
            Car.Engine e=c.new Engine();
            e.start();
    }   
}
