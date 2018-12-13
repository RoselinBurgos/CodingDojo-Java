package com.codingdojo.Phone;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
	@Override
	public String ring() {
		return ("Incoming call "+getRingTone());
	}
	
	@Override
	public String  unlock() {
		return ("unlocked through FingerPrint scan");
	}
	
	@Override
	public void displayInfo() {
		String newLine = System.getProperty("line.separator");
		System.out.println(newLine+"Phone Info"+newLine+"Version Number: "+getVersionNumber()+newLine+"Battery Percentage: "+getBatteryPercentage()+"%"+newLine+"Carrier: "+getCarrier()+newLine+"Ringtone: "+getRingTone()+newLine);
	}
}
