package cs361;

public class MergeSort {
	public static int[] mergeSort(int[] a) {
		if (a.length <= 1) {
			int[] b = new int[1];
			b[0] = a[0];
			return b;

		} else {
			int i;
			int n = a.length;
			int mid = n / 2;
			int[] half1 = new int[mid];
			int[] half2 = new int[n - mid];

			for (i = 0; i < mid; i++)
				half1[i] = a[i];
			for (i = mid; i < n; i++)
				half2[i - mid] = a[i];

			half1 = mergeSort(half1);
			half2 = mergeSort(half2);

			int j = 0, k = 0;

			int[] b = new int[n];
			for (i = 0; j < half1.length && k < half2.length; i++)
				if (half1[j] < half2[k]) {
					b[i] = half1[j];
					j++;
				} else {
					b[i] = half2[k];
					k++;
				}
			for (; j < half1.length; i++, j++)
				b[i] = half1[j];
			for (; k < half2.length; i++, k++)
				b[i] = half2[k];
			return b;
		}

	}

	public static void main(String[] args) {
		int[] a = { 1, 4, 6, 2, 3, 8, 8, 3, 1 };
		int[] sort = mergeSort(a);
		for (int i : sort)
			System.out.print(sort[i] + " ");

		System.out.println();
		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] sortb = mergeSort(b);
		for (int j = 0; j < sortb.length; j++)
			System.out.print(sortb[j] + " ");
		
		System.out.println();
		int[] c = { 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] sortc = mergeSort(c);
		for (int k = 0; k < sortc.length; k++)
			System.out.print(sortc[k] + " ");

		System.out.println();
		int[] d = { 1, 1, 1, 1, 1, 1 };
		int[] sortd = mergeSort(d);
		for (int l : sortd)
			System.out.print(sortd[l] + " ");

	}
}
