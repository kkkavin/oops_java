class Calculator {
    private int num;

    public Calculator(int num) {
        this.num = num;
    }

    public int sumOfDigits() {
        int sum = 0, temp = num;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }
}

public class Tester {
    public static void main(String[] args) {
        Calculator calc = new Calculator(1234);
        int result = calc.sumOfDigits();
        System.out.println("The sum of the digits is: " + result);
    }
}
