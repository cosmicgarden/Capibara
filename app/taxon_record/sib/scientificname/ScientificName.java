package taxon_record.sib.scientificname;

import java.util.Date;
import java.util.List;

import taxon_record.sib.Reference;
import taxon_record.sib.scientificname.typification.TypeName;
import taxon_record.sib.scientificname.typification.TypeVoucher;

/*
 * http://tdwg.napier.ac.uk/tcs_doc100/#complexType_ScientificName_Link03E58FE8
 */
public class ScientificName {
	
	/*
	 * Obl
	 */
	private String simple;
	
	/*
	 *  From TaxonomicRank in v101.xsd,  VC
	 */
	private String rank;
	
	/*
	 * 
	 */
	private CanonicalName canonicalName;
	
	/*
	 * 
	 */
	private CanonicalAuthorship canonicalAuthorship;
	
	/*
	 * 
	 */
	private Reference publishedIn;
	
	/*
	 * year
	 */
	private Date year;
	
	
	/*
	 * 
	 */
	private String microReference;
	
	/*
	 * Optional
	 */
	private Typification typication;
	
	
	/*
	 * Opt
	 */
	private List<NomenclaturalNote> spellingCorrectionOf;
	
	/*
	 * Opt
	 */
	private NomenclaturalNote Basionym;
	
	/*
	 * Opt
	 */
	private NomenclaturalNote BasedOn;
	
	/*
	 * Opt
	 */
	private List<NomenclaturalNote> conservedAgainst;
	
	/*
	 * Opt
	 */
	private NomenclaturalNote laterHomonymOf;
	
	/*
	 * Opt
	 */
	private NomenclaturalNote sanctioned;
	
	
	/*
	 * Opt
	 */
	private NomenclaturalNote replacementNameFor;
	
	/*
	 * Opt
	 */
	private NomenclaturalNote publicationStatus;
	
	/*
	 * Opt
	 */
	private String providerLink;
	
	/*
	 * Opt
	 */
	private Placeholder ProviderSpecificData;
	
	
	/*
	 * Obl Srtring sin espacios vacios 
	 */
	private String id;
	
	/*
	 * op
	 */
	private boolean isAnamorphic;
	
	
}
