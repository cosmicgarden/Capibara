package taxon_record.sib.plinian.distribution;

import java.util.List;

import com.google.common.collect.Lists;

import taxon_record.sib.AncillaryData;

public class DistributionScope {
	
	/*Opt
	 *VC
	 */
	private String type;
	
	/*Opt
	 * 
	 */
	private List<AncillaryData> ancillaryData = Lists.newArrayList();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<AncillaryData> getAncillaryData() {
		return ancillaryData;
	}

	public void setAncillaryData(List<AncillaryData> ancillaryData) {
		this.ancillaryData = ancillaryData;
	};

	
}
