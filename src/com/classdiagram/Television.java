package com.classdiagram;

public class Television extends SecondProperties{
	
	public static void main(String[] args) {

		Television[] tv = new Television[44];
		for(int x = 0; x < tv.length; x++) {
			tv[x] = new Television();
		}
		tv[0].setName("QLED Q9F 4K Smart TV (2018)");
		tv[0].setPqi(3700);
		tv[0].setResolutionWidth(3840);
		tv[0].setResolutionHeight(2160);
		tv[0].setScreenSize("65\"");
		tv[0].setPowerSupply("AC100-240V 50/60Hz");
		tv[0].setPictureEngine("Q Engine");
		tv[0].setHdmiPort(2);
		tv[0].setUsbPort(3);
		tv[0].intro(1);
		
		
		tv[1].setName("QLED Q8C Curved 4K Smart TV (2018)");
		tv[1].setPqi(3300);
		tv[1].setResolutionWidth(3840);
		tv[1].setResolutionHeight(2160);
		tv[1].setScreenSize("55\"");
		tv[1].setPowerSupply("Q Engine");
		tv[1].setHdmiPort(2);
		tv[1].setUsbPort(4);
		tv[1].intro(2);
		

		tv[2].setName("82\"QLED Q900R 8K Smart TV");
		tv[2].setPqi(4300);
		tv[2].setResolutionWidth(7680);
		tv[2].setResolutionHeight(4320);
		tv[2].setScreenSize("83\"");
		tv[2].setPowerSupply("AC100-240V 50/60Hz");
		tv[2].setPictureEngine("Quantum Processor 8K");
		tv[2].setHdmiPort(4);
		tv[2].setUsbPort(3);
		tv[2].intro(3);
		
		tv[3].setName("A9G | MASTER SERIES | OLED | 4K ULTRA HD | HIGH DYNAMIC RANGE (HDR)");
		tv[3].setPqi(3840);
		tv[3].setResolutionWidth(4096);
		tv[3].setResolutionHeight(2160);
		tv[3].setScreenSize("50\"");
		tv[3].setPowerSupply("50/60 Hz AC 110-240 V");
		tv[3].setPictureEngine("Picture Processor X1™ Ultimate");
		tv[3].setHdmiPort(3);
		tv[3].setUsbPort(3);
		tv[3].intro(4);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		Television SmartTv1 = new Television();
		System.out.println("Smart Tv no.1 : " + SmartTv1.add(2,3) + " Ports");
		
		Television SmartTv2 = new Television();
		System.out.println("Smart Tv no.2 : " + SmartTv2.add(2,4) + " Ports");
		
		Television SmartTv3 = new Television();
		System.out.println("Smart Tv no.3 : " + SmartTv3.add(3,4) + " Ports");
		
		Television SmartTv4 = new Television();
		System.out.println("Smart Tv no.4 : " + SmartTv4.add(3,3) + " Ports");
		
		
	}



}
