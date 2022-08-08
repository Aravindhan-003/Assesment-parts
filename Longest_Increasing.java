package Phase1_Project;

import java.util.Scanner;

public class Longest_Increasing
{
	 static void findLength(int[] a) {
		int n = a.length;
		int[] Len = new int[n];
		int subseq = Integer.MIN_VALUE;

		for (int i=0;i<n;i++) {
			Len[i] = 1;
			for (int j=0;j<i;j++) {
				if((a[i] > a[j])&&(Len[i] < Len[j] + 1))
					Len[i] = Len[j] + 1;
			}
			if(subseq<Len[i]) {
				subseq=Len[i];
			}
		}
		System.out.println("The longest Increasing Subsequence is:"+subseq);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size:");
		int n = sc.nextInt();
		System.out.println("Enter your value:");
		int[] a = new int[n];

		for (int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		sc.close();
		findLength(a);
	}
}
