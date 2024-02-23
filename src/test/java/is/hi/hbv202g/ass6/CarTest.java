package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private static final String CAR_MODEL_BEETLE = "Beetle";

    private Car car;
    private CarOwner carOwner;

    @Before
    public void setUp() throws Exception {
        car = new Car(CAR_MODEL_BEETLE);
    }

    @Test
    public void testGetNameOfCar() {
        CarOwner carOwner = new CarOwner("John Doe", car);
        assertEquals(CAR_MODEL_BEETLE, carOwner.theOwnedCar.getName());
    }
}
