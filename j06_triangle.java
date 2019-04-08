/* 03 - triangle */

import java.util.*;

public class j06_triangle {
	public static void main(String[] args){

		for(int i=1; i<=5; i++){
		/*圖形裡面共有5行*/
			for(int j=5; j>=i; j--)
			/*j_1的部分從上往下空格，第一行空格要4各;第二行空格3格;第三行空格2格*/
			/*只要j大於i符合條件就可以執行for*/
				System.out.print(" ");
					for(int j=1; j<=i; j++)
					/*j_2的部分從上往下*，第一行1*;第二行2**;第三行3***/
						System.out.print("*");
							for(int j=2; j<i; j++)
							/*j_3的部分從第二行開始上往下*，第2行1*;第三行3**;第四行3***/
								System.out.print("*");
								System.out.println();

			

		}

	}

}





/*
JAVA 打印三角形
    *
    **
   ****
  ******
 ********

http://www.runoob.com/w3cnote/java-print-the-triangle.html*/