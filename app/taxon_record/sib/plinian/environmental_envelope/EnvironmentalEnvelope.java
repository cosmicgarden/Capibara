package taxon_record.sib.plinian.environmental_envelope;

import java.util.List;

import taxon_record.sib.AncillaryData;

import com.google.common.collect.Lists;

public class EnvironmentalEnvelope {
	/*
	 * Opt
	 * Atomized branch
	 * Tiene AncillaryData
	 * Clase creada para agrupar los elementos
	 */
	private List<EnvironmentalEnvelopeAtomizedBranch> migratoryAtomizedBranch =Lists.newArrayList();
	
	/*
	 * Opt
	 * Unstructured branch
	 */
	private String EnvironmentalEnvelopeUnstructured;
	private List<AncillaryData> ancillaryData =Lists.newArrayList();
	
	

}
