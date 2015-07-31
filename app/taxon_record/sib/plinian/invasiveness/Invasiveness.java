package taxon_record.sib.plinian.invasiveness;

import java.util.List;

import taxon_record.sib.AncillaryData;

import com.google.common.collect.Lists;

public class Invasiveness {
	/*
	 * Opt
	 * Atomized branch
	 * Tiene AncillaryData
	 * Clase creada para agrupar los elementos
	 */
	private List<InvasivenessAtomizedBranch> invasivenessAtomizedBranch =Lists.newArrayList();
	
	/*
	 * Opt
	 * Unstructured branch
	 */
	private String InvasivenessUnstructured;
	private List<AncillaryData> ancillaryData =Lists.newArrayList();
}
