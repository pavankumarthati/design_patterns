package bridgePattern;

public abstract class EntertainmentDevice {
    public int deviceState;
    public int maxSetting;
    public int volumeLevel;

    public abstract void buttonFivePressed();

    public abstract void buttonSixPressed();

    public void buttonSevenPressed() {
        volumeLevel++;
        System.out.println("volumen " + volumeLevel);
    }

    public void buttonEightPressed() {
        volumeLevel--;
        System.out.println("volumne " + volumeLevel);
    }

    public void deviceFeedback() {
        if (deviceState > maxSetting || deviceState < 0) { deviceState = 0; }

        System.out.println("On " + deviceState);
    }

}