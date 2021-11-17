import java.util.* ;

public class Main{
  
	public static void main(String[] args) {
	    boolean[][] maze = {
	           { true, true, true },
	           { true, true, true },
             { true, true, true }
	    } ;
    
	    up_down( "", maze, 0, 0 ) ;
	}
  
  public static void up_down( String p, boolean[][] maze, int r, int c ){
	    if( r == maze.length -1 && c == maze[ 0 ].length -1 ){
	        System.out.println( p );
	        return ;
	    }
	    if( !maze[ r ][ c ] )   return ;
	    
	    if( r < maze.length -1 )
	        up_down( p +'D', maze, r +1, c ) ;
	   
	    if( c < maze[ 0 ].length -1 )
	        up_down( p +'R', maze, r, c +1 ) ;
	}
}
