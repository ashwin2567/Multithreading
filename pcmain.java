class Main{
	public static void main(String args[]){
		company comp = new company();
		producer_thread p = new producer_thread(comp);
		consumer_thread c = new consumer_thread(comp);
		p.start();
		c.start();
	}
}