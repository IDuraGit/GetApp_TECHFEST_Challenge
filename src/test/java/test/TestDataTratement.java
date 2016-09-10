/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import controller.DataTratement;
import controller.ReadFile;
import controller.Speed;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Isaac
 */
public class TestDataTratement {

    public TestDataTratement() {
        new DataTratement();
    }

    @Test
    public void test_compareCurrentSpeed_Average() throws IOException {

        ReadFile readFile = new ReadFile();
        DataTratement dataTratement = new DataTratement();

        assertTrue(readFile.getAllHours() != -1);

        //  assertFalse(dataTratement.getSpeed_Average() < dataTratement.getCurrentSpeed());
        //assertTrue(dataTratement.getCompareCurrentSpeed_Average());
        //return 1;
    }

    //@Test
    public int test_readFile() throws IOException {

        // open file input stream
        ReadFile readFile = new ReadFile();
        assertTrue(readFile.getAllHours() == 1);

        // assertFalse(reader.equals(null));
        return 1;
    }

    public float test_create_Average() throws IOException {

        ReadFile readFile = new ReadFile();
        assertTrue(readFile.getAllHours() == 1);

        return 1;
    }

}
