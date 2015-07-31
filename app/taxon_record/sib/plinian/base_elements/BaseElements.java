package taxon_record.sib.plinian.base_elements;

import java.util.List;

import com.google.common.collect.Lists;

public class BaseElements {
	
	/*
	 * Obl
	 */
	private String taxonRecordID;
	
	/*
	 * Opt
	 */
	private List<String> taxonConceptID = Lists.newArrayList();
	
	/*
	 * Opt
	 */
	private String globalUniqueIdentifier;
	
	/*
	 * Opt
	 */
	private String abstractBaseElement;

	public String getTaxonRecordID() {
		return taxonRecordID;
	}

	public void setTaxonRecordID(String taxonRecordID) {
		this.taxonRecordID = taxonRecordID;
	}

	public List<String> getTaxonConceptID() {
		return taxonConceptID;
	}

	public void setTaxonConceptID(List<String> taxonConceptID) {
		this.taxonConceptID = taxonConceptID;
	}

	public String getGlobalUniqueIdentifier() {
		return globalUniqueIdentifier;
	}

	public void setGlobalUniqueIdentifier(String globalUniqueIdentifier) {
		this.globalUniqueIdentifier = globalUniqueIdentifier;
	}

	public String getAbstract() {
		return abstractBaseElement;
	}

	public void setAbstract(String abstract1) {
		abstractBaseElement = abstract1;
	}
	
	
	
}
