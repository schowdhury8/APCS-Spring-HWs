// Shayan Chowdhury
// APCS2 pd2
// HW10 -- [Freddie Mercury, Brian May, Roger Taylor, John Deacon] x n
// 2018-02-27

/***
 * class QueenBoard
 * Generates solutions for N-Queens problem.
 */

public class QueenBoard
{
  private int[][] _board;
  private int dim;
    
  public QueenBoard( int size ) 
  {
    dim = size;
    _board = new int[size][size];
  }

  
  /***
   * precondition: board is filled with 0's only.
   * postcondition: 
   * If a solution is found, board shows position of N queens, 
   * returns true.
   * If no solution, board is filled with 0's, 
   * returns false.
   */
  public boolean solve()
  {
    if (dim > 3) {
      solveH(dim - 1); 
      return true;
    }
      return false;
  }

  
  /**
   *Helper method for solve. 
   */
  private boolean solveH( int col ) //Why does this method return a boolean?
  {
    int r = 1;
    for (int c = 0; c <= col; c++) {
      if (r + 2 % (col + 1) < r % (col + 1)) { //According to my experimentation on paper, this should work. Yet here, it seems to fail for even numbers.
        r = 0;
      } else {
        addQueen(r % (col + 1), c);
      }
      
      r += 2;
    }
    return false;
  }


  public void printSolution()
  {
    /** Print board, a la toString...
        Except:
        all negs and 0's replaced with underscore
        all 1's replaced with 'Q'
    */
    String sol = "";
    for( int r = 0; r < _board.length; r++ ) {
	    for( int c = 0; c < _board[0].length; c++ ) {
        if (_board[r][c] < 1)
          sol += "_\t";
        else
          sol += "Q\t";
	    }
	    sol += "\n";
    }
    System.out.println(sol);
  }



  //================= YE OLDE SEPARATOR =================

  /***
   * Places a queen at a given point in the QueenBoard matrix 
   * precondition: row and col are valid coordinates in the matrix
   * postcondition: Queen now exists at the given point
   */
  private boolean addQueen(int row, int col){
    if(_board[row][col] != 0){
	    return false;
    }
    _board[row][col] = 1;
    int offset = 1;
    while(col+offset < _board[row].length){
	    _board[row][col+offset]--;
	    if(row - offset >= 0){
        _board[row-offset][col+offset]--;
	    }
	    if(row + offset < _board.length){
        _board[row+offset][col+offset]--;
	    }
	    offset++;
    }
    return true;
  }


  /***
   * Removes a queen from a given point in the QueensBoard matrix
   * precondition: row and col are valid coordinates in the matrix
   * postcondition: Queen will no longer exist at the given point
   */
  private boolean removeQueen(int row, int col){
    if ( _board[row][col] != 1 ) {
	    return false;
    }
    _board[row][col] = 0;
    int offset = 1;

    while( col+offset < _board[row].length ) {
	    _board[row][col+offset]++;
	    if( row - offset >= 0 ) {
        _board[row-offset][col+offset]++;
	    }
	    if( row + offset < _board.length ) {
        _board[row+offset][col+offset]++;
	    }
	    offset++;
    }
    return true;
  }


  /***
   * Prints out a visual representation of the QueensBoard along with its pieces
   * precondition: _board exists
   * postcondition: 2D matrix represenation of this instance of the QueensBoard will be printed
   */
  public String toString() 
  {
    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
	    for( int c = 0; c < _board[0].length; c++ ) {
        ans += _board[r][c]+"\t";
	    }
	    ans += "\n";
    }
    return ans;
  }


  //main method for testing...
  public static void main( String[] args )
  {
    QueenBoard b = new QueenBoard(3);
    b.solve();
    b.printSolution();

    QueenBoard q = new QueenBoard(5);
    q.solve();
    q.printSolution();

    QueenBoard d = new QueenBoard(13);
    d.solve();
    d.printSolution();

    //System.out.println(b);
    // b.addQueen(3,0);
    // b.addQueen(0,1);
    // b.printSolution();
    //System.out.println(b);
    // b.removeQueen(3,0);
    // b.printSolution();
    //System.out.println(b);
  }
    
}//end class
