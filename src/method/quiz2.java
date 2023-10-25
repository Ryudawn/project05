package method;

public class quiz2 {
	
	public static void dif(int n1,int n2) {
		int res = 0;
		if(n1 > n2) {
			res = n1;
			System.out.println(res);
		}else if(n1 < n2){
			res = n2;
			System.out.println(res);
		}else {
			System.out.println("값이 같습니다");
		}
		
		
	}
	
	public static void main(String[] args) {
		dif(5,5);
	}
}
