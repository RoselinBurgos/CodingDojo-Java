package com.codingdojo.Phone;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return(getRingTone());
    }
    @Override
    public String unlock() {
        return("Unlocking via facial Recognition");
    }
    @Override
    public void displayInfo() {
		String newLine = System.getProperty("line.separator");
		System.out.println(newLine+"Phone Info"+newLine+"Version Number: "+getVersionNumber()+newLine+"Battery Percentage: "+getBatteryPercentage()+"%"+newLine+"Carrier: "+getCarrier()+newLine+"Ringtone: "+getRingTone()+newLine);
                    
    }
}

