package ua.lviv.iot.toolsforcleaning.model;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.toolsforcleaning.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShoeCareToolsTest {

	@Test
	void testTypeOfMaterialGetterAndSetter1() {
		ShoeCareTools fuf = new ShoeCareTools();
		fuf.setTypeOfShoeMaterial("leather");
		assertEquals("leather", fuf.getTypeOfShoeMaterial(), "There is an error in ShoeCareTools setter/getter");
	}

	@Test
	void testTypeOfMaterialGetterAndSetter() {
		ShoeCareTools fuf = new ShoeCareTools();
		fuf.setColour(Colours.BLACK);
		assertEquals(Colours.BLACK, fuf.getColour(), "There is an error in ShoeCareTools setter/getter");
	}

}
