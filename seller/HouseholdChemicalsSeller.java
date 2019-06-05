package ua.lviv.iot.toolsforcleaning.seller;

import java.util.List;

public interface HouseholdChemicalsSeller<ToolsForCleaning> {
	List<ToolsForCleaning> findingOfIndoorChemicals(boolean reverse);

	List<ToolsForCleaning> findingOfBlightyGoods(boolean reverse);

	List<ToolsForCleaning> sortByPrice(boolean reverse);

	void setHouseholdChemical();
}
