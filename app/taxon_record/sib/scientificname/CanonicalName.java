package taxon_record.sib.scientificname;

import taxon_record.sib.Reference;

public class CanonicalName {
	
	private String simple;
	
	//choice
	/*
	 * 
	 */
	private String uninomial;
	
	//--
	/*
	 * ReferenceType
	 */
	private Reference genus;
	
	//--
	
	/*
	 * Clase creada para los epitetos
	 */
	private Epithet epithet;
	
	//end choice
	
	/*
	 * 	
	 */
	private String CultivarNameGroup;
	
	

	public Epithet getEpithet() {
		return epithet;
	}

	public void setEpithet(Epithet epithet) {
		this.epithet = epithet;
	}

	public String getUninomial() {
		return uninomial;
	}

	public void setUninomial(String uninomial) {
		this.uninomial = uninomial;
	}

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public String getSimple() {
		return simple;
	}

	public void setSimple(String simple) {
		this.simple = simple;
	}

	public String getCultivarNameGroup() {
		return CultivarNameGroup;
	}

	public void setCultivarNameGroup(String cultivarNameGroup) {
		CultivarNameGroup = cultivarNameGroup;
	}	
	
	
		
}
