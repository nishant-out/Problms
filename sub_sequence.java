/******************************************************************************
For Written Reference:

https://github.com/nishant-out/Problms/blob/main/Written_ref/WhatsApp%20Image%202021-11-14%20at%2019.24.30.jpeg
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
