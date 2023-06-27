package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        byte a, b, c, d;
        a =  (byte) (number / 1000);
        b = (byte) ((number / 100) % 10);
        c = (byte) ((number % 100) / 10);
        d = (byte) (number % 10);
        System.out.println(a + b + c + d);
    }
}
