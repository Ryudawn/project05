package method;

public class quiz3 {
	
	public static void inp(int n1,int n2) {
		int sum =0;
		for(int i = n1; i <= n2; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		inp(5,10);
	}
}
