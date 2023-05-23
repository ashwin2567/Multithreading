class thread2 extends Thread{
	//method2 using thread class
	public void run(){
		for(int i=20;i>=1;i--){
			System.out.println("Thread "+i);
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){

			}
		}
	}
}