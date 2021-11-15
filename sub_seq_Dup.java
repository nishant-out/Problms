import java.util.* ;

//  Sub_Seq with Duplicates

public class Main{
	public static void main(String[] args) {
	    int[] arr = { 1, 2, 2 } ;
	    
	    List<List<Integer>> ans = subSequence( arr ) ;
	    for( List<Integer> i : ans ){
	        System.out.println( i );
	    }
	}
	
	public static List<List<Integer>> subSequence( int[] arr ){
	    List<List<Integer>> outer = new ArrayList<>() ;
	    outer.add( new ArrayList<>() ) ;
	    int st = 0 ;
	    int en = 0 ;
	    
	    for( int i = 0; i < arr.length; i++ ){
        
	        int n = outer.size() ;
	        st = 0 ;
	        if( i > 0 && arr[ i ] == arr[ i -1] )
	            st = en +1 ;
	        en = n -1 ;
	        for( int j = st; j < n; j++ ){
	            
	            //  creating a new list containing previous elements
	            List<Integer> in = new ArrayList<>( outer.get( j ) ) ;
	            
	            in.add( arr[ i ] ) ;     //  adds num in all elements of list
	            outer.add( in ) ;   //  add the new list with previous list
	        }
	       // for( List<Integer> i : ans ){
	       //     System.out.println( i );
	       // }
	       // System.out.println( n ) ;
	    }
	    return outer ;
	}
}
