#include <stdio.h>

/*

                    4 4 4 4 4 4 4 
                    4 3 3 3 3 3 4 
                    4 3 2 2 2 3 4 
                    4 3 2 1 2 3 4 
                    4 3 2 2 2 3 4 
                    4 3 3 3 3 3 4 
                    4 4 4 4 4 4 4


*/



int min( int p, int q ){
    if( p < q )
        return p ;
        
    return q ;
}

int main()
{
    int n = 4 ;
    int rw = 2*n -2 ;   //  index based walls   //  rw => right wall
    
    for( int i = 0; i < n; i++ ){
        
        for( int j = 0; j < 2*n -1 ; j++ ){
            
            int k = n - min( min(i, j), min(rw -i, rw -j) ) ;
            printf("%d ", k ) ;
        }
        printf( "\n" ) ;
    }
    
    for( int i = n -2; i >= 0; i-- ){
        
        for( int j = 0; j < 2*n -1 ; j++ ){
            
            int k = n - min( min(i, j), min(rw -i, rw -j) ) ;
            printf("%d ", k ) ;
        }
        printf( "\n" ) ;
    }
    

    return 0;
}
