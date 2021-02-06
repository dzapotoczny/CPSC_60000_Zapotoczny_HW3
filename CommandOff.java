import java.util.List;

public class CommandOff implements Command {
    private SmartDevices smartDevices;
    private List<SmartDevices> smartDevicesList;

    public CommandOff (SmartDevices smartDev){
        this.smartDevices = smartDev;
    }
    public CommandOff (List<SmartDevices> smartDevList){
        this.smartDevicesList = smartDevList;
    }

    @Override
    public void execute(){
        if (smartDevices != null) {
            smartDevices.off();
        }
        else if (smartDevicesList != null) {
            for (SmartDevices smartDev : smartDevicesList) {
                smartDev.off();
            }
        }
    }
}