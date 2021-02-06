public class SmartThermostat implements SmartDevices{
    @Override
    public void on(){
        System.out.println("Thermostat is on");
    }

    @Override
    public void off(){
        System.out.println("Thermostat is off");
    }
}
