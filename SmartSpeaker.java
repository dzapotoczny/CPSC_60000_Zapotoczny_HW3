public class SmartSpeaker implements SmartDevices{
    @Override
    public void on(){
        System.out.println("Speaker is on");
    }

    @Override
    public void off(){
        System.out.println("Speaker is off");
    }
}
