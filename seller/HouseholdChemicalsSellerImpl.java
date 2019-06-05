package ua.lviv.iot.toolsforcleaning.seller;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.toolsforcleaning.model.*;

import java.util.ArrayList;

public class HouseholdChemicalsSellerImpl implements HouseholdChemicalsSeller {

	public HouseholdChemicalsSellerImpl() {
	}

	public List<ToolsForCleaning> householdChemicals = new ArrayList<>();

	public void setHouseholdChemical() {
		householdChemicals.add(new AirFresheners("Mint", 5.6, 3.0, 2.2, "GreatBritain", ChemicalSubstances.ACIDES,
				PointOfUsing.INDOOR));
		householdChemicals.add(
				new LaundryDetergents("Hot", 90, 6.0, 2.0, "Ukraine", ChemicalSubstances.ACIDES, PointOfUsing.INDOOR));
		householdChemicals.add(new ShoeCareTools("leathure", Colours.WHITE, 55.0, 94.7, "Poland",
				ChemicalSubstances.ACIDES, PointOfUsing.INDOOR));
		householdChemicals.add(new InsectRemedies("Spiders", Toxicity.HIGHLY_TOXIC, 13.2, 2.5, "Chroatia",
				ChemicalSubstances.ACIDES, PointOfUsing.INDOOR));
	}

	public List<ToolsForCleaning> sortByPrice(boolean reverse) {
		if (reverse) {
			this.householdChemicals.sort((toolOne, toolTwo) -> (int) (toolTwo.getPrice() - toolOne.getPrice()));
		} else {
			this.householdChemicals.sort((toolOne, toolTwo) -> (int) (toolOne.getPrice() - toolTwo.getPrice()));
		}
		return this.householdChemicals;

	}

	public List<ToolsForCleaning> findingOfIndoorChemicals(boolean reverse) {
		return this.householdChemicals.stream()
				.filter(tool -> tool.getChemicalComposition().equals(tool.getChemicalComposition()))
				.collect(Collectors.toList());
	}

	@Override
	public List<ToolsForCleaning> findingOfBlightyGoods(boolean reverse) {
		return this.householdChemicals.stream().filter(tool -> tool.getProducer().equals(tool.getProducer()))
				.collect(Collectors.toList());
	}

}
