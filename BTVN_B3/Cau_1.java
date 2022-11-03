package BTVN_B3;

import java.util.Scanner;

public class Cau_1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        
        int n ;
        do
        {
            System.out.println("Nhap vap so phan tu cua mang: ") ;
            n = sc.nextInt() ;   
        }
        while ( n < 2 ) ;
                       
        System.out.println("Nhap vao cac phan tu cua mang: ") ;  
        int [] arr = new int [ n ] ;
        for ( int i = 0 ; i < n ; i++ )
        {            
            arr[ i ] = sc.nextInt() ;                                      
        }
        
        for( int i = 0 ; i < n - 1 ; i++ )
        {
           for( int j = i + 1 ; j < n ; j++ )
           {
		if ( arr[ i ] > arr[ j ] )
                {
                    int temp = arr[ i ] ;
                    arr[ i ] = arr[ j ] ;
                    arr[ j ] = temp ;
		} 
            }
        }			
			
        int dem = 1 ;

        for ( int i = 0 ; i < n ; i++ ) 
        {
            if ( i == 0 ) 
            {
                System.out.print(arr [ i ] + " : ") ;
                continue ;
            }

            if ( arr [ i - 1 ] != arr [ i ] ) 
            {
                System.out.println( dem ) ;
                dem = 1 ;
                System.out.print(arr [ i ] + " : ") ;
            } 
            else 
            {
                dem++ ;
            }
        }
        System.out.println( dem ) ;

    }
    
}
