package taxon_record.sib.plinian.full_description;

import java.util.List;

import taxon_record.sib.AncillaryData;

public class FullDescription {
	
	/*
	 * Atomized branch
	 */
	/*
	 * Obl
	 * Este elemento tiene AncillaryData
	 */
	private List<Detail> fullDescriptionAtomized;
	
	/*
	 * Opt
	 */
	private List<AncillaryData> AncillaryData;
	
	/*
	 * Unstructured branch
	 */
	
	/*
	 * Obl
	 */
	private String fullDescriptionUnstructured;
	
	/*
	 * Opt
	 */
	private List<AncillaryData> ancillaryData;
	

}
