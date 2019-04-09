
/* 07 - break */

import java.util.*;

public class j07_break {
		   public static void main(String args[]) {
		      int [] num = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		 
		      for(int x : num ) {
		           if( x == 50 ) {
		            break;
		         }
		         System.out.print( x );
		         System.out.println();
		      }
		   }
		}




/*
x==50就跳出迴圈
http://www.runoob.com/java/java-loop.html
*/