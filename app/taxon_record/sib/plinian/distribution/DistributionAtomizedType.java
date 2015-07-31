package taxon_record.sib.plinian.distribution;

import java.util.List;

import com.google.common.collect.Lists;

import taxon_record.sib.AncillaryData;

public class DistributionAtomizedType {
	
	//seleccionar entre estos elementos **
	
	/*Name of the geographic entity
	 * VC. The geographic entity according to ISO 3166
	 */
	private String GeographicEntity;
	
	// OR
	
	/*
	 * Obl
	 * http://rs.tdwg.org/dwc/terms/country
	 */
	private String country;
	
	/*
	 * Opt
	 */
	private String stateProvince;
	
	/*
	 * Opt
	 */
	private String county;
	
	/*
	 * Opt
	 */
	private String municipality;
	
	/*
	 * Opt
	 */
	private String locality;
	
	
	/*
	 * Opt
	 * AncillaryData
	 */
	private List<AncillaryData> ancillaryData =Lists.newArrayList();


	public String getGeographicEntity() {
		return GeographicEntity;
	}


	public void setGeographicEntity(String geographicEntity) {
		GeographicEntity = geographicEntity;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getStateProvince() {
		return stateProvince;
	}


	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}


	public String getCounty() {
		return county;
	}


	public void setCounty(String county) {
		this.county = county;
	}


	public String getMunicipality() {
		return municipality;
	}


	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}


	public String getLocality() {
		return locality;
	}


	public void setLocality(String locality) {
		this.locality = locality;
	}


	public List<AncillaryData> getAncillaryData() {
		return ancillaryData;
	}


	public void setAncillaryData(List<AncillaryData> ancillaryData) {
		this.ancillaryData = ancillaryData;
	}
	
	

}
