package pkg_04;

public class es04 {
	// Polimorfismo
	public static int Add(int n1, int n2) {
		return n1 + n2;
	}

	public static String Add(String s1, String s2) {
		return s1.concat(s2);
	}

	public static String Add(String s1, float s2) {
		return s1.concat(Float.toString(s2));
	}

	public static void main(String[] args) {
		System.out.println(Add(1, 2));
		System.out.println(Add("Ciao", "ni"));
		System.out.println(Add("Uno", (float) 2.2));
	}
}
