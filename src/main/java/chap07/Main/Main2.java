package chap07.Main;
import chap07.test.ExeTimeCalculator;
import chap07.test.ImpeCalculator;
import chap07.test.RecCalculator;

public class Main2 {
    public static void main(String[] args) {
        ExeTimeCalculator ttCal1 = new ExeTimeCalculator(new ImpeCalculator());
        System.out.println(ttCal1.factorial(20));

        ExeTimeCalculator ttCal2 = new ExeTimeCalculator(new RecCalculator());
        System.out.println(ttCal2.factorial(20));

    }
}
