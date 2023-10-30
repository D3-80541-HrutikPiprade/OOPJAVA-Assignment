
public class Testpalindrome {

	public static void main(String[] args) {
		String s1 = "radar";
		boolean palin=true;
		for(int i =0 ; i<s1.length()/2 ;i++)
		{
			if(s1.charAt(i) != s1.charAt(s1.length()-1-i)){
				palin = false;
				break;
			}
		}
		if(palin)
			System.out.println(s1+" is a Palindrome");
		else
			System.out.println(s1+ " is not a Palindrome");
	}
	

}
