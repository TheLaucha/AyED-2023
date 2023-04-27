package ej_4;

public class ej_4_main {

	public static void main(String[] args) {
		TestBalanceo t = new TestBalanceo();
		String s1 = "{()[()]}";
		String s2 = "{()[]}";
		String s3 = "{([()]}";
		String s4 = "{()[()}";
		String s5 = "{()[()]}([";
		
		System.out.println(t.testearBalanceo(s1));
		System.out.println(t.testearBalanceo(s2));
		System.out.println(t.testearBalanceo(s3));
		System.out.println(t.testearBalanceo(s4));
		System.out.println(t.testearBalanceo(s5));
	}

}
