
public class twoDimensionalArraySearch {

	public static void main(String[] args) {
		int[][] matrix = new int[8][8];
		int max = 0;
		int maxX = 0;
		int maxY = 0;
		for(int i = 0; i <= 7;i++) {
			for(int u = 0; u <=7;u++) {
				matrix[i][u] = (int)(Math.random() * 99 + 1);
				System.out.print(matrix[i][u]);
				if(matrix[i][u] < 10) {
					System.out.print("  ");
				}
				else {
					System.out.print(" ");
				}
				System.out.print("|");
				if(max == 0) {
					max = matrix[i][u];
				}
				else {
					if(max < matrix[i][u]) {
						max = matrix[i][u];
						maxY =u;
						maxX=i;
					}
				}
				
			}
			System.out.println();
		}
		System.out.print("The maximum value in the matrix is "+max+" and its position is "+maxX+","+maxY);
	}

}
