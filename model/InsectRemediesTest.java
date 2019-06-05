package ua.lviv.iot.toolsforcleaning.model;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.toolsforcleaning.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InsectRemediesTest {

	@Test
	void testInsectTypeGetterAndSetter() {
		InsectRemedies dud = new InsectRemedies();
		dud.setInsectType("spider");
		assertEquals("spider", dud.getInsectType(), "There is an error in InsectRemedies setter/getter");
	}

	@Test
	void testToxicityGetterAndSetter() {
		InsectRemedies dud = new InsectRemedies();
		dud.setToxicity(Toxicity.HIGHLY_TOXIC);
		assertEquals(Toxicity.HIGHLY_TOXIC, dud.getToxicity(), "There is an error in InsectRemedies setter/getter");
	}

}