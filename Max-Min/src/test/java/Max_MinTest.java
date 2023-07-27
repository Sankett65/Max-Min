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

}