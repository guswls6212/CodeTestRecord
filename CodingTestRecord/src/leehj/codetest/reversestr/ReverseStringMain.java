package leehj.codetest.reversestr;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * ���̺귯�� �Լ��� �����ʰ� ���ڿ��� ������ �Լ��� ������
 * 	main ó�� ���� �� ��
 * 	reverse1 å����1
 * 	reverse2 å����2
 * 		-StringBuilder���
 * 		-ȿ����
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
	 * å ����1
	 */
	public static String reverse1(String in) {
		String out = "";
		for(int i = in.length(); i>=0; --i) {
			out += in.charAt(i);
		}
		
		return out;
		
	}
	
	/**
	 * å ����2
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
