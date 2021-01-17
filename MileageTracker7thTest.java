

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MileageTracker7thTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MileageTracker7thTest
{
    /**
     * Default constructor for test class MileageTracker7thTest
     */
    public MileageTracker7thTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testIncrementMilesDriven()
    {
        MileageTracker7th testTracker = new MileageTracker7th();
        testTracker.incrementMilesDriven(10);
        double amount = testTracker.getMilesDriven();
        
        /*
         * The assertEquals method verifies that the expected value is equal to the actual (returned)
         *      value. If not, the test fails.
         *  Specify the expected value first and the actual value secoond.
         *  For values of type double (only for doubles), specify a third value which is the epsilon
         *      (i.e., how close is close enough to be equal).
         */
        
        assertEquals(10, amount, 1e-6); // 1 x 10^-6
        
        testTracker.incrementMilesDriven(5);
        amount = testTracker.getMilesDriven();
        assertEquals(15, amount, 1e-6);
    }
    
    @Test
    public void testIncrementFuelConsumed()
    {
        MileageTracker7th testTracker = new MileageTracker7th();
        testTracker.incrementFuelConsumed(2.5);
        double amount = testTracker.getFuelConsumed();
        assertEquals(2.5, amount, 1e-6);
        
        testTracker.incrementFuelConsumed(0.5);
        amount = testTracker.getFuelConsumed();
        assertEquals(3.0, amount, 1e-6);
    }
    
    @Test
    public void testGetMileage()
    {
        MileageTracker7th testTracker = new MileageTracker7th();
        testTracker.incrementMilesDriven(100);
        testTracker.incrementFuelConsumed(4);
        
        double mileage = testTracker.getMileage();
        assertEquals(25.0, mileage, 1e-6);
    }
    
    @Test
    public void testSetVIN()
    {
        MileageTracker7th testTracker = new MileageTracker7th();
        String vin = new String("V176342FGB45B323A");
        testTracker.setVIN(vin);
        String returnedVIN = testTracker.getVIN();
        assertEquals(vin, returnedVIN);
    
    }
    
    
    
    
}
