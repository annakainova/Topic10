package ru.netology.smarthome;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {

    private int stationNumber;
    private int currentVolume;
    private int stationCount = 10;

    public Radio(int stationCount) {
        this.stationCount = stationCount;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
    }

    public void setCurrentVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        currentVolume = volume;
    }

    public int getVolume() {
        return currentVolume;
    }

    public void nextStation() {
        if (stationNumber == stationCount - 1) {
            stationNumber = 0;
        } else {
            stationNumber++;
        }
    }

    public void prevStation() {
        if (stationNumber == 0) {
            stationNumber = stationCount - 1;
        } else {
            stationNumber--;
        }
    }

    public void setStationNumber(int station) {
        if (station < 0) {
            return;
        }
        if (station > stationCount - 1) {
            return;
        }
        stationNumber = station;
    }

    public int getStation() {
        return stationNumber;
    }
}
