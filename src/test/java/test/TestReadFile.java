/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import controller.DataTratement;
import controller.ReadFile;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Isaac
 */
public class TestReadFile {

    public TestReadFile() {
    }

    @Test
    public void testReadFile() throws FileNotFoundException, IOException {
        ReadFile readFile = new ReadFile();
        DataTratement dataTratement = new DataTratement();

        assertTrue(readFile.getAllHours() != -1);

        assertFalse(dataTratement.getSpeed_Average() < 50);
        
        

    }
}
