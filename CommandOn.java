import java.util.List;

public class CommandOn implements Command {
    private SmartDevices smartDevices = null;
    private List<SmartDevices> smartDevicesList = null;

    public CommandOn (SmartDevices smartDev){
        this.smartDevices = smartDev;
    }
    public CommandOn (List<SmartDevices> smartDevList){
        this.smartDevicesList = smartDevList;
    }

    @Override
    public void execute(){
        if (smartDevices != null) {
            smartDevices.on();
        }
        else if (smartDevicesList != null) {
            for (SmartDevices smartDev : smartDevicesList) {
                smartDev.on();
            }
        }
    }
}
