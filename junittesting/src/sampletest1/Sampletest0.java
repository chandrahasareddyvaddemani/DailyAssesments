
package sampletest1;

import static org.junit.Assert.*;  
import junittesting.*;
import org.junit.Test;
import java.util.*;

import junittesting.Sampletesting;  
  
public class Sampletest0 {  
  
    @Test  
    public void testFindMax(){  
    	Sampletesting test = new Sampletesting();
    	int[] arr = {1, 3, 4, 2};
    	int[] arr1 = {-12, -333, -4, -2, -1};
        assertEquals(4,test.findMax(arr));  
        assertEquals(0,test.findMax(arr1));  
    }  
} 
