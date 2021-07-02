package chap07.test;

public class RecCalculator implements Calculator {

	@Override
	public long factorial(long num) {
        long start = System.currentTimeMillis();
        try {
            if (num == 0)
                return 1;
            else
                return num * factorial(num - 1);
        }finally {
            long end = System.currentTimeMillis();

            //start와 end 시간을 구해서 차이를 구하면 된다.
        }

	}

}
