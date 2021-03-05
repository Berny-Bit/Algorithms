
public class Percolation {

    private int[][] grid;
    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n){
        if(n<0){
            throw new IllegalArgumentException("integer got to be positive");
        }
        grid = new int [n][n];
        // the grid is initially blocked; blocked = 0; open = 1;
        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                grid[i][j] = 0;
            }
        }

    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col){
         if (row<0 || col < 0){
            throw new IllegalArgumentException();
         }
         if(grid[row][col] != 1){
             grid[row][col] = 1;
         }
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col){
        if (row<0 || col < 0){
            throw new IllegalArgumentException();
        }
        return grid[row][col] == 1;
    }

    // is the site (row, col) full? TODO
    public boolean isFull(int row, int col){
        if (row<0 || col < 0){
            throw new IllegalArgumentException();
        }
        return true;
    }

    // returns the number of open sites TODO
    public int numberOfOpenSites() {
        return 0;
    }

    // does the system percolate? TODO
    public boolean percolates(){
        return true;
    }
    public static void main(String[] args) {

    }
}
