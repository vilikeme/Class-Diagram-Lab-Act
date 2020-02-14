package com.classdiagram;

public class Main0 {
	
	public static void main(String[] args) {
		sub2[] tv = new sub2[44];
		for(int x = 0; x < tv.length; x++) {
			tv[x] = new sub2();
		}
		tv[0].setName("QLED Q9F 4K Smart TV (2018)");
		tv[0].setPqi(3700);
		tv[0].setResolutionWidth(3840);
		tv[0].setResolutionHeight(2160);
		tv[0].setScreenSize("65\"");
		tv[0].setPowerSupply("AC100-240V 50/60Hz");
		tv[0].setPictureEngine("Q Engine");
		tv[0].setHdmiPort(4);
		tv[0].setUsbPort(3);
		tv[0].intro(1);
		
		
		tv[1].setName("QLED Q8C Curved 4K Smart TV (2018)");
		tv[1].setPqi(3300);
		tv[1].setResolutionWidth(3840);
		tv[1].setResolutionHeight(2160);
		tv[1].setScreenSize("55\"");
		tv[1].setPowerSupply("Q Engine");
		tv[1].setHdmiPort(4);
		tv[1].setUsbPort(3);
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
		
	}

}
