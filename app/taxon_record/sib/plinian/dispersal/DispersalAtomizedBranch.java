package taxon_record.sib.plinian.dispersal;

import java.util.List;

import com.google.common.collect.Lists;

import taxon_record.sib.AncillaryData;

public class DispersalAtomizedBranch {
	/*
	 * Obli
	 */
	//private List<DistributionAtomizedType> distributionAtomized;
	private DispersalAtomized distributionAtomized;
	
	/*
	 * Opt
	 */
	private List<AncillaryData> ancillaryData =Lists.newArrayList();
	//private AncillaryData ancillaryData;

	public DispersalAtomized getDistributionAtomized() {
		return distributionAtomized;
	}

	public void setDistributionAtomized(DispersalAtomized distributionAtomized) {
		this.distributionAtomized = distributionAtomized;
	}

	public List<AncillaryData> getAncillaryData() {
		return ancillaryData;
	}

	public void setAncillaryData(List<AncillaryData> ancillaryData) {
		this.ancillaryData = ancillaryData;
	}
	
	

}
