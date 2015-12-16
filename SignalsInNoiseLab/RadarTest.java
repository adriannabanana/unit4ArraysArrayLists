

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
        Radar radar = new Radar(100,100);
        radar.setMonsterLocation(20,80);
        for (int i = 0; i < 100; i++)
        {
            radar.scan();
        }
        
        int max = radar.getAccumulatedDetection(0,0);
        int row = 0;
        int col = 0;
        
        for (int i = 0; i < 100; i++)
        {
            for (int j = 0; j < 100; j++)
            {
                if (radar.getAccumulatedDetection(i,j) > max)
                {
                    max = radar.getAccumulatedDetection(i,j);
                    row = i;
                    col = j;
                }
            }
        }
        
        assertEquals(20,row);
        assertEquals(80,col);
        
    }
    
    @Test
    public void test2()
    {
        Radar radar = new Radar(100,100);
        radar.setMonsterLocation(50,50);
        for (int i = 0; i < 100; i++)
        {
            radar.scan();
        }
        
        int max = radar.getAccumulatedDetection(0,0);
        int row = 0;
        int col = 0;
        
        for (int i = 0; i < 100; i++)
        {
            for (int j = 0; j < 100; j++)
            {
                if (radar.getAccumulatedDetection(i,j) > max)
                {
                    max = radar.getAccumulatedDetection(i,j);
                    row = i;
                    col = j;
                }
            }
        }
        
        assertEquals(50,row);
        assertEquals(50,col);
    }

}
