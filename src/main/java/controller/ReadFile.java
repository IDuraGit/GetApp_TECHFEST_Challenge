/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import org.apache.commons.lang.ArrayUtils;

/**
 *
 * @author Isaac
 */
public class ReadFile {

    public static int hour_Global;
    public static int speed_Global;

    public static int[] arrayHours;
    public static float[] arraySpeed;

    public static int getHour_Global() {
        return hour_Global;
    }

    public static void setHour_Global(int hour_Global) {
        ReadFile.hour_Global = hour_Global;
    }

    public static int getSpeed_Global() {
        return speed_Global;
    }

    public static void setSpeed_Global(int speed_Global) {
        ReadFile.speed_Global = speed_Global;
    }

    public int getAllHours() throws FileNotFoundException, IOException {

        BufferedReader reader = new BufferedReader(new FileReader(
                "AvgSpeedPerhour.csv"));

// read file line by line
        String line = reader.readLine();
        Scanner scanner = null;

        scanner = new Scanner(line);

        while ((line = reader.readLine()) != null) {
            // Speed speed = new Speed();
            scanner = new Scanner(line);
            scanner.useDelimiter(",");

            String hour1 = scanner.next();
            String speedData1 = scanner.next();
            arrayHours = ArrayUtils.add(arrayHours, Integer.parseInt(hour1));
            arraySpeed = ArrayUtils.add(arraySpeed, Float.parseFloat(speedData1));

        }

        for (int i = 0; i < arrayHours.length; i++) {

            System.out.println("arrayHours" + arrayHours[i]);
            System.out.println("arraySpeed" + arraySpeed[i]);

        }

        return 1;
    }
}
