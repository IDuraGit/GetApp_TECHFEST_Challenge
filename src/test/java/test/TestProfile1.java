package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import controller.DataTratement;
import controller.Profile1;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Isaac
 */
public class TestProfile1 {

    public TestProfile1() {

        new Profile1();
    }
    static final int PETROL = 1;

    @Test
    public void testSpeedAlteration() {

        Profile1 profile1 = new Profile1();
        DataTratement dataTratement = new DataTratement();

        assertTrue(dataTratement.getSpeedAverage() == profile1.getSpeed());

    }

}
