public class Q6 {
	public static void main(String[] a){
		int n = Integer.parseInt(a[0]);

		for(int i = 0; i < n; i++){
			for(int j = n-1; j >= 0; j--)
				System.out.print("x ");
			
			System.out.println();
		}
	}
}
