
public class Q4b {

	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {
			
			for (int j=4; j>i ;j=j-1)
			{
				System.out.print(" ");
			}
			for (int j=0; j<=i*2 ;j=j+1)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i<4; i++) {
			for (int j=0; j<=i ;j++)
			{
				System.out.print(" ");
			}
		
			for (int j=7-i; j>i ;j=j-1)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
