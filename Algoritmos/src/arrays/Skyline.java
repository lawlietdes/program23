package arrays;

public class Skyline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
public int maxIncreaseKeepingSkyline(int[][] grid) {
        
        int leftrigthmax[]=new int[grid.length];
        int topbottonmax[]=new int[grid[0].length];
        int maxtotal=0;
       
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]>leftrigthmax[i])leftrigthmax[i]=grid[i][j];  
                
            }
        }
        
        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]>topbottonmax[i])topbottonmax[i]=grid[j][i];  
                
            }
        }
        
        for(int i=0; i<leftrigthmax.length;i++){
            for(int j=0; j<topbottonmax.length;j++){
                //resta=Math.min(leftrigthmax[i],topbottonmax[j])-grid[i][j];
                //System.out.println("["+leftrigthmax[i]+"],["+topbottonmax[j]+"]-"+grid[i][j]+"="+resta);
                maxtotal+=Math.min(leftrigthmax[i],topbottonmax[j])-grid[i][j];
                
            }
        }
        
        return maxtotal;
    }

}
