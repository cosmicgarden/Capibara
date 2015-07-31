package taxon_record.sib.plinian.territory;

import java.util.List;

import taxon_record.sib.AncillaryData;

import com.google.common.collect.Lists;

public class Territory {
	
	/*
	 * Optional
	 * Atomized branch
	 * Have AncillaryData
	 * This class was created to group the elements of atomizedBranch. 
	 */
	private List<TerritoryAtomizedBranch> behaviorAtomizedBranch =Lists.newArrayList();
	
	/*
	 * Optional element
	 * Unstructured branch
	 */
	private String territoryUnstructured;
	private List<AncillaryData> ancillaryData =Lists.newArrayList();

}
