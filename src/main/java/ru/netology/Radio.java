package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int minNumber = 0;
    private int maxNumber;
    private int soundVolume;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int amountStation = 10;

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }

    public Radio() {

    }

    public void setCurrentRadioStation(int currentRadioStation) {

        maxNumber = amountStation - 1;

        if (currentRadioStation > maxNumber) {
            return;
        }
        if (currentRadioStation < minNumber) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setSoundVolume(int soundVolume) {

        if(soundVolume > maxVolume) {
            return;
        }
        if (soundVolume < minVolume) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public int getSoundVolume() {
        return soundVolume;
    }



    // Операция next
    public void nextRadioStation() {
        if (currentRadioStation == maxNumber) {
            this.currentRadioStation = minNumber;

        } else {
            currentRadioStation++;
        }
    }

    //Операция prev
    public void prevRadioStation() {
        if (currentRadioStation == minNumber) {
            this.currentRadioStation = maxNumber;
        } else {
            currentRadioStation--;
        }
    }



   // Увеличение +
   public void maxVolumeLevel() {

       if (soundVolume == maxVolume) {
           this.soundVolume = maxVolume;
       }
       else {
           soundVolume++;
       }
   }

    // Уменьшение -
    public void minVolumeLevel() {

        if (soundVolume == minVolume) {
            this.soundVolume = minVolume;
        } else {
            soundVolume--;
        }
    }
}



