package lang.print.gaps.finalModuleTask;

public class NumberReverter {

    public void revert(int number) {
        byte a, b, c;
        a =  (byte) (number / 100);
        b = (byte) ((number / 10) % 10);
        c = (byte) (number % 10);
        System.out.println(c * 100 + b * 10 + a);

    }
}
