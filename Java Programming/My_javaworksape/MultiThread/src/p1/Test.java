package p1;

class Worker extends Thread {
	@Override
	public void run() {
		String numstr = "123456789098765432101023457896532";

		for (int i = 0; i < numstr.length(); i++) {
			System.out.print(numstr.charAt(i));

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Test {

	public static void main(String[] args) {

		Worker w1 = new Worker();
		w1.start();
		String alfstr = "abcdefghijklmnopqrstuvwxyz";

		for (int i = 0; i < alfstr.length(); i++) {
			System.out.print(alfstr.charAt(i));

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
