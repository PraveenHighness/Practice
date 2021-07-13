package src.org.deeksha.Strings;

import java.util.Arrays;

public class Byte_for_String {
	public static void main(String[] args) {
		String s = "SRRR";
		byte[] byteArray;
		
		byteArray =s.getBytes();
		System.out.println(Arrays.toString(byteArray));
	}

}
