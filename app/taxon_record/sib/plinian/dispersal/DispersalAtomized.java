package taxon_record.sib.plinian.dispersal;

import java.util.List;

import taxon_record.sib.AncillaryData;
import taxon_record.sib.plinian.full_description.MeasurementOrFact;

import com.google.common.collect.Lists;

public class DispersalAtomized {

	/*
	 * Opt
	 * 
	 */
	private List<MeasurementOrFact> purpose = Lists.newArrayList();
	
	/*
	 * Opt
	 * VC
	 */
	private String type;
	
	/*
	 * Opt
	 * VC
	 */
	private String structureDispersed;
	
	/*
	 * Opt
	 */
	private MeasurementOrFact distance;
	
	/*
	 * Opt
	 */
	private List<AncillaryData> ancillaryData;

	public List<MeasurementOrFact> getPurpose() {
		return purpose;
	}

	public void setPurpose(List<MeasurementOrFact> purpose) {
		this.purpose = purpose;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStructureDispersed() {
		return structureDispersed;
	}

	public void setStructureDispersed(String structureDispersed) {
		this.structureDispersed = structureDispersed;
	}

	public MeasurementOrFact getDistance() {
		return distance;
	}

	public void setDistance(MeasurementOrFact distance) {
		this.distance = distance;
	}

	public List<AncillaryData> getAncillaryData() {
		return ancillaryData;
	}

	public void setAncillaryData(List<AncillaryData> ancillaryData) {
		this.ancillaryData = ancillaryData;
	}
	
	
}
