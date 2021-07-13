package src.org.deeksha.OOPS.Inherit;


public class Showroom {
	public static void main(String[] args) {
		Honda h = new Honda();
		h.start();
		h.noise();
		
		Duke d = new Duke();
		d.start();
		d.noise();
		
		RE r = new RE();
		r.start();
		r.noise();
		
	}

}
