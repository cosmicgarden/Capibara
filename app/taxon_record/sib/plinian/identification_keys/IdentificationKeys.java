package taxon_record.sib.plinian.identification_keys;

import java.util.List;

import com.google.common.collect.Lists;

import taxon_record.sib.AncillaryData;

public class IdentificationKeys {
	
	/*
	 * Opt
	 */
	private List<String> keys=Lists.newArrayList();;
	
	/*
	 * Opt
	 */
	private List<AncillaryData> ancillaryData = Lists.newArrayList();;

	public List<String> getKeys() {
		return keys;
	}

	public void setKeys(List<String> keys) {
		this.keys = keys;
	}

	public List<AncillaryData> getAncillaryData() {
		return ancillaryData;
	}

	public void setAncillaryData(List<AncillaryData> ancillaryData) {
		this.ancillaryData = ancillaryData;
	}
	
	
}
