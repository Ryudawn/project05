package method;

public class Ex2 {
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 5;
		int sum = add(num1, num2);
		
		int sum2 = add(5,5);
		int sum3 = add(10,10);
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
	}
}
