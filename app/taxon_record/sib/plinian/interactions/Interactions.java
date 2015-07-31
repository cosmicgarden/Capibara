package taxon_record.sib.plinian.interactions;

import java.util.List;

import taxon_record.sib.AncillaryData;

import com.google.common.collect.Lists;

public class Interactions {
	/*
	 * Opt
	 * Atomized branch
	 * Tiene AncillaryData
	 * Clase creada para agrupar los elementos
	 */
	private List<InteractionsAtomizedBranch> interactionsAtomizedBranch =Lists.newArrayList();
	
	/*
	 * Opt
	 * Unstructured branch
	 * Tiene AncillaryData
	 */
	private String interactionsUnstructured;
	private List<AncillaryData> ancillaryData =Lists.newArrayList();

}
