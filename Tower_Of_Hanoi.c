#include <stdio.h>

                //  src  // des   // aux
void toh( int n, char a, char b, char c ) { 
   
    if( n == 1 ){
        printf( "mov %c to %c\n", a, b ) ;
        return ;
    }
    toh( n -1, a, c, b ) ;
    printf( "mov %c to %c\n", a, b ) ;
    toh( n -1, c, b, a ) ;
    
}

int main()
{
   toh( 4, 'A', 'B', 'C' ) ;
   return 0;
}
