package pkg;

public class SplitASentence {
	public static void main(String[] args) {
		String s = "My name is don";
		String[] s1 = s.split(" ");	
		int l = s1.length;
		System.out.println(l);
		for (int i = 0; i < l; i++) {
			System.out.println(s1[i]);
		}

	}
}