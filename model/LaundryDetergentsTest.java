package ua.lviv.iot.toolsforcleaning.model;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.toolsforcleaning.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LaundryDetergentsTest {

	@Test
	void testTypeOfWashingGetterAndSetter() {
		LaundryDetergents zez = new LaundryDetergents();
		zez.setTypeOfWashing("dry");
		assertEquals("dry", zez.getTypeOfWashing(), "There is an error in LaundryDetergents setter/getter");
	}

	@Test
	void testSpendingonWashingGetterAndSetter() {
		LaundryDetergents zez = new LaundryDetergents();
		zez.setSpendingOnOneWashing(20.2);
		assertEquals(20.2, zez.getSpendingOnOneWashing(), "There is an error in LaundryDetergents setter/getter");
	}

}
