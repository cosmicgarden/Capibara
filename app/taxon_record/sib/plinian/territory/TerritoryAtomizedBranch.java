package taxon_record.sib.plinian.territory;

import java.util.List;

import taxon_record.sib.AncillaryData;

import com.google.common.collect.Lists;

public class TerritoryAtomizedBranch {
	
	/*
	 * Obligatory element
	 * Have AncillaryData
	 */ 
	private TerritoryAtomized distributionAtomized;
	
	/*
	 * Opt
	 */
	private List<AncillaryData> ancillaryData =Lists.newArrayList();

}
