package ua.lviv.iot.toolsforcleaning.model;

public class LaundryDetergents extends ToolsForCleaning {

	private String typeOfWashing;
	private double spendingOnOneWashing;

	public LaundryDetergents() {
	}

	public LaundryDetergents(String typeOfWashing, double spendingOnOneWashing, double price, double avCostsPerMonth,
			String producer, ChemicalSubstances chemicalComposition, PointOfUsing pointOfUsing) {
		super(price, avCostsPerMonth, producer, chemicalComposition, pointOfUsing);
		this.typeOfWashing = typeOfWashing;
		this.spendingOnOneWashing = spendingOnOneWashing;
	}

	public String getTypeOfWashing() {
		return typeOfWashing;
	}

	public void setTypeOfWashing(String typeOfWashing) {
		this.typeOfWashing = typeOfWashing;
	}

	public double getSpendingOnOneWashing() {
		return spendingOnOneWashing;
	}

	public void setSpendingOnOneWashing(double spendingOnOneWashing) {
		this.spendingOnOneWashing = spendingOnOneWashing;
	}
	
	@Override
	public String getHeaders() {
		return super.getHeaders()
                + "typeOfWashing"
                + "spendingOnOneWashing";
    }
	
	@Override
	public String toCSV() {
        return super.toCSV() +
        		", " + this.typeOfWashing +
        		", " + this.spendingOnOneWashing;
    }

}
