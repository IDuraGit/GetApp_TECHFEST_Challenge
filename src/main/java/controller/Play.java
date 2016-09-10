/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.utils.Format;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Isaac
 */
public class Play {

    /**
     * @param args the command line arguments
     */
    public static int counterA = 0;
    public static int counterB = 0;

    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        // TODO code application logic here

        boolean triggersUp = false;
        ReadFile readFile = new ReadFile();
        readFile.getAllHours();
        DataTratement dataTratement = new DataTratement();
        ActionTaken_by_Trigger actionTAken_by_Trigger = new ActionTaken_by_Trigger();

        triggersUp = dataTratement.getCompareCurrentSpeed_Average();
        //actionTAken_by_Trigger.activaeMusic();

        if (!triggersUp) {

            actionTAken_by_Trigger.activaeMusic();

        }
        Format format = new Format();

    }

}
