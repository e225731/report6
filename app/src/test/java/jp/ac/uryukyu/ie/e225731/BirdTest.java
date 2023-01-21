package jp.ac.uryukyu.ie.e225731;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//import java.io.IOException;


public class BirdTest {
    @Test void independenceCheck() {
        Bird birdTest = new Bird("pipi");
        assertEquals(birdTest.getName(),"pipi");
    }   
}
