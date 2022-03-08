import java.util.*;


		//  given a array find all its possible subsets
		//  return the maximum subset which is divisible by 2, 3, & 5

public class Main{
	public static void main(String[] args) {
		
// 		int[] arr = { 3, 0, 1, 4 };
        List<Integer> arr = new ArrayList<Integer>() ;
        arr.add( 5 );
        arr.add( 0 );
        // arr.add( 1 );
        arr.add( 4 );
        
        solve( arr );
	}
	
	public static void /* List<Integer> */ solve( List<Integer> nums ){
	    
	    int ans = hlp( nums, new ArrayList<Integer>(), -1 );
	    System.out.println( "ans: " + ans );
	}
	public static int hlp( List<Integer> up, List<Integer> p, int ans ){
	    int i;
	    
	    if( up.size() == 0 ){
	        
	       // for( int k : p ){
	       //     System.out.print( k + "," );
	       // }
	       // System.out.println();
	        
	        if( check( p ) ){
	            //  Create an Integer number of p
	            int num = 0;
	            i = p.size() -1;
	            
	            while( i >= 0  && p.get( i ) == 0 )  //  skip leading zeros
	                i--;
	                
	            while( i >= 0 ){
	                num = ( num *10) + p.get( i );
	                i--;
	            }
	            
	            if( num > ans )
	                return num;
	        }
	       // System.out.println( "ans: " + ans );
	        return ans;
	    }
	    
	    i = up.remove( up.size() -1 );
	    
	    ans = hlp( up, p, ans );
	    
	    p.add( i );
	    
	    ans = hlp( up, p, ans );
	    
	    up.add( i );
	    p.remove( p.size() -1 );
	    
	    return ans;
	}
	public static boolean check( List<Integer> list ){
	    if( list.size() == 0 )      return false;
	    boolean flag = true;
	    
	    //  for checking if number is div by 2
	    int[] ends = { 0, 2, 4, 6, 8 };
	    
	    for( int i : ends ){
	        if( i == list.get( 0 ) ){
	            flag = false;
	            break;
	        }
	    }
	    
	    if( flag || list.get( 0 ) != 0 || list.get( 0 ) != 5 )      return false;
	    
	    //  for checking if number is div by 3
	    int sum = 0;
	    for( int i : list ){
	        sum += i;
	    }
	    
	    if( sum %3 == 0 )
	        return true;
	    return false;
	}
}













