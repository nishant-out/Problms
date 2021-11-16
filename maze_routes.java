import java.util.* ;

public class Main{
	public static void main(String[] args) {
	    routes( "", 3, 3 ) ;
	}
	
	public static void routes( String p, int r, int c ){
	    if( r == 1 && c == 1 ){
	        System.out.println( p );
	        return ;
	    }
	    if( r != 1 )
	        routes( p +'R', r -1, c ) ;
	        
	    if( c != 1 )
	        routes( p +'D', r, c -1 ) ;
	}
}
