package cui;

public class oefening8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tot =0;
		
		for(int i = 1; i<=500;i++) {
			if(i % 12 == 0) {// i is deelbaar door 12
			 tot += i; 
			 System.out.println(tot);
			 }
			
		}
	}

}
