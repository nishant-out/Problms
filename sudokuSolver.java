import java.util.Arrays ;
public class Main{
	public static void main(String[] args) {
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
	    print2D( board );
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
	                col = i ;
	                empty = true ;
	            }
	        }
	        if( empty )
	            break ;
	    }
	    
	    if( !empty )    //  Solved
	        return true ;
	        
	    
	    for ( int numb = 1; numb <= 9; numb++ ) {

	       if ( isSafe( board, row, col, numb ) )
	                
    	       board[ row ][ col ] = numb ;
    	       if ( solve( board ) )
    	           return true ;
    	       else {
    	           board[ row ][ col ] = 0 ;
    	       }
	   }
	   
    	    //  Checks if sudoku is correct
    	   // if ( i == 8 && isCorrect( board, 1 ) )
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
	
	public static boolean isCorrect( int[][] board, int val ){
	    if( val > 9 )
	        return true ;
	    
	    int freq = 0 ;
	    
	    //  Check if all rows are correct
	    for ( int i = 0; i < board.length; i++ ) {
	        freq = 0 ;
	        for ( int j = 0; j < board.length; j++ ){
	            if( board[ i ][ j ] == 0 )
	                return false ;
	            
	            if( val == board[ i ][ j ] )
	                freq ++ ;
	        }
	        if( freq > 1 )
	            return false ;
	    }
	    
	    //  Check if all cols are correct
	    for ( int i = 0; i < board.length; i++ ) {
	        freq = 0 ;
	        for ( int j = 0; j < board.length; j++ ){
	            if( board[ j ][ i ] == 0 )
	                return false ;
	            
	            if( val == board[ j ][ i ] )
	                freq ++ ;
	        }
	        if( freq > 1 )
	            return false ;
	    }
	    
	    return isCorrect( board, val +1 ) ;
	}
	
	public static void print2D(int mat[][]) {
        // Loop through all rows
        for (int[] row : mat)
 
            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }
}








