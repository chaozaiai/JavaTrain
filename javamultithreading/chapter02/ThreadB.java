package chapter02;

public class ThreadB extends Thread{
	private HasSelfPrivateNum numRef;
	public ThreadB(HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		numRef.addI("b");
	}

}
