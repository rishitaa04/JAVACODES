
// Q1. You will be given an integer n, and a threshold, k. For each number from 1 to n, find the maximum value of the Bitwise &, Bitwise | and Bitwise ^, when compared that are greater than i. Consider a value only if the comparison returns less than k. Print the results of the Bitwise &, Bitwise | and Bitwise ^ comparisons on separate lines, in that order.
import java.util.*;

public class operator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int and = 0;
        int fand = 0;
        int or = 0;
        int finalor = 0;
        int xor = 0;
        int finalxor = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                and = i&j;
                if (and>fand && and<k) {
                    fand = and;
                }
                or = i|j;
                if (or>finalor && or<k) {
                    finalor = or;
                }
                xor = i^j;
                if (xor>finalxor && xor<k) {
                    finalxor = xor;
                }
            }
        }
        System.out.println(fand);
        System.out.println(finalor);
        System.out.println(finalxor);
        sc.close();
    }
}

// import java.util.Scanner;
// class operator	
// {
// 	public static void main(String[] args)
// 	{
// 		Scanner inp=new Scanner(System.in);
// 		int n=inp.nextInt();
// 		int k=inp.nextInt();

// 		int and=0,fand=0,or=0,finalor=0,xor=0,fxor=0;
// 		for (int i=1 ; i<=n ; i++)
// 		{
// 			for (int j=i+1 ; j<=n ; j++)
//       			{
//         				and=i&j;
// 				if (and>fand && and<k)
// 				{
// 					fand=and;
// 				}
// 				or=i|j;
// 				if (or>finalor && or<k)
// 				{
// 					finalor=or;
// 				}
// 				xor=i^j;
// 				if (xor>fxor && xor<k)
// 				{
// 					fxor=xor;
// 				}        
// 			}
// 		}
// 		System.out.println(fand);
// 		System.out.println(finalor);
// 		System.out.println(fxor);
//         inp.close();
// 	}

// }
