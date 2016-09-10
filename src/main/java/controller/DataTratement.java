/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.ReadFile.arraySpeed;

/**
 *
 * @author Isaac
 */
public class DataTratement {

    public DataTratement() {

    }

    float speedAverage;

    public float getSpeedAverage() {
        return speedAverage;
    }

    public void setSpeedAverage(float speedAverage) {
        this.speedAverage = speedAverage;
    }

    public float getSpeed_Average() {

        float speedTotal = 0;

        for (int i = 0; i < 8; i++) {

            speedTotal = speedTotal + arraySpeed[i];

        }

        speedAverage = speedTotal / arraySpeed.length;

        return speedAverage;
    }

    public float getCurrentSpeed() {
        return 50;
    }

    public boolean getCompareCurrentSpeed_Average() {

        boolean activateTriggers = false;
        if (this.getSpeed_Average() > this.getCurrentSpeed()) {

            activateTriggers = false;

        } else {

            activateTriggers = true;
        }

        return activateTriggers;
    }

}
