import java.util.* ;

public class Main{
  
	public static void main(String[] args) {
        System.out.println( notepad( "","12" ) );
	}
	
	public static ArrayList<String> notepad( String p, String up ){
	    if( up.isEmpty() ){
	        
	        ArrayList<String> list = new ArrayList<>() ;
	        list.add( p ) ;
	        return list ;
	    }
	    ArrayList<String> ans = new ArrayList<>() ;
	    int dig = up.charAt( 0 ) -'0' ;
	    
	    for( int i = (dig -1) *3; i < dig *3; i++ ){
	        char ch = (char) ('a' + i) ;
	        ans.addAll( notepad( p +ch, up.substring( 1 ) ) );
	    }
	    return ans ;
	}
}
