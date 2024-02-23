package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car car;
    private CarOwner carOwner;

    @Before
    public void setUp() throws Exception {
        car = new Car("Beetle");
    }

    @Test
    public void testGetNameOfCar() {
        CarOwner carOwner = new CarOwner("John Doe", car);
        assertEquals("Beetle", carOwner.theOwnedCar.getName());
    }

}
