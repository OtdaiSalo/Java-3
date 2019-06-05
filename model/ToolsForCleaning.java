package ua.lviv.iot.toolsforcleaning.model;

public abstract class ToolsForCleaning {

	private double price;
	private double avCostsPerMonth;
	private String producer;
	private ChemicalSubstances chemicalComposition;
	private PointOfUsing pointOfUsing;

	ToolsForCleaning() {
	}

	public ToolsForCleaning(double price, double avCostsPerMonth, String producer,
			ChemicalSubstances chemicalComposition, PointOfUsing pointOfUsing) {
		this.price = price;
		this.avCostsPerMonth = avCostsPerMonth;
		this.producer = producer;
		this.chemicalComposition = chemicalComposition;
		this.pointOfUsing = pointOfUsing;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getAvCostsPerMonth() {
		return avCostsPerMonth;
	}

	public void setAvCostsPerMonth(double avCostsPerMonth) {
		this.avCostsPerMonth = avCostsPerMonth;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public ChemicalSubstances getChemicalComposition() {
		return chemicalComposition;
	}

	public void setChemicalComposition(ChemicalSubstances chemicalComposition) {
		this.chemicalComposition = chemicalComposition;
	}

	public PointOfUsing getPointOfUsing() {
		return pointOfUsing;
	}

	public void setPointOfUsing(PointOfUsing pointOfUsing) {
		this.pointOfUsing = pointOfUsing;
	}

}
