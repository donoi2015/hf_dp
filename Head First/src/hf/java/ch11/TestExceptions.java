package hf.java.ch11;

public class TestExceptions {
    public static void main(String[] args) {
	String test = "no";
	try {
	    System.out.println("start try");
	    doRisky(test);
	    System.out.println("end try");
	} catch (SecurityException se) {
	    System.out.println("scary exception");
	} finally {
	    System.out.println("finally");
	}
	System.out.println("end of main");
    }

    static void doRisky(String test) throws SecurityException {
	System.out.println("start risky");
	System.out.println(test);
	if (!"yes".equals(test)) {
	    throw new SecurityException();
	}
	System.out.println("end risky");
	return;
    }
}
