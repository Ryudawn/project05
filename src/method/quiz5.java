package method;

public class quiz5 {

	public static void div(int num1, int num2) {

		int res = 0;
		
		if(num2 == 0) {
			System.out.println("나누는 수는 0이될 수 없습니다.");
			
		}else {
			res = num1/num2;
			System.out.println(res);
		}
		
	}
	
	public static void main(String[] args) {
		div(4,0);
	}
}

