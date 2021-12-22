import java.util.Arrays ;
public class Main{
	public static void main(String[] args) {
		
// 	char[][] board = new char[][] {
// 	    { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
//     	    { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
//     	    { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
//     	    { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
//     	    { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
//     	    { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
//     	    { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
//     	    { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
//     	    { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
//     	} ;
		
	    int[][] board = new int[][] {
	        {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
	    } ;
// 	    print2D( board );
	    System.out.println();
	    if( solve( board ) )
		print2D( board );
		
	    else 
		System.out.println( "Unsolvable" );
	}
	
	public static boolean solve( int[][] board ){
	    
	    int row = -1 ;
	    int col = -1 ;
	    boolean empty = false ;
	    
	    for ( int i = 0; i < board.length; i++ ) {
	        for ( int j = 0; j < board.length; j++ ){
	            
	            if( board[ i ][ j ] == 0 ){
	                
	                row = i ;
	                col = j ;
	                empty = true ;
	                break ;
	            }
	        }
	        if( empty )
	            break ;
	    }
	    
	    if( !empty )    //  Solved
	        return true ;
	        
	    
	    for ( int numb = 1; numb <= 9; numb++ ) {

	       if ( isSafe( board, row, col, numb ) ){
	                
		       board[ row ][ col ] = numb ;
		       if ( solve( board ) ){
			   return true ;
		       }
		       else {
			   board[ row ][ col ] = 0 ;
		       }
	       }
	    }
		
    	   //     return true 
	    return false ;
	}
	
	public static boolean isSafe( int[][] board, int row, int col, int numb ){
	    
	    //  Check cols
	    for ( int i = 0; i < board.length; i++ ) {
	        
	        if( numb == board[ row ][ i ] ) 
	            return false ;
	    }
	    
	    //  Check rows
	    for ( int i = 0; i < board.length; i++ ) {
	        
	        if( numb == board[ i ][ col ] ) 
	            return false ;
	    }
	    
	    //  Checks mini board
	    int rs = row - row %3 ;
	    int cs = col - col %3 ;
	    
	    for ( int i = rs; i < rs +3; i++ ) {
	        for ( int j = cs; j < cs +3; j++ ){
	            
	            if( numb == board[ i ][ j ] )
	                return false ;
	        }
	    }
	    
	    return true ;
	}
	
	public static void print2D(int mat[][]) {
        // Loop through all rows
        for (int[] row : mat)
 
            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }
}








