package taxon_record.sib.plinian.interactions;

import java.util.List;

import com.google.common.collect.Lists;

import taxon_record.sib.AncillaryData;
import taxon_record.sib.darwin_core.ResourceRelationship;

public class InteractionsAtomized {
	
	/*
	 * Opt
	 */
	private ResourceRelationship interactionSpecies;
	
	/*
	 * Opt
	 */
	private List<String> interactionSpeciesType =Lists.newArrayList();
	
	/*
	 * Opt
	 */
	private List<AncillaryData> ancillaryData =Lists.newArrayList();
}
