package taxon_record.sib.plinian.endemic;

import java.util.List;

import taxon_record.sib.AncillaryData;

import com.google.common.collect.Lists;

public class EndemicAtomized {
	/*
	 * Opt
	 */
	private List<String> endemicTo =Lists.newArrayList();
	
	/*
	 * Optional element
	 */
	private String endemicIn;
	
	/*
	 * Optional element
	 */
	private List<AncillaryData> ancillaryData =Lists.newArrayList();

	public List<String> getEndemicTo() {
		return endemicTo;
	}

	public void setEndemicTo(List<String> endemicTo) {
		this.endemicTo = endemicTo;
	}

	public String getEndemicIn() {
		return endemicIn;
	}

	public void setEndemicIn(String endemicIn) {
		this.endemicIn = endemicIn;
	}

	public List<AncillaryData> getAncillaryData() {
		return ancillaryData;
	}

	public void setAncillaryData(List<AncillaryData> ancillaryData) {
		this.ancillaryData = ancillaryData;
	}
	
	
}
