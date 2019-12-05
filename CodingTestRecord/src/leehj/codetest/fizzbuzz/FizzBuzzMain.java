package leehj.codetest.fizzbuzz;

public class FizzBuzzMain {
	
	/**
	 * FizzBuzz 코드테스트
	 * 		1 - 100 숫자중
	 * 		3으로 나눠지는 숫자 Fizz출력
	 * 		5로 나눠지는 숫자 Buzz출력
	 * 		3과5로 나눠지는숫자 FizzBuzz출력
	 */
	public static void main(String[] args) {
		
		for(int i=1; i<101; i++) {
			
			boolean divByThree = ( i % 3 == 0);
			boolean divByFive = ( i % 5 == 0);
			
			if(divByThree&&divByFive) {
				System.out.println("FizzBuzz: "+i);
			} else if(divByThree) {
				System.out.println("Fizz "+i);
			} else if(divByFive) {
				System.out.println("Buzz "+i);
			}
		}
	}
}
