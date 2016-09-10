/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runners.Suite;

/**
 *
 * @author Isaac
 */
   //@Suite.SuiteClasses
public class AllTests extends TestCase {

    public static TestSuite suite() {
        TestSuite suite = new TestSuite("Test for the Test package");

                //suite.addTestSuite(TestPlayerB.class);
        return suite;
    }

}
