package jump2java;

import java.util.ArrayList;

public class FourArithmetic {
	public static void main(String[] args) {
		ArrayList<String> pitches = new ArrayList();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		System.out.println(pitches);
		pitches.add(0, "133");
		System.out.println(pitches);
		System.out.println(pitches.get(1));
		System.out.println(pitches.size());
		
		System.out.println(pitches.contains("142"));
		System.out.println(pitches.remove(3));		
		System.out.println(pitches);		
		}
}

