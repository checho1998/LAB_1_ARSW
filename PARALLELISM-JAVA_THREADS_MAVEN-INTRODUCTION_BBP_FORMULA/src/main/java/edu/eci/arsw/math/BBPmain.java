package edu.eci.arsw.math;

import java.util.ArrayList;

import edu.eci.arsw.threads.BBPThread;

public class BBPmain {
	
	int n ;
	private String solu = new String();
	
	public void calcularNumero(int n) {
		this.n = n;
		ArrayList<String> calculos = new ArrayList<String>();
		ArrayList<BBPThread> hilos = new ArrayList<BBPThread>();
		int temp = 0;
		int faltantes = 0;
		int cantidad = 100000;
		temp = cantidad/n;
		if (cantidad % n != 0) {
			faltantes = temp*n;
			faltantes = cantidad - faltantes;
		}
		
		int start = 0;
		for (int i = 0;i<n;i++) {
			if(faltantes == 0) {
				hilos.add(new BBPThread(start,temp));
	    		hilos.get(i).start();
	    		start += temp;
			}
			else{
				hilos.add(new BBPThread(start,temp+1));
	    		hilos.get(i).start();
	    		faltantes -= 1;
	    		start += (temp+1);
			}
		}
		for (int j = 0;j<n;j++) {
			try {
				hilos.get(j).join();
				calculos.add(Main.bytesToHex(hilos.get(j).getCalcular()));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for (int k = 0;k<n;k++) {
			solu = solu+calculos.get(k);
			System.out.println(calculos.get(k));
		}
	}
	public String getSolu() {
		return solu;
	}
	}
