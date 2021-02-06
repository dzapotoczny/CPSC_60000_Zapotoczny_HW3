public class RemoteReceiver {
    public static SmartDevices getActiveSmartDevice(String s){
        if (s.equals("L")) {
            return new SmartLight();
        }
        else if (s.equals("S")){
            return new SmartSpeaker();
        }
        else if (s.equals("T")){
            return new SmartThermostat();
        }
        else{
            return null;
        }
    }
}
