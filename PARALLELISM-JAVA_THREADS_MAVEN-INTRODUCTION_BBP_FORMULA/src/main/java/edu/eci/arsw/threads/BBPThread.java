package edu.eci.arsw.threads;

import edu.eci.arsw.math.PiDigits;

public class BBPThread extends Thread {
	
	int x;
	int y;
	int n;
	byte[]  calcular;

	public BBPThread(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void run() {
		
			calcular = PiDigits.getDigits(x, y);
			
	}

	public byte[] getCalcular() {
		return calcular;
	}

	
	

}
