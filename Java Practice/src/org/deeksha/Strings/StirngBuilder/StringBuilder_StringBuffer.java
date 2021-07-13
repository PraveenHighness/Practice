package src.org.deeksha.Strings.StirngBuilder;

public class StringBuilder_StringBuffer {
	public static void main(String[] args) {
		StringBuilder SB = new StringBuilder("Highness");
		
		StringBuffer sb = new StringBuffer(SB);
		
		System.out.println(sb);
	}

}
