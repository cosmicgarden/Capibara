package taxon_record.sib.plinian.molecuar_data;


import java.util.List;

import com.google.common.collect.Lists;

import taxon_record.sib.AncillaryData;
import taxon_record.sib.plinian.full_description.MeasurementOrFact;

public class MolecularDataAtomized {
	/*
	 * Opt
	 */
	private List<MeasurementOrFact> measurementOrFact =Lists.newArrayList();
	
	/*
	 * Opt
	 */
	private String relatedTo;
	
	
	/*
	 * Opt
	 */
	private List<AncillaryData> ancillaryData =Lists.newArrayList();

}
