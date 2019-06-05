package ua.lviv.iot.toolsforcleaning.model;

public class AirFresheners extends ToolsForCleaning {

	private String flavour;
	private double volume;

	public AirFresheners() {
	}

	public AirFresheners(String flavour, double volume, double price, double avCostsPerMonth, String producer,
			ChemicalSubstances chemicalComposition, PointOfUsing pointOfUsing) {
		super(price, avCostsPerMonth, producer, chemicalComposition, pointOfUsing);
		this.flavour = flavour;
		this.volume = volume;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

}
