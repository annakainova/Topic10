package ru.netology.smarthome;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void setStationTest() {
        Radio radio = new Radio();

        radio.setStation(5);
        int expected = 5;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationCountWithoutConstructorTest() {
        Radio radio = new Radio();

        radio.setStation(10);
        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationCountViaConstructorTest1() {
        Radio radio = new Radio(25);

        radio.setStation(24);
        int expected = 24;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationCountViaConstructorTest2() {
        Radio radio = new Radio(25);

        radio.setStation(25);
        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationCountViaConstructorNextStation() {
        Radio radio = new Radio(25);

        radio.setStation(24);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationCountViaConstructorPrevStation() {
        Radio radio = new Radio(25);

        radio.prevStation();
        int expected = 24;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationHigherThenMaximumTest() {
        Radio radio = new Radio();

        radio.setStation(15);
        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationLowerThenMinimumTest() {
        Radio radio = new Radio();

        radio.setStation(-2);
        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTest() {
        Radio radio = new Radio();

        radio.nextStation();
        int expected = 1;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationHigherThanMaximumTest() {
        Radio radio = new Radio();

        radio.setStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTest() {
        Radio radio = new Radio();

        radio.setStation(4);
        radio.prevStation();
        int expected = 3;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationLowerThanMinimumTest() {
        Radio radio = new Radio();

        radio.prevStation();
        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio radio = new Radio();

        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeTest() {
        Radio radio = new Radio();

        radio.setVolume(50);
        radio.decreaseVolume();
        int expected = 49;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeHigherThanMaximumTest() {
        Radio radio = new Radio();

        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLowerThanMinimumTest() {
        Radio radio = new Radio();

        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeHigherThenMaximum() {
        Radio radio = new Radio();

        radio.setVolume(101);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeLowerThenMinimum() {
        Radio radio = new Radio();

        radio.setVolume(-5);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
