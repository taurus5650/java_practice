/* 04 - sum99 */

import java.util.*;

public class j04_sum99 {
	public static void main(String[] args){

		Scanner input = new Scanner (System.in);

		System.out.print("Input the num: ");
		int n = input.nextInt();

		int sum = 0;
		for(int i=1; i<=n; i++){
			sum += i;
		}
		System.out.println("1 + ... + " +n+ " = " +sum);

	}

}





/*
1+2+.....+n  = sum
*/