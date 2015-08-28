import java.util.Map;

public class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        if(grid==null)return 0;
        int y=grid.length;
        if(y==0)return 0;
        int x=grid[0].length;
        //System.out.println("x:"+x);
        if(x==0)return 0;
        for(int i=0;i<y;i++)
        	for(int j=0;j<x;j++){
        		if(grid[i][j]=='1'){
        			clearIslands(grid, y, x, i, j);
        			count++;
        		}
        	}
        return count;
    }
private void clearIslands(char[][] grid,int row,int column,int i,int j){
	if(i<0||i>row-1||j<0||j>column-1||grid[i][j]=='0') return;
	grid[i][j]='0';
	clearIslands(grid, row, column, i-1, j);
	clearIslands(grid, row, column, i+1, j);
	clearIslands(grid, row, column, i, j+1);
	clearIslands(grid, row, column, i, j-1);
}
}