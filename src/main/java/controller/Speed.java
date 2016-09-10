/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;

/**
 *
 * @author Isaac
 */
public class Speed {

    int speed = 0;
    int hour=0;

    String[] speed_8_hours = new String[10];

    public int getSpeed() {
        return speed;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String[] getSpeed_8_hours() {
        return speed_8_hours;
    }

    public void setSpeed_8_hours(String[] speed_8_hours) {
        this.speed_8_hours = speed_8_hours;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
