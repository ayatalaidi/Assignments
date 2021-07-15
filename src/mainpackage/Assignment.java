package mainpackage;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int n = inScanner.nextInt();
		int l = inScanner.nextInt();
		int[] a = new int[n];
		boolean f1 = false, f2 = false;

		for (int i = 0; i < n; i++) {

			a[i] = inScanner.nextInt();
			if (a[i] == 0)
				f1 = true;
			if (a[i] == l)
				f2 = true;

		}

		Arrays.sort(a);
		int mx = Integer.MIN_VALUE;

		for (int i = 1; i < n; i++) {

			mx = Math.max(mx, a[i] - a[i - 1]);

		}

		Double ans = (double) mx / 2.0;
		if (!f1)
			ans = Math.max(ans, (double) a[0]);
		if (!f2)
			ans = Math.max(ans, (double) (l - a[n - 1]));

		System.out.printf("%.10f\n", ans);

		inScanner.close();

	}

}
