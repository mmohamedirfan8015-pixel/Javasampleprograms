class Food{
    void taste(){
        System.out.println("spicy food");
    }
}
public class orderfood {
    public static void main(String[] args){
        Food myorder=new Food() {
            @Override
            void taste(){
                System.out.println("Extra Spicy taste");
            }
        };
        myorder.taste();
    }
}
