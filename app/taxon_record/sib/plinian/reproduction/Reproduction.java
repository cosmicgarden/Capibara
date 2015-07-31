package taxon_record.sib.plinian.reproduction;

import java.util.List;

import taxon_record.sib.AncillaryData;
import taxon_record.sib.plinian.full_description.Detail;

import com.google.common.collect.Lists;

public class Reproduction {
	//Atomized branch
		/*
		 * Obl
		 * 
		 */
		private List<Detail> ReproductionAtomized =Lists.newArrayList();;
		
		/*
		 * Opt
		 */
		private List<AncillaryData> ancillaryDataA =Lists.newArrayList();;
		
		//Unstructured branch
		/*
		 * Obl
		 */
		private String ReproductionUnstructured;
		
		/*
		 * Opt
		 */
		private List<AncillaryData> ancillaryDataU =Lists.newArrayList();

}
