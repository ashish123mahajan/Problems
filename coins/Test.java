import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		List<String> coins=new ArrayList<>();
		int number= 1100; 
		for(int i=0;i<number;i++) {
			coins.add("H");
		}
		for(int i=2;i<=number;i++) {
			for(int j=1;j<number;j++) {
				if((j+1)%i==0) {
					coins.set(j, swap(coins.get(j)));
				}
				}
			}
		//System.out.println(coins);
		System.out.println(coins.stream().filter(face -> face.equals("H")).count());
	}
	
	private static String swap(String face) {
		if(face.equals("H")) {
			return "T";
		}else {
			return "H";
		}
	}

}