package taxon_record.sib.plinian.migratory;

import java.util.List;

import taxon_record.sib.AncillaryData;

import com.google.common.collect.Lists;

public class MigratoryAtomized {
	/*
	 * Opt
	 * VC
	 */
	private List<String> causes=Lists.newArrayList();
	
	/*
	 * Opt
	 * VC
	 */
	private List<String> patterns=Lists.newArrayList();
	
	/*
	 * Opt
	 * 
	 */
	private String season;
	
	/*
	 * Opt
	 */
	private List<AncillaryData> ancillaryData =Lists.newArrayList();

	public List<String> getCauses() {
		return causes;
	}

	public void setCauses(List<String> causes) {
		this.causes = causes;
	}

	public List<String> getPatterns() {
		return patterns;
	}

	public void setPatterns(List<String> patterns) {
		this.patterns = patterns;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public List<AncillaryData> getAncillaryData() {
		return ancillaryData;
	}

	public void setAncillaryData(List<AncillaryData> ancillaryData) {
		this.ancillaryData = ancillaryData;
	}
	
	

}
