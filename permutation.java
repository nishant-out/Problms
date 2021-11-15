import java.util.* ;

public class Main{
	public static void main(String[] args) {
	    String str = "abc" ;
	    
	    ArrayList<String> ans = permutation( "", str ) ;
	    System.out.println( ans );
	}
	public static ArrayList<String> permutation( String ans, String s ){
	    if( s.isEmpty() ){
	        ArrayList<String> list = new ArrayList<>() ;
	        list.add( ans ) ;
	        
	        return list ;
	    }
	    ArrayList<String> ret = new ArrayList<>() ;
	    
	    char ch = s.charAt( 0 ) ;
	    
	    for( int i = 0; i <= ans.length(); i++ ){
	        String prev = ans.substring( 0, i ) ;
	        String end  = ans.substring( i, ans.length()) ;
	        
	        ret.addAll( permutation( prev + ch + end, s.substring( 1 )) ) ;
	    }
	    return ret ;
	}
}
