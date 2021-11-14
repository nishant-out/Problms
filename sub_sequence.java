/******************************************************************************
For Written Reference:

*******************************************************************************/
public class sub_sequence{
  
	public static void main(String[] args) {
	    subSequence( "abc", "" ) ;
	}
	
	public static void subSequence( String str, String ans ){
	    if( str.isEmpty() ){
	        System.out.println( ans ) ;
	        return;
	    }
	        
	    subSequence( str.substring( 1 ), ans ) ;
	    subSequence( str.substring( 1 ), ans + str.charAt( 0 ) ) ;
	}
}
