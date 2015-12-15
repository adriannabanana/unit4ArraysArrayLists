

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author Adrianna
 * @version 12/15/15
 */
public class RadarTest
{ 
    @Test 
    public void test1()
    {
        Radar radar = new Radar(100,100,20,80);
        radar.scan();
        
        if (radar.getAccumulatedDetection(20,80) == radar.getNumScans())
        {
            assertNotNull("Monster at (20,80)");
        }
        else
        {
            assertNull("Monster expected at (20,80)");
        }

        
    }
    
    @Test
    public void test2()
    {
        Radar radar = new Radar(100,100,50,50);
        radar.scan();
        
        if (radar.getAccumulatedDetection(50,50) == radar.getNumScans())
        {
            assertNotNull("Monster at (50,50)");
        }
        else
        {
            assertNull("Monster expected at (50,50)");
        }
    }

}
