package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    void shouldSwitchNextRadioStation() {
        Radio radioStation = new Radio (5);
        radioStation.setCurrentRadioStation(0);
        radioStation.nextRadioStation();

        int expected = 1;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchNextRadioStation4() {
        Radio radioStation = new Radio (5);
        radioStation.setCurrentRadioStation(4);
        radioStation.nextRadioStation();

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchNextRadioStationInvalidMin() {
        Radio radioStation = new Radio (5);
        radioStation.setCurrentRadioStation(-1);
        radioStation.nextRadioStation();

        int expected = 1;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchNextRadioStationInvalidMax() {
        Radio radioStation = new Radio (5);
        radioStation.setCurrentRadioStation(5);
        radioStation.nextRadioStation();

        int expected = 1;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchNextRadioStation1() {
        Radio radioStation = new Radio ();
        radioStation.setCurrentRadioStation(7);
        radioStation.nextRadioStation();

        int expected = 8;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchNextRadioStation19() {
        Radio radioStation = new Radio ();
        radioStation.setCurrentRadioStation(9);
        radioStation.nextRadioStation();

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchPrevRadioStation() {
        Radio radioStation = new Radio (5);
        radioStation.setCurrentRadioStation(0);
        radioStation.prevRadioStation();

        int expected = 4;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);


    }

    @Test
    void shouldSwitchPrevRadioStationInvalidMin() {
        Radio radioStation = new Radio (5);
        radioStation.setCurrentRadioStation(-1);
        radioStation.prevRadioStation();

        int expected = 4;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);


    }

    @Test
    void shouldSwitchPrevRadioStationInvalidMax() {
        Radio radioStation = new Radio (5);
        radioStation.setCurrentRadioStation(5);
        radioStation.prevRadioStation();

        int expected = 4;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);


    }

    @Test
    void shouldSwitchPrevRadioStation1() {
        Radio radioStation = new Radio ();
        radioStation.setCurrentRadioStation(9);
        radioStation.prevRadioStation();

        int expected = 8;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldChooseRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldChooseRadioStationInvalidMin() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldChooseRadioStationInvalidMax() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldChooseRadioStation1() {
        Radio radioStation = new Radio(5);
        radioStation.setCurrentRadioStation(4);

        int expected = 4;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseSoundVolume() {
        Radio radioStation = new Radio();
        radioStation.setSoundVolume(100);
        radioStation.maxVolumeLevel();

        int expected = 100;
        int actual = radioStation.getSoundVolume();
        assertEquals(expected, actual);

    }

    @Test
    void shouldIncreaseSoundVolumeInvalidMin() {
        Radio radioStation = new Radio();
        radioStation.setSoundVolume(-1);
        radioStation.maxVolumeLevel();

        int expected = 1;
        int actual = radioStation.getSoundVolume();
        assertEquals(expected, actual);

    }

    @Test
    void shouldIncreaseSoundVolumeInvalidMax() {
        Radio radioStation = new Radio();
        radioStation.setSoundVolume(101);
        radioStation.maxVolumeLevel();

        int expected = 1;
        int actual = radioStation.getSoundVolume();
        assertEquals(expected, actual);

    }

    @Test
    void shouldDecreaseSoundVolume() {
        Radio radioStation = new Radio();
        radioStation.setSoundVolume(100);
        radioStation.minVolumeLevel();

        int expected = 99;
        int actual = radioStation.getSoundVolume();
        assertEquals(expected, actual);

    }

    @Test
    void shouldDecreaseSoundVolumeInvalidMin() {
        Radio radioStation = new Radio();
        radioStation.setSoundVolume(-1);
        radioStation.minVolumeLevel();

        int expected = 0;
        int actual = radioStation.getSoundVolume();
        assertEquals(expected, actual);

    }

    @Test
    void shouldDecreaseSoundVolumeInvalidMax() {
        Radio radioStation = new Radio();
        radioStation.setSoundVolume(101);
        radioStation.minVolumeLevel();

        int expected = 0;
        int actual = radioStation.getSoundVolume();
        assertEquals(expected, actual);

    }

}