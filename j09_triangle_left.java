public class j09_triangle_left{

     public static void main(String []args){
       for(int i=1;i<=5;i++){
           /i為縱軸，i總共有5行/
             for(int j=1;j<=i;j++)
             /j為輸出*，當j<=i迴圈里就繼續執行再加顆**/
           System.out.print("*");
           System.out.println();
         
       }
     }
}





/* output
*
**
***
****
*****
*/