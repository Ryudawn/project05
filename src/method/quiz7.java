package method;

public class quiz7 {

	public static void sum(int n1) {
		int sum = (n1/100) + (n1/10%10) + (n1 % 10);
		System.out.println(sum);
	}
	public static void main(String[] args) {
		sum(273);
	}
}
