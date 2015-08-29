
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		int n =0;
		int[][] answer = solution.generateMatrix(n);
		for(int i=0;i<n;i++)
			for(int j= 0;j<n;j++)
			{
				if(j==n-1)
				System.out.println(answer[i][j]+"  ");
				else System.out.print(answer[i][j]+"  ");
			}
		
		
	}

}
