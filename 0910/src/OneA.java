public class OneA {

	public static boolean inRange( int [] a, int b, int c ) {
		for (int i=0;i<a.length;i++)
			if (a[i]<b || a[i]>c) return false;
		return true;
	}
}