import java.util.* ;
public class Main{
    
    static String[] digits = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" } ;
    static String[] teens = { "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eightteen", "Nineteen" } ;
    
	public static void main(String[] args) {
		ArrayList<String> ans = ones( "342" ) ;
		ans = tens( ans ) ;
		System.out.println( ans );
	}
	
	public static ArrayList<String> twenties( ArrayList<String> ans ){
	    
	    int third = 
	    //  for each digit of at tens palce check:
	        for( int i = s.length -1; i >= 0; i-- ){
	    //      if it is not the tens digit: 
	            if(  )
	    //          add the ones equivalent
	    
	    //      if tens digit is "one" :
	    //          get the teens one 
	    //      else if one's digit is zero :
	    //          get the complete ones 
	    //      else
	    //          get the complete ones for tens & merge with ones of one
	    
	        }
	    
	}
	
	public static ArrayList<String> tens( ArrayList<String> ans ){
	    
	    for( int i =  ans.size() -1; i >= 0; ){
	        String fst = ans.get( i-- ) ;
	        String sec = ans.get( i-- ) ;
	        
	        if( sec.equals( "One" ) ){
	            //  Call for teens
	        }
	        else if( fst.equals( "Zero" ) ){
	            //  pop fst
	            //  pop scnd 
	            //  push tens of sec
	        }
	        else{
	            //  pop scnd
	            //  push tens of sec  
	        }
	        i-- ;
	    }
	    return ans ;
	}
	
	public static ArrayList<String> ones( String dig ){
	    ArrayList<String> ans = new ArrayList<String>();  
	    
	    for( char ch: dig.toCharArray() ){
	        
	        int i = ch -'0' ;
	        ans.add( digits[ i ] ) ;
	    }
	    return ans ;
	}
}
