package chap07.test;

public class ImpeCalculator implements Calculator {

	@Override
	public long factorial(long num) {
		long start = System.currentTimeMillis();
		long result = 1;
		for (long i = 1; i <= num; i++) {
			result *= i;
		}

		long end = System.currentTimeMillis();

		System.out.printf("ImpleCalulator(%d) 실행시간 %d",num,(end-start));
		//start와 end 시간을 구해서 차이를 구하면 된다.

		return result;
	}

}
