package ua.lviv.iot.toolsforcleaning.model;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.toolsforcleaning.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ua.lviv.iot.toolsforcleaning.seller.*;
import ua.lviv.iot.toolsforcleaning.model.*;

public class AirFreshenersTest {

	@Test
	void testFlavourGetterAndSetter() {
		AirFresheners wow = new AirFresheners();
		wow.setFlavour("mint");
		assertEquals("mint", wow.getFlavour(), "There is an error in AirFresheners setter/getter");
	}

	@Test
	void testVolumeGetterAndSetter() {
		AirFresheners yoy = new AirFresheners();
		yoy.setVolume(20.2);
		assertEquals(20.2, yoy.getVolume(), "There is an error in AirFresheners setter/getter");
	}

}
