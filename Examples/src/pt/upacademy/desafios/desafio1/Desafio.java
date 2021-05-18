package pt.upacademy.desafios.desafio1;

public class Desafio {
	private int max=0;
	private int big3=0;
	private int big5=0;
	private int count=1;

	public Desafio(int i) {
		max=i;
	}

	public void run() {
		int i;
		for(i=count;i<=max;i++ ) {
			if(i%3==0) {
				big3++;
			}
			if(i%5==0) {
				big5++;
			}
		}
		
	}

	public int getBig3Count() {
	
		return big3;
	}

	public int getBig5Count() {
	
		return big5;
	}

}
