
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		int result =Stream.generate(()-> (int) (Math.random()*10))
			.limit(10)
			.reduce(0,(a,e)-> a+e);
		System.out.println("Sum = "+result);

	}

}
