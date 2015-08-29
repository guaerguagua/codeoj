/*模拟spiral来给matrix里面填入数据，规定四个方向，右下左上，注意边界条件的判断。
*/
public class Solution {
    public int[][] generateMatrix(int n) {
    	if(n==0)return new int[][]{};
        int[] directions =new int[]{0,1,2,3}; 
        int[][] matrix = new int[n][n];
        for(int i = 0;i<n;i++)
            for(int j = 0;j<n;j++){
                matrix[i][j]= 0;
            }
        int current = directions[0];
        int x= 0;
        int y = 0;
        matrix[x][y]=1;
        for(int i = 1;i<n*n;i++){
            switch(current){
            case 0:
                if(isOk(x,y+1,matrix,n))
                    matrix[x][++y]=i+1;
                else {
                    current=directions[1];
                    matrix[++x][y]=i+1;
                }
                break;
            case 1:
                if(isOk(x+1,y,matrix,n))
                    matrix[++x][y]=i+1;
                else {
                    current=directions[2];
                    matrix[x][--y]=i+1;
                }
                break;
            case 2:
                if(isOk(x,y-1,matrix,n))
                    matrix[x][--y]=i+1;
                else {
                    current=directions[3];
                    matrix[--x][y]=i+1;
                }
                break;
            case 3:
                if(isOk(x-1,y,matrix,n))
                    matrix[--x][y]=i+1;
                else {
                    current=directions[0];
                    matrix[x][++y]=i+1;
                }
                break;    
        }
        }
        
		
		return matrix;
    }
    private boolean isOk(int x,int y,int[][] matrix,int n){
        if(x>=0&&x<n&&y>=0&&y<n)
         if(matrix[x][y]==0)return true;
        return false;
    }
}