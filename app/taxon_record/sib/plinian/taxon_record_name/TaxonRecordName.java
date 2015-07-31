package taxon_record.sib.plinian.taxon_record_name;

import java.util.List;

import taxon_record.sib.AncillaryData;
import taxon_record.sib.scientificname.ScientificName;

public class TaxonRecordName {
	/*
	 * Obl
	 * http://tdwg.napier.ac.uk/tcs_doc100/#complexType_ScientificName_Link03E58FE8
	 */
	private ScientificName scientificName;
	
	/*
	 * Optional
	 */
	private List<AncillaryData> ancillaryData;
}
