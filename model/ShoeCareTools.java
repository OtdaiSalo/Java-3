package ua.lviv.iot.toolsforcleaning.model;

public class ShoeCareTools extends ToolsForCleaning {

	private String typeOfShoeMaterial;
	private Colours colour;

	public ShoeCareTools() {
	}

	public ShoeCareTools(String typeOfShoeMaterial, Colours colour, double price, double avCostsPerMonth,
			String producer, ChemicalSubstances chemicalComposition, PointOfUsing pointOfUsing) {
		super(price, avCostsPerMonth, producer, chemicalComposition, pointOfUsing);
		this.typeOfShoeMaterial = typeOfShoeMaterial;
		this.colour = colour;
	}

	public String getTypeOfShoeMaterial() {
		return typeOfShoeMaterial;
	}

	public void setTypeOfShoeMaterial(String typeOfShoeMaterial) {
		this.typeOfShoeMaterial = typeOfShoeMaterial;
	}

	public Colours getColour() {
		return colour;
	}

	public void setColour(Colours colour) {
		this.colour = colour;
	}

}
