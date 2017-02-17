package bridgePattern;

/**
 * Created by pavankumar on 17/2/17.
 */
public class TestRemoteDevice {

    public static void main(String [] args) {
        RemoteDevice remoteDevice = new SamsungRemoteDevice(new TvDevice(1, 2000));
        remoteDevice.buttonFivePressed();
        remoteDevice.buttonSixPressed();
        remoteDevice.buttonSevenPressed();
        remoteDevice.buttonEightPressed();
        remoteDevice.deviceFeedback();
    }
}
