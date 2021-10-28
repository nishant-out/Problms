public class Main
{
  
//     1  2  3  4  5 26 27 28 29 30
//      6  7  8  9 22 23 24 25
//        10 11 12 19 20 21
//           13 14 17 18
//              15 16
  
	public static void main(String[] args) {
		
		int n = 5 ;
		int e = (n * ( n +1)) ;
		int s = 1 ;
		int i = 0 ;
		
		while( e > s ){
		    
		    for( int j = 0; j < i; j++ ){
		        System.out.print( "   " );
		    }
		    
		    for( int j = 0; j < (n -i); j++  ){
		        System.out.printf( "%3d", s );
		        s++ ;
		    }
		    
		    e -= (n -i -1);
		    for( int j = e; j <= e +(n -i -1) ; j++ ){
		        System.out.printf( "%3d", j );
		    } 
            e-- ;

		    System.out.println();
		    i++ ;
		}
	}
}
