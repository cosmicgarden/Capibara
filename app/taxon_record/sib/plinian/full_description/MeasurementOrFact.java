package taxon_record.sib.plinian.full_description;

import java.util.Date;
import java.util.List;


/*
 * http://rs.gbif.org/extension/dwc/measurements_or_facts.xml
 */
public class MeasurementOrFact {
	
	/*
	 * An identifier for the MeasurementOrFact (information pertaining to measurements, facts, characteristics, or assertions). 
	 * May be a global unique identifier or an identifier specific to the data set
	 */
	private String measurementID;
	
	/*
	 * The nature of the measurement, fact, characteristic, or assertion. 
	 * Recommended best practice is to use a controlled vocabulary
	 */
	private String measurementType;
	
	/*
	 * The value of the measurement, fact, characteristic, or assertion
	 */
	private String measurementValue;
	
	/*
	 * The description of the potential error associated with the measurementValue
	 */
	private String measurementAccuracy;
	
	/*
	 * The units associated with the measurementValue. 
	 * Recommended best practice is to use the International System of Units (SI)
	 */
	private String measurementUnit;
	
	/*
	 * The date on which the MeasurementOrFact was made. 
	 * Recommended to use an encoding scheme, such as ISO 8601:2004(E).
	 */
	private Date measurementDeterminedDate; 
	
	/*
	 * A list (concatenated and separated) of names of people, groups, or organizations 
	 * who determined the value of the MeasurementOrFact
	 */
	private List<String> measurementDeterminedBy;
	
	/*
	 * A description of or reference to (publication, URI) the method or protocol used to determine the measurement, 
	 * fact, characteristic, or assertion
	 */
	private String measurementMethod;
	
	/*
	 * Comments or notes accompanying the MeasurementOrFact.
	 */
	private String measurementRemarks;
	
	/*
	 * Opt
	 */
	private String relatedTo;
	
	

	public String getRelatedTo() {
		return relatedTo;
	}

	public void setRelatedTo(String relatedTo) {
		this.relatedTo = relatedTo;
	}

	public String getMeasurementID() {
		return measurementID;
	}

	public void setMeasurementID(String measurementID) {
		this.measurementID = measurementID;
	}

	public String getMeasurementType() {
		return measurementType;
	}

	public void setMeasurementType(String measurementType) {
		this.measurementType = measurementType;
	}

	public String getMeasurementValue() {
		return measurementValue;
	}

	public void setMeasurementValue(String measurementValue) {
		this.measurementValue = measurementValue;
	}

	public String getMeasurementAccuracy() {
		return measurementAccuracy;
	}

	public void setMeasurementAccuracy(String measurementAccuracy) {
		this.measurementAccuracy = measurementAccuracy;
	}

	public String getMeasurementUnit() {
		return measurementUnit;
	}

	public void setMeasurementUnit(String measurementUnit) {
		this.measurementUnit = measurementUnit;
	}

	public Date getMeasurementDeterminedDate() {
		return measurementDeterminedDate;
	}

	public void setMeasurementDeterminedDate(Date measurementDeterminedDate) {
		this.measurementDeterminedDate = measurementDeterminedDate;
	}

	public List<String> getMeasurementDeterminedBy() {
		return measurementDeterminedBy;
	}

	public void setMeasurementDeterminedBy(List<String> measurementDeterminedBy) {
		this.measurementDeterminedBy = measurementDeterminedBy;
	}

	public String getMeasurementMethod() {
		return measurementMethod;
	}

	public void setMeasurementMethod(String measurementMethod) {
		this.measurementMethod = measurementMethod;
	}

	public String getMeasurementRemarks() {
		return measurementRemarks;
	}

	public void setMeasurementRemarks(String measurementRemarks) {
		this.measurementRemarks = measurementRemarks;
	}

	
}
