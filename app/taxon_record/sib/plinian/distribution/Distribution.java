package taxon_record.sib.plinian.distribution;

import java.util.List;

import com.google.common.collect.Lists;

import taxon_record.sib.AncillaryData;
import taxon_record.sib.eml.TemporalCoverage;

public class Distribution {
	
	/* Opt
	 * Este elemento tiene
	 * AncillaryData
	 */
	private DistributionScope distributionScope;
	
	/*Opt
	 * 
	 */
	private TemporalCoverage temporalCoverage; 
	
	/*
	 * Opt
	 * Atomized branch
	 * Tiene AncillaryData
	 * Clase creada para agrupar los elementos
	 */
	private List<DistributionAtomizedBranch> distributionAtomizedBranch =Lists.newArrayList();
	
	/*
	 * Opt
	 * Unstructured branch
	 * Tiene AncillaryData
	 * Clase creada para agrupar los elementos
	 */
	//private List<DistributionUnstructuredBranch> distributionUnstructuredBranch;
	private String distributionUnstructured;
	private List<AncillaryData> ancillaryData =Lists.newArrayList();
	

}
