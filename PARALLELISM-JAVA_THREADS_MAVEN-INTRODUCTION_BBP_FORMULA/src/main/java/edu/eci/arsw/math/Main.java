/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import edu.eci.arsw.threads.BBPThread;

/**
 *
 * @author hcadavid
 */
public class Main {

    public static void main(String a[]) {
    	ArrayList<String> calculos = new ArrayList<String>();
    	ArrayList<BBPThread> hilos = new ArrayList<BBPThread>();
    	Scanner sca = new Scanner(System.in); 
    	int n = sca.nextInt();
    	int temp = 1000000/n;
    	int start = 1;
    	
    	for (int i = 0;i<n;i++) {
    		hilos.add(new BBPThread(start,temp));
    		hilos.get(i).start();
    		start += temp;
    	}
    	for (int j = 0;j<n;j++) {
    		try {
				hilos.get(j).join();
				calculos.add(bytesToHex(hilos.get(j).getCalcular()));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	for (int k = 0;k<n;k++) {
    		System.out.println(calculos.get(k));
    	}
    	//BBPThread hilo1 = new BBPThread(0,10);
    	//BBPThread hilo2 = new BBPThread(11,100);
    	//BBPThread hilo3 = new BBPThread(101,1000000);
    	
        //System.out.println(bytesToHex(PiDigits.getDigits(0, 10)));
        //System.out.println(bytesToHex(PiDigits.getDigits(1, 100)));
        //System.out.println(bytesToHex(PiDigits.getDigits(1, 1000000)));
       
    }

    private final static char[] hexArray = "0123456789ABCDEF".toCharArray();

    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<hexChars.length;i=i+2){
            //sb.append(hexChars[i]);
            sb.append(hexChars[i+1]);            
        }
        return sb.toString();
    }

}
