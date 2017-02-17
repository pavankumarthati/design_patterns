package bridgePattern;

/**
 * Created by pavankumar on 17/2/17.
 */
public class SamsungRemoteDevice extends RemoteDevice {

    boolean isLocked;
    public SamsungRemoteDevice(EntertainmentDevice newEntertainmentDevice) {
        super(newEntertainmentDevice);
    }

    @Override
    public void toggleRemoteLock() {
        isLocked = !isLocked;
    }
}
