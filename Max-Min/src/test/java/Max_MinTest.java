import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Max_MinTest extends Max_Min {
    @Test
     void firstNumberIsMaximum(){
        Max_Min m = new Max_MinTest();
        assertEquals("First number is Maximum",m.maximum(6,4,1));
    }

    @Test
    void secondNumberIsMaximum(){
        Max_Min m = new Max_MinTest();
        assertEquals("Second number is Maximum",m.maximum(6,7,1));
    }


    @Test
    void thirdNumberIsMaximum(){
        Max_Min m = new Max_MinTest();
        assertEquals("Third number is Maximum",m.maximum(6,4,9));
    }

    @Test
    void firstNumberIsMaximumFloat(){
        Max_Min m = new Max_MinTest();
        assertEquals("First number is Maximum",m.maximumFloat(7.8f,4.5f,3.0f));
    }

    @Test
    void secondNumberIsMaximumFloat(){
        Max_Min m = new Max_MinTest();
        assertEquals("Second number is Maximum",m.maximumFloat(6.0f,7.9f,1.0f));
    }


    @Test
    void thirdNumberIsMaximumFloat(){
        Max_Min m = new Max_MinTest();
        assertEquals("Third number is Maximum",m.maximumFloat(8.9f,4.9f,9.0f));
    }

    @Test
    void firstNumberIsMaximumString(){
        Max_Min m = new Max_MinTest();
        assertEquals("First String is Maximum",m.maximumString("Apple","Peach","Banana"));
    }

    @Test
    void secondNumberIsMaximumString(){
        Max_Min m = new Max_MinTest();
        assertEquals("Second String is Maximum",m.maximumString("Apple","Peach","Banana"));
    }
    @Test
    void thirdNumberIsMaximumString(){
        Max_Min m = new Max_MinTest();
        assertEquals("Third String is Maximum",m.maximumString("Apple","Peach","Banana"));
    }


}