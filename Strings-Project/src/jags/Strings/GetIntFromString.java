package jags.Strings;

public class GetIntFromString {

	public static void main(String[] args) {
		
		String str="123456";
		System.out.println("integer value is : "+getIntValue(str));
		
	}

	private static int getIntValue(String str) {
		char ch;
		int result=0;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			result=result*10+ch-'0';
		}
		
		return result;
	}

}
