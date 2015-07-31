package taxon_record.sib.plinian.annual_cycles;

import java.util.List;

import taxon_record.sib.AncillaryData;

import com.google.common.collect.Lists;

public class AnnualCycles {
	//Atomized branch
			/*
			 * Obl
			 * 
			 */
			private List<AnnualCycleAtomized> ReproductionAtomized =Lists.newArrayList();;
			
			/*
			 * Opt
			 */
			private List<AncillaryData> ancillaryDataA =Lists.newArrayList();
			
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
