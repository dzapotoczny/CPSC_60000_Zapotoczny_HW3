////////////////////////////////////////////////////////////////////////////////////////////////////
// Name:            Daniel Zapotoczny
// Date:            5-Feb-2021
// Course Name:		CPSC 60000 | Object Oriented Development
// Semester:		Spring I 2021
// Assignment Name:	PROGRAMMING ASSIGNMENT #3 - Command Pattern
// Program Name:	ZapotocznyHW3
////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.ArrayList;
import java.util.List;

public class ZapotocznyHW3 {
    public static void main(String[] args){
        String str = "L";
        SmartDevices smartDevices = RemoteReceiver.getActiveSmartDevice(str);
        CommandOn commandOn = new CommandOn(smartDevices);
        Remote onButton = new Remote(commandOn);
        onButton.click();

        str = "T";
        smartDevices = RemoteReceiver.getActiveSmartDevice(str);
        commandOn = new CommandOn(smartDevices);
        onButton = new Remote(commandOn);
        onButton.click();

        SmartThermostat smartThermostat = new SmartThermostat();
        SmartLight smartLight = new SmartLight();
        SmartSpeaker smartSpeaker = new SmartSpeaker();
        List<SmartDevices> allSmartDevices = new ArrayList<SmartDevices>();
        allSmartDevices.add(smartThermostat);
        allSmartDevices.add(smartLight);
        allSmartDevices.add(smartSpeaker);
        CommandOff allOff = new CommandOff(allSmartDevices);
        Remote allOffButton = new Remote(allOff);
        allOffButton.click();

        CommandOn allOn = new CommandOn(allSmartDevices);
        Remote allOnButton = new Remote(allOn);
        allOnButton.click();

        allOffButton.click();
    }
}
