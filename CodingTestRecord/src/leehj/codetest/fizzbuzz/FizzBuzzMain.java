package leehj.codetest.fizzbuzz;

public class FizzBuzzMain {
	
	/**
	 * FizzBuzz �ڵ��׽�Ʈ
	 * 		1 - 100 ������
	 * 		3���� �������� ���� Fizz���
	 * 		5�� �������� ���� Buzz���
	 * 		3��5�� �������¼��� FizzBuzz���
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
