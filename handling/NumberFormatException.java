public class NumberFormatException{
    public static void main(String[] args) {

        try {

            String value = "123";

            int number = Integer.parseInt(value);

            System.out.println(number);

        } catch (Exception e) {

            System.out.println("Invalid number! Please enter only numeric values.");

        }

        System.out.println("Program End");
    }
}