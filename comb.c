#include<stdio.h>
#include<string.h>
#include<stdlib.h>

void print( char* s, int len ){
    if( len == 0 )
        return ;
    
    for( int i = 0; i <= len; i++ )
        printf( "%c", s[ i ] ) ;
        
    printf( "\n" ) ;
}

void rec( char* str, char* ans, int i, int j, int len ){
	if( i == len ){
	    print( ans, j ) ;
	    return;
	}
	   
	ans[ j +1] = str[ i ] ;
	rec( str, ans, i +1, j +1, len ) ;
	rec( str, ans, i +1, j, len ) ;
}
int main(){
    
    char *s = "abcd" ;
    char *ans = (char*) malloc( sizeof(char) * strlen( s ) ) ;
    
    rec( s, ans, 0, 0, strlen( s ) );
    return 0;
}

