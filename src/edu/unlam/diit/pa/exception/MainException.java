package edu.unlam.diit.pa.exception;

public class MainException {
	public static void main(String[] args) {
		Saraza s = null;

		try {
			s.toString();

		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			// e.getMessage();
			// e.printStackTrace();
			System.out.println(e.getMessage()); // Para que dé un mensaje "lindo"
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.getMessage();
			// e.printStackTrace();
			System.out.println(e.getMessage()); // Para que dé un mensaje "lindo"
		} finally {
			System.out.println("Finally, do something");
		}
	}
}
