/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;
import java.io.File;
import java.io.IOException;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Isaac
 */
public class ActionTaken_by_Trigger {

    public ActionTaken_by_Trigger() {
    }

    public void activaeMusic() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("standupRolling.wav");
        boolean completed = false;
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);

        //  clip.setMicrosecondPosition(5*1000000);
        clip.start();
        //clip.loop(10*10000000);
        while (true) {
            try {
                Thread.sleep(100000000);

            } catch (InterruptedException interruptedException) {

                interruptedException.printStackTrace();

            }

            clip.close();

        }

    }

}
