package taxon_record.sib.plinian.behavior;

import java.util.List;

import taxon_record.sib.AncillaryData;
import taxon_record.sib.plinian.full_description.Detail;

import com.google.common.collect.Lists;

public class BehaviorAtomizedBranch {
	/*
	 * Obli
	 */ 
	private Detail distributionAtomized;
	
	/*
	 * Opt
	 */
	private List<AncillaryData> ancillaryData =Lists.newArrayList();

	public Detail getDistributionAtomized() {
		return distributionAtomized;
	}

	public void setDistributionAtomized(Detail distributionAtomized) {
		this.distributionAtomized = distributionAtomized;
	}

	public List<AncillaryData> getAncillaryData() {
		return ancillaryData;
	}

	public void setAncillaryData(List<AncillaryData> ancillaryData) {
		this.ancillaryData = ancillaryData;
	}
	
	
}
