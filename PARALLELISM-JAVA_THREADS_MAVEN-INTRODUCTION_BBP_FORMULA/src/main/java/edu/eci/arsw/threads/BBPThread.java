package edu.eci.arsw.threads;

import edu.eci.arsw.math.PiDigits;

public class BBPThread extends Thread {
	
	int x;
	int y;

	public BBPThread(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void run() {
			byte[] lec = PiDigits.getDigits(x, y);
			System.out.println(lec);
		}

}
