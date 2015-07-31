package taxon_record.sib.plinian.habitats;

import java.util.List;

import com.google.common.collect.Lists;

import taxon_record.sib.AncillaryData;
import taxon_record.sib.plinian.full_description.Detail;

public class HabitatsAtomizedBranch {
	/*
	 * Obl
	 * Tiene AncillaryData
	 */
	private Detail HabitatAtomized;
	
	/*
	 * Opt
	 */
	private List<AncillaryData> ancillaryData =Lists.newArrayList();

	public Detail getHabitatAtomized() {
		return HabitatAtomized;
	}

	public void setHabitatAtomized(Detail habitatAtomized) {
		HabitatAtomized = habitatAtomized;
	}

	public List<AncillaryData> getAncillaryData() {
		return ancillaryData;
	}

	public void setAncillaryData(List<AncillaryData> ancillaryData) {
		this.ancillaryData = ancillaryData;
	}
	
	

}
