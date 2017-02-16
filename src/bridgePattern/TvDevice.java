package bridgePattern;

public class TvDevice extends EntertainmentDevice {

    public TvDevice(int newDeviceState, int newMaxSetting) {
        deviceState = newDeviceState;
        maSetting = newMaxSetting;
    }

    @Override
    public void buttonFivePressed() {
        volumeLevel++;
        System.out.println("volume on " + volumeLevel);
    }

    @Override
    public void buttonSixPressed() {
        volumeLevel--;
        System.out.println("volume on " + volumeLevel);
    }

}