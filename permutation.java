import java.util.* ;

public class Main{
	public static void main(String[] args) {
	    String str = "abc" ;
	    
	    ArrayList<String> ans = permutation( "", str ) ;
	    System.out.println( ans );
	}
	
	//	Better Approach:
	public static ArrayList<String> better_permutation( String ans, String s ){
	    if( s.isEmpty() ){
	        ArrayList<String> list = new ArrayList<>() ;
	        list.add( ans ) ;

	        return list ;
	    }
	    ArrayList<String> ret = new ArrayList<>() ;
	    
	    for( int i = 0; i < s.length(); i++ ){
	        char ch = s.charAt( i ) ;
	        
	        String prev = s.substring( 0, i ) ;
	        String end  = s.substring( i +1, s.length()) ;
	        
	        ret.addAll( better_permutation( ans +ch, prev +end )) ;
	    }
	    return ret ;
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
