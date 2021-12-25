package third;

public class third_pra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7.3
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the integers between 1 and 100: ");
//		
//		int []a = new int[100];
//		int b = input.nextInt();
//		while(b != 0){
//			if(b == 0)
//				break;
//			a[b]++;
//			b = input.nextInt();
//		}
//		for(int i = 0;i < 100;i++) {
//			if(a[i] == 1)
//				System.out.println(i + " occurs 1 time");
//			else if(a[i] > 1)
//				System.out.println(i + " occurs " + a[i] + " times");
//		}
		
		//7.5
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter 10 numbers: ");
//		
//		int []a = new int[10];
//		int []c = new int[10];
//		int sum = 0;
//		int k = 0;
//		for(int i = 0;i < 10;i++) {
//			int b = input.nextInt();
//			a[b]++;
//			if(a[b] > 1) 
//				sum++;
//			else
//				c[k++] = b;
//		}
//		System.out.printf("The number of distinct numbers is %d\nSystem.out.printf(\"The distinct numbers are: ",10-sum);
//		for(int i = 0;i < k;i++)
//			System.out.printf("%d ",c[i]);
//	}
	
		//8.11
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter a number between 0 and 511: ");
//		int x = input.nextInt();
//		int [][]b = new int [3][3];
//		String [][]c = new String[3][3];
//		for(int i = 2;i >= 0;i--) {
//			for(int j = 2;j >= 0;j--) {
//				b[i][j] = x % 2;
//				x /= 2;
//			}
//		}
//		for(int i = 2;i >= 0;i--) {
//			for(int j = 2;j >= 0;j--) {
//				if(b[i][j] == 1)
//					c[i][j] = "T";
//				else
//					c[i][j] = "H";
//			}
//		}
//		for(int i = 0;i < 3;i++) {
//			for(int j = 0;j < 3;j++) {
//				System.out.print(c[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

}
