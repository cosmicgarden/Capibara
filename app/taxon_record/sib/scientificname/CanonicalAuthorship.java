package taxon_record.sib.scientificname;

public class CanonicalAuthorship {
	/*
	 * 
	 */
	private String simple;
	
	//choice
	/*
	 * 
	 */
	private NameCitation authorship;
	//--
	/*
	 * Clase creada para agrupar Authorship
	 * http://tdwg.napier.ac.uk/tcs_doc100/#element_CanonicalAuthorship_Link03E59F40
	 */
	private SpecialAuthorship specialAuthorship;
	
	//end choice
}
