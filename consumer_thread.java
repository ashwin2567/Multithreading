class consumer_thread extends Thread{
	company c;

	consumer_thread(company c){
		this.c = c;
	}

	public void run(){
		while(true){
			this.c.consume_item();
			try{Thread.sleep(2000);}catch(Exception e){}
		}
	}
}