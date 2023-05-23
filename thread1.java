class thread1 implements Runnable{
	//Method 1 using runnable interface
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Runnable "+i);
			try{
				Thread.sleep(2000);
			}
			catch(Exception e){

			}
		}
	}

	public static void main(String args[]){
		thread1 t1 = new thread1();
		Thread th = new Thread(t1);
		th.start();

		thread2 t2 = new thread2();//calling directly from object
		t2.start();
	}
}