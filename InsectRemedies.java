package ua.lviv.iot.toolsforcleaning.model;

public class InsectRemedies extends ToolsForCleaning {

	private String insectType;
	private Toxicity toxicity;

	public InsectRemedies() {
	}

	public InsectRemedies(String insectType, Toxicity toxicity, double price, double avCostsPerMonth, String producer,
			ChemicalSubstances chemicalComposition, PointOfUsing pointOfUsing) {
		super(price, avCostsPerMonth, producer, chemicalComposition, pointOfUsing);
		this.insectType = insectType;
		this.toxicity = toxicity;
	}

	public String getInsectType() {
		return insectType;
	}

	public void setInsectType(String insectType) {
		this.insectType = insectType;
	}

	public Toxicity getToxicity() {
		return toxicity;
	}

	public void setToxicity(Toxicity toxicity) {
		this.toxicity = toxicity;
	}
	
	@Override
	public String getHeaders() {
		return super.getHeaders()
                + "insectType"
                + "toxicity";
    }
	
	@Override
	public String toCSV() {
        return super.toCSV() +
        		", " + this.insectType +
        		", " + this.toxicity;
    }

}
