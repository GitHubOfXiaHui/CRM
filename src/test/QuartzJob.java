package test;

public class QuartzJob {

	public void execute() throws Exception {
		int index = (int) (Math.random() * GREETINGS.length);
		System.out.println(GREETINGS[index]);
	}
	
	private static final String[] GREETINGS = new String[]{"你好", "Hello", "こんにちは", "Bonjour", "Hallo", "Ciao", "Привет"};
}
