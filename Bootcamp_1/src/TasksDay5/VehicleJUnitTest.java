package TasksDay5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleJUnitTest {

    @Test
    void start() {
        assertEquals(0, VehicleJUnit.Start());
    }

    @Test
    void speedChange() {
        assertEquals(50, VehicleJUnit.Speed(10, 40));
    }

}