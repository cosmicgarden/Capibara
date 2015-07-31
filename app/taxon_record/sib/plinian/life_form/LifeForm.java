package taxon_record.sib.plinian.life_form;

import java.util.List;

import com.google.common.collect.Lists;

import taxon_record.sib.AncillaryData;
import taxon_record.sib.plinian.full_description.Detail;

public class LifeForm {
	//Atomized branch
	/*
	 * Obl
	 * Controlled vocabulary
	 */
	private List<Detail> LifeFormAtomized =Lists.newArrayList();
	
	/*
	 * Opt
	 */
	private List<AncillaryData> ancillaryDataA =Lists.newArrayList();
	
	//Unstructured branch
	/*
	 * Obl
	 */
	private String LifeFormUnstructured;
	
	/*
	 * Opt
	 */
	private List<AncillaryData> ancillaryDataU =Lists.newArrayList();
	

}
