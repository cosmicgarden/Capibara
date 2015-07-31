package taxon_record.sib.plinian.life_cycle;

import java.util.List;

import com.google.common.collect.Lists;

import taxon_record.sib.AncillaryData;
import taxon_record.sib.plinian.full_description.Detail;

public class LifeCycle {
	//Atomized branch
	/*
	 * Obl
	 * Controlled vocabulary
	 */
	private List<Detail> LifeCycleAtomized =Lists.newArrayList();;
	
	/*
	 * Opt
	 */
	private List<AncillaryData> ancillaryDataA =Lists.newArrayList();;
	
	//Unstructured branch
	/*
	 * Obl
	 */
	private String LifeCycleUnstructured;
	
	/*
	 * Opt
	 */
	private List<AncillaryData> ancillaryDataU =Lists.newArrayList();


}
