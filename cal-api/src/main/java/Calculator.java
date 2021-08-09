public class Calculator {

    void add(final int number1, final int number2) {
        int sum;
        sum = number1 + number2;
        System.out.println("The sum is: " + sum);
    }


    void sub(final int number1, final int number2) {
        int sub;
        sub = number1 - number2;
        System.out.println("The sub is: " + sub);
    }
    void mul(final int number1, final int number2) {
        int mul;
        mul = number1 * number2;
        System.out.println("The mul is: " + mul);
    }
    void div(final double number1, final double number2) {
        double div;
        div = number1 / number2;
        System.out.println("The div is: " + div);
    }
}
