package leehj.codetest.reversestr;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 라이브러리 함수를 쓰지않고 문자열을 뒤집는 함수를 만들어라
 * 	main 처음 내가 쓴 답
 * 	reverse1 책예시1
 * 	reverse2 책예시2
 * 		-StringBuilder사용
 * 		-효율성
 * 
 * @author LEEHYUNJIN
 */
public class ReverseStringMain {

	public static void main(String[] args) {
		
		String str = "abcdef";
		List<String> listStr = new ArrayList<String>();
		
		int strLen = str.length();
		for(int i=strLen-1; i>=0; i--) {
			String subStr = str.substring(i, i+1);
			listStr.add(subStr);
			System.out.println("i: "+i);
		}
		StringBuilder sb = new StringBuilder();
		for(String strByList : listStr) {
			sb.append(strByList);
		}
		
		String reverseStr = sb.toString();
		
		System.out.println(reverseStr);
		
	}
	
	/**
	 * 책 예시1
	 */
	public static String reverse1(String in) {
		String out = "";
		for(int i = in.length(); i>=0; --i) {
			out += in.charAt(i);
		}
		
		return out;
		
	}
	
	/**
	 * 책 예시2
	 * 
	 */
	public static String reverse2(String in) {
		
		int len = in.length();
		StringBuilder out = new StringBuilder(len);
		for(int i=len-1; i>=0; i--) {
			out.append(in.charAt(i));
		}
		
		return out.toString();
	}

}
