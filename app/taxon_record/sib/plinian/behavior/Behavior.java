package taxon_record.sib.plinian.behavior;

import java.util.List;

import taxon_record.sib.AncillaryData;
import taxon_record.sib.plinian.distribution.DistributionAtomizedBranch;

import com.google.common.collect.Lists;

public class Behavior {
	/*
	 * Opt
	 * Atomized branch
	 * Tiene AncillaryData
	 * Clase creada para agrupar los elementos
	 */
	private List<BehaviorAtomizedBranch> behaviorAtomizedBranch =Lists.newArrayList();
	
	/*
	 * Opt
	 * Unstructured branch
	 */
	//private List<BehaviorUnstructuredBranch> distributionUnstructuredBranch;
	private String behaviorUnstructured;
	private List<AncillaryData> ancillaryData =Lists.newArrayList();
}
