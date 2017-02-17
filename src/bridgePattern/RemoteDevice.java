package bridgePattern;

/**
 * Created by pavankumar on 17/2/17.
 */
public abstract class RemoteDevice {

    EntertainmentDevice entertainmentDevice;

    public RemoteDevice(EntertainmentDevice newEntertainmentDevice) {
        entertainmentDevice = newEntertainmentDevice;
    }

    public void buttonFivePressed() {
        entertainmentDevice.buttonFivePressed();
    }

    public void buttonSixPressed() {
        entertainmentDevice.buttonSixPressed();
    }

    public void deviceFeedback() {
        entertainmentDevice.deviceFeedback();
    }

    public void buttonSevenPressed() {
        entertainmentDevice.buttonSevenPressed();
    }

    public void buttonEightPressed() {
        entertainmentDevice.buttonEightPressed();
    }

    public abstract void toggleRemoteLock();

}
