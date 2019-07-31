package Homework1;
import java.util.Scanner;
public class Triangle {
	public static void main(String arg[]) {
		System.out.println("Please select an option:\n1).Equilateral\n2).RightFacing\n3).LeftFacing\n4).Downward\n5).All");
		//Main Menu for triangle selection
		Scanner scan = new Scanner(System.in); //set up scanner to take input
		int triangleType=scan.nextInt();//user input for triangle type
		
		System.out.println("Please enter a size:");
		int size=scan.nextInt();//user input for triangle size
		
		switch(triangleType) {//interpret user input for triangle
		  case 1:
		    equilateral(size);
		    break;
		  case 2:
			  System.out.println("Right Triangle:");
			  rightFacing(size);
		    break;
		  case 3:
			  leftFacing(size);
			break;
		  case 4:
			  downward(size);
			break;
		  case 5:
			  equilateral(size);
			  leftFacing(size);
			  rightFacing(size);
			  downward(size);
			  break;
		  default:
		    System.out.println("Invalid Option selected, please enter a number 1-5");
		}
		scan.close();
	}
	public static void rightFacing(int input) {
		for(int i = 0;i < input;i++) {
			for(int u = 0;u < i+1;u++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
	}
	public static void leftFacing(int input) {
		int count = input * 2;
		for(int i = 0;i < input;i++) {
			for(int u = count;u > 0;u--) {
				System.out.print(" ");
			}
			for(int u = 0;u < i+1;u++) {
				System.out.print("* ");
			}
			System.out.print("\n");
			count = count -2;
		}
	}

	public static void equilateral(int input) {
		int count = input;
		for(int i = 0;i < input;i++) {
			for(int u = count;u > 0;u--) {
				System.out.print(" ");
			}
			for(int u = 0;u < i+1;u++) {
				System.out.print("* ");
			}
			System.out.print("\n");
			count --;
		}
	}

	public static void downward(int input) {
		int count = input;
		for(int i = 0;i < input;i++) {
			for(int u = i;u > 0;u--) {
				System.out.print(" ");
			}
			for(int u = count;u > 0;u--) {
				System.out.print("* ");
			}
			System.out.print("\n");
			count --;
		}
	
	}

}
