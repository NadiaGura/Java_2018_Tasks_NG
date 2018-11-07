package lv.javaguru.demo;

import java.util.Objects;

public class TV {
    public boolean turnedOn;
    private int currentChannel;
    private double currentVolumeLevel;
    private double screenSize;
    private String manufacturer;


    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public void isTurnedOn

    {
        turnedOn = true;

    }

    public void isTurnedOff

    {
        turnedOn = false;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void nextChannel() {
        if (isTurnedOn()) {
            currentChannel++;
        }
        public void previousChannel() {
            if (isTurnedOn()) {
                currentChannel--;
            }
        }

    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setCurrentVolumeLevel(double currentVolumeLevel) {
        this.currentVolumeLevel = currentVolumeLevel;
    }

    public double getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    public double isCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    public void increaseVolume() {
        if (isTurnedOn()) {
            currentVolumeLevel++;
        }
    }

    public void decreaseVolume() {
        if (isTurnedOn()) ;
        {
            currentVolumeLevel--;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return turnedOn == tv.turnedOn &&
                currentChannel == tv.currentChannel &&
                Double.compare(tv.currentVolumeLevel, currentVolumeLevel) == 0 &&
                Double.compare(tv.screenSize, screenSize) == 0 &&
                isTurnedOn == tv.isTurnedOn &&
                isTurnedOff == tv.isTurnedOff &&
                Objects.equals(manufacturer, tv.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(turnedOn, currentChannel, currentVolumeLevel, screenSize, manufacturer, isTurnedOn, isTurnedOff);
    }
    @Override
    public String toString() {
        return "TV{" +
                "turnedOn=" + turnedOn +
                ", currentChannel=" + currentChannel +
                ", currentVolumeLevel=" + currentVolumeLevel +
                ", screenSize=" + screenSize +
                ", manufacturer='" + manufacturer + '\'' +
                ", isTurnedOn=" + isTurnedOn +
                ", isTurnedOff=" + isTurnedOff +
                '}';
    }
}
