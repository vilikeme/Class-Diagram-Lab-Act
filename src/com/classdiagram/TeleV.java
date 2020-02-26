package com.classdiagram;

abstract class TeleV {
	//properties
	private String name;
	private int pqi;
	private int resolutionWidth;
	private int resolutionHeight;
	private String screenSize;
	private String powerSupply;
	private String pictureEngine;
	private int hdmiPort;
	private int usbPort;	

	
	//setters
	public String setName(String name) {
		return this.name = name;
	}
	
	public int setPqi(int pqi) {
		return this.pqi = pqi;
	}
	
	public int setResolutionWidth(int resolutionWidth) {
		return this.resolutionWidth = resolutionWidth;
	}
	
	public int setResolutionHeight(int resolutionHeight) {
		return this.resolutionHeight = resolutionHeight;
	}
	
	public String setScreenSize(String screenSize) {
		return this.screenSize = screenSize;
	}
	
	public String setPowerSupply(String powerSupply) {
		return this.powerSupply = powerSupply;
	}
	
	public String setPictureEngine(String pictureEngine) {
		return this.pictureEngine = pictureEngine;
	}
	
	public int setHdmiPort(int hdmiPort) {
		return this.hdmiPort = hdmiPort;
	}
	
	public int setUsbPort(int usbPort) {
		return this.usbPort = usbPort;
	}

	
	//getters
	public String getName(String name) {
		return this.name;
	}
	
	public int getPqi(int pqi) {
		return this.pqi;
	}
	
	public int getResolutionWidth(int resolutionWidth) {
		return this.resolutionWidth;
	}
	
	public int getResolutionHeight(int resolutionHeight) {
		return this.resolutionHeight;
	}
	
	public String getScreenSize(String screenSize) {
		return this.screenSize;
	}
	
	public String getPowerSupply(String powerSupply) {
		return this.powerSupply;
	}
	
	public String getPictureEngine(String pictureEngine) {
		return this.pictureEngine;
	}
	
	public int getHdmiPort(int hdmiPort) {
		return this.hdmiPort;
	}
	
	public int getUsbPort(int usbPort) {
		return this.usbPort;
	}	
	public void intro(int no) {
		System.out.println(no +".)" + name + " Specifications: ");
		System.out.println("PQI: "+pqi);
		System.out.println("Resolution: " +resolutionWidth + "x" + resolutionHeight);
		System.out.println("Screen Size: "+screenSize);
		System.out.println("Power Supply: "+powerSupply);
		System.out.println("Picture Engine: "+pictureEngine );
		System.out.println("HDMI: "+ hdmiPort);
		System.out.println("USB: "+ usbPort);
	}
	
	

}
