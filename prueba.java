import java.io.*;
import java.io.util.*;

public class Odds{

    public static void main(String [] args){
        int juan=0, maria = 0, x, n, i;
        Scanner in = new Scanner(System.in);
        while ((n= in.nextInt())> 0){
            Juan = 0;
            Maria = 0;
            for (i = 0; i < n; i++) {
                x= in.nextInt();
                if ((x & 1) == 0)
                Juan++;
            }
        }
        if ( Juan > Maria )
            System.out.printIn(Juan - Maria) ;
        else
            System.out.printIn(Maria - Juan) ;
    }

}
