package method;

public class quiz6 {

	
	public static void cal(int n1, int n2, char ch) {
		int res = 0;
		
		if(ch == '+') {
			res = n1+n2;
		}else if(ch == '-') {
			res = n1-n2;
		}else if(ch == '*') {
			res = n1*n2;
		}else if(ch == '/') {
			res = n1/n2;
		}
		System.out.println(res);
		
	}
	
	public static void main(String[] args) {
		cal(12,3,'/');
	}
}
