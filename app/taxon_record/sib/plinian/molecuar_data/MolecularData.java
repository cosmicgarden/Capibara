package taxon_record.sib.plinian.molecuar_data;

import java.util.List;

import taxon_record.sib.AncillaryData;

import com.google.common.collect.Lists;

public class MolecularData {
	/*
	 * Opt
	 * Atomized branch
	 * Tiene AncillaryData
	 * Clase creada para agrupar los elementos
	 */
	private List<MolecularDataAtomizedBranch> molecularDataAtomizedBranch =Lists.newArrayList();
	
	/*
	 * Opt
	 * Unstructured branch
	 */
	private String molecularDataUnstructured;
	private List<AncillaryData> ancillaryData =Lists.newArrayList();


}
