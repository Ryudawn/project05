package method;

public class quiz4 {

	public static void num(int n1,int n2) {
		int min =0;
		if(n1 < n2) {
			System.out.println(-999);
		}else {
			min = n1-n2;
			
			System.out.println(min);
		}
	}
	public static void main(String[] args) {
		num(4,2);
	}

}
