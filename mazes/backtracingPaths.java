import java.util.* ;

//  

public class Main{
	public static void main(String[] args) {
	    boolean[][] maze = {
	           { true, true, true },
	           { true, true, true },
             { true, true, true }
	    } ;
    
	    up_down( "", maze, 0, 0 ) ;
	}
  public static void backtrack_Paths( String p, boolean[][] maze, int r, int c ){
	    if( r == maze.length -1 && c == maze[ 0 ].length -1 ){
	        System.out.println( p );
	        return ;
	    }
	    
	    if( !maze[ r ][ c ] )   return ;
	    maze[ r ][ c ] = false ;
	    
	    if( r < maze.length -1 )
	        backtrack_Paths( p +'D', maze, r +1, c ) ;
	   
	    if( c < maze[ 0 ].length -1 )
	        backtrack_Paths( p +'R', maze, r, c +1 ) ;
	   
	    if( r > 0 )
	        backtrack_Paths( p +'U', maze, r -1, c ) ;
	   
	    if( c > 0 )
	        backtrack_Paths( p +'L', maze, r, c -1 ) ;
	        
	    maze[ r ][ c ] = true ;
	}
}
