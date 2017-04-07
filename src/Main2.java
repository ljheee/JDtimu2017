import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 * 
 * @author Administrator
 *
 */
public class Main2 {
	
	public static int n;
	public static int k;
	public static int curSum=0;
	static Random random = new Random();
	
	/**
	 * 从控制台读取n、k
	 */
	public static void readNum(){
		Scanner sc = new Scanner(System.in);
		String line[] = sc.nextLine().split(" ");
		n = Integer.parseInt(line[0]);
		k = Integer.parseInt(line[1]);
		sc.close();
	}
	
	
	
	
	public static int getResult(){
		
		readNum();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		while(curSum<n){
			list.add(k);
			curSum = sum(list);
			
			if(n-curSum>k+1){
				list.add(k+1);
			}
			if(n-curSum<k){
				break;
			}
			
		}
		int result = list.size();
		if(list.get(list.size()-1)==list.get(list.size()-2) ){
			result--;
		}
		return result;
	}

	private static int sum(ArrayList<Integer> list) {
		int sum = 0;
		for (Integer i : list) {
			sum+=i;
		}
		return sum;
	}


	public static void main(String[] args) {

		
		int result = getResult();
		System.out.println(result);
	}

}
