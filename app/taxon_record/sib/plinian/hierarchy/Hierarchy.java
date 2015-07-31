package taxon_record.sib.plinian.hierarchy;

import java.util.List;

import taxon_record.sib.AncillaryData;

public class Hierarchy {
	
	//Attributes
	private String classification;
	
	private String recommended;
	//-----
	
	/*
	 * Opt
	 */
	private String kingdom;
	
	/*
	 * Opt
	 */
	private String phylum;
	
	/*
	 * Opt
	 */
	private String classHierarchy;
	
	/*
	 * Opt
	 */
	private String order;
	
	/*
	 * Opt
	 */
	private String family;
	
	/*
	 * Opt
	 */
	private String genus;
	
	/*
	 * Opt
	 */
	private String subgenus;
	
	/*
	 * Opt
	 */
	private String taxonRank;
	
	/*
	 * Opt
	 */
	private String specificEpithet;
	
	/*
	 * Opt
	 */
	private String infraspecificEpithet;
	
	/*
	 * Opt
	 */
	private String higherClassification;
	
	/*
	 * Opt
	 */
	private String parentTaxon;
	
	/*
	 * Opt
	 */
	private List<AncillaryData> ancillaryData;

}
