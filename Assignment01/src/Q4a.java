
public class Q4a {

	public static void main(String[] args) {
for(int i = 0; i<5; i++) {
			
			for (int j=4; j>i ;j=j-1)
			{
				System.out.print(" ");
			}
			for (int j=0; j<=i ;j=j+1)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
