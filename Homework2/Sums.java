
public class Sums {
	
	public static void main(String arg[]) {
		int sum = 0;
		for(String c : arg) {
			try {
				sum = sum + Integer.parseInt(c);
			}
			catch(NumberFormatException nfe){
	            System.out.println("The first argument must be an integer.");
	            System.exit(1);
			}
			}
		System.out.println(sum);
	}
}
