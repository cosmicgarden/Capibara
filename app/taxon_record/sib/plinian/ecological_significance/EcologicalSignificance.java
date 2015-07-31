package taxon_record.sib.plinian.ecological_significance;

import java.util.List;

import taxon_record.sib.AncillaryData;

import com.google.common.collect.Lists;

public class EcologicalSignificance {
	/*
	 * Opt
	 * Atomized branch
	 * Tiene AncillaryData
	 * Clase creada para agrupar los elementos
	 */
	private List<EcologicalSignificanceAtomizedBranch> ecologicalSignificanceAtomizedBranch =Lists.newArrayList();
	
	/*
	 * Opt
	 * Unstructured branch
	 */
	private String EcologicalSignificanceUnstructured;
	private List<AncillaryData> ancillaryData =Lists.newArrayList();

}
