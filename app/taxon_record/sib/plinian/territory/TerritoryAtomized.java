package taxon_record.sib.plinian.territory;

import java.util.List;

import com.google.common.collect.Lists;

import taxon_record.sib.AncillaryData;
import taxon_record.sib.plinian.full_description.Detail;

public class TerritoryAtomized {
	/*
	 * Optional element
	 */
	private Detail ExtentOfOccurrence;
	
	/*
	 * Optional element
	 */
	private List<AncillaryData> ancillaryData =Lists.newArrayList();

	public Detail getExtentOfOccurrence() {
		return ExtentOfOccurrence;
	}

	public void setExtentOfOccurrence(Detail extentOfOccurrence) {
		ExtentOfOccurrence = extentOfOccurrence;
	}

	public List<AncillaryData> getAncillaryData() {
		return ancillaryData;
	}

	public void setAncillaryData(List<AncillaryData> ancillaryData) {
		this.ancillaryData = ancillaryData;
	}
	
	

}
