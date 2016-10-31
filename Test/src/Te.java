class Ticket implements Runnable{
	int count=9;

	@Override
	public void run() {
		for(int i=0;i<100;i++){
		System.out.print(count--);
	}
	}
	
	
	}

public class Te {
	public static void main(String[] args){
		Ticket t=new Ticket();
		Ticket t1=new Ticket();
		Thread tt=new  Thread(t);
	    Thread  tt2=new Thread(t1);	
	    tt.start();
	    tt2.start();
	}
	}