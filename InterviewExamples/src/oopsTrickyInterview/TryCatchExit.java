package oopsTrickyInterview;

public class TryCatchExit {

	public static void main(String[] args) {
		try {
			System.out.println("try");
			System.out.println(10/0);
		}catch(Exception e) {
			System.exit(-1);
		}
		finally {
			System.out.println("finally");
		}
	}

}
