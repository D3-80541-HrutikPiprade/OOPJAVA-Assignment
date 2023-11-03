import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestProgram {

	public static void main(String[] args) {
		//Collection<String> c = new ArrayList<>(); // [B, D, A, C, null, null, null] -> null are allowed
		//Collection<String> c = new HashSet<>();    // [null, A, B, C, D]            -> null allowed
		//Collection<String> c = new LinkedHashSet<>(); // [B, D, A, C, null]         -> null allowed
		Collection<String> c = new TreeSet<>(); // NullPointerException               -> null not allowed 
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());
	}

}
