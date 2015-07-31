package taxon_record.sib.plinian.dispersal;

import java.util.List;

import com.google.common.collect.Lists;

import taxon_record.sib.AncillaryData;

public class Dispersal {
	
	/*
	 * Opt
	 * Atomized branch
	 * Tiene AncillaryData
	 * Clase creada para agrupar los elementos
	 */
	private List<DispersalAtomizedBranch> DispersalAtomizedBranch =Lists.newArrayList();
	
	/*
	 * Opt
	 * Unstructured branch
	 */
	//private List<DispersalUnstructuredBranch> distributionUnstructuredBranch;
	private String dispersalUnstructured;
	private List<AncillaryData> ancillaryData =Lists.newArrayList();

}
