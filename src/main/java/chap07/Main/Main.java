package chap07.Main;

import chap07.test.ExeTimeCalculator;
import chap07.test.ImpeCalculator;
import chap07.test.RecCalculator;

public class Main {
    public static void main(String[] args) {
        RecCalculator ttCal1 = new RecCalculator( );
        long start = System.currentTimeMillis();
        int num = 3;
        ttCal1.factorial(num);
        long end = System.currentTimeMillis();
        System.out.printf("RecCalculator(%d) 실행시간 %d \n",num,(end-start));

    }
}
