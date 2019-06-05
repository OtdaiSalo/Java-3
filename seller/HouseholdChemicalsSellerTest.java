package ua.lviv.iot.toolsforcleaning.seller;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.toolsforcleaning.model.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.toolsforcleaning.seller.HouseholdChemicalsSellerImpl;

public class HouseholdChemicalsSellerTest  {
	public HouseholdChemicalsSellerTest() {
	}

	HouseholdChemicalsSellerImpl seller = new HouseholdChemicalsSellerImpl();
	List<ToolsForCleaning> toolsList = new ArrayList<>();
	 
	@BeforeEach
	void testSortByPrice() {

		toolsList.add(new AirFresheners("Mint", 5.6, 3.0, 2.2, "GreatBritain", ChemicalSubstances.ACIDES,
				PointOfUsing.INDOOR));
		toolsList.add(
				new LaundryDetergents("Hot", 90, 6.0, 2.0, "Ukraine", ChemicalSubstances.ACIDES, PointOfUsing.INDOOR));
		toolsList.add(new InsectRemedies("Spiders", Toxicity.HIGHLY_TOXIC, 13.2, 2.5, "Chroatia",
				ChemicalSubstances.ACIDES, PointOfUsing.INDOOR));
		toolsList.add(new ShoeCareTools("leathure", Colours.WHITE, 55.0, 94.7, "Poland", ChemicalSubstances.ACIDES,
				PointOfUsing.INDOOR));
}

	@Test	
	void testByPrice() {
		
		double [] correctOrder = {3.0, 6.0, 13.2, 55.0};
		for(int i=0; i<toolsList.size(); i++) {
			System.out.println(correctOrder[i]);
			System.out.println(toolsList.get(i).getPrice());
		if (correctOrder[i] == toolsList.get(i).getPrice()) {
			
		}else {
			System.out.println ("sortByPrice do not work properly");
		}
		}

	}
	
}
