public class SmartLight implements SmartDevices{
    @Override
    public void on(){
        System.out.println("Light is on");
    }

    @Override
    public void off(){
        System.out.println("Light is off");
    }
}
