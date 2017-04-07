import java.util.Scanner;

public class Main {
	
	public static int n;
	public static String a;
	public static String b;

	/**
	 * 从控制台读取三个数
	 */
	public static void readNum(){
//		System.out.println("please enter 3 num:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = sc.next().trim();
		b = sc.next().trim();
		sc.close();
	}
	
	public static int getResult(){
		
		readNum();//从控制台读取三个数
		
		int result = -1;
		String str = "";
		for (int i = 0; i < n; i++) {
			if(a.charAt(i)==b.charAt(i)){
				str+="0";
			}else{
				str+="1";
			}
		}
		
		result = Integer.valueOf(str,2);
		return result;
	}
	
	public static void main(String[] args) {
		
		int result = getResult();
		System.out.println(result);
	}
	
}
