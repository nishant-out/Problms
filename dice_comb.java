public class Main{
  //  all Possible combination of dice faces == Target 
  
	public static void main(String[] args) {
	    
        dice( "", 4 ) ;
	}
	public static void dice( String p, int up ){
	    if( up == 0 ){
	        System.out.println( p );
	        return ;
	    }
	    for( int i = 1; i <= 6 && i <= up; i++ ){
	        dice( p +i, up -i ) ;
	    }
	}
}
