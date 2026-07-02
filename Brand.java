class Mobile{
    String brand="Samsung";
    class Battery{
        void show(){
            System.out.println("Battery belongs to "+brand);
        }
    }
}
public class Brand {
    public static void main(String[] args){
        Mobile m=new Mobile();
        Mobile.Battery b=m.new Battery();
        b.show();
    }
    
}
