class threadop{
	public static void main(String args[]){
		System.out.println("started..");
		int x = 5 + 6;
		System.out.println(x);
		Thread t = Thread.currentThread();
		System.out.println("Running thread is "+ t.getName());
		t.setName("changed name");
		System.out.println("Running thread is "+ t.getName());
		System.out.println("Running thread ID is "+ t.getId());

		userdefinedthread udt = new userdefinedthread();
		udt.start();


		System.out.println("ended..");
	}
}

class userdefinedthread extends Thread{
	public void run(){
		System.out.println("This is a user defined thread.");
	}
}