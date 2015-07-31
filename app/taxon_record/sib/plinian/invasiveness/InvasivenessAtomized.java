package taxon_record.sib.plinian.invasiveness;

import java.util.Date;
import java.util.List;

import taxon_record.sib.AncillaryData;

import com.google.common.collect.Lists;

public class InvasivenessAtomized {
	/*
	 * Opt
	 */
	private String origin;
	
	/*
	 * Opt
	 */
	private String presence;
	
	/*
	 * Opt
	 */
	private String persistence;
	
	/*
	 * Opt
	 */
	private String distribution;
	
	/*
	 * Opt
	 */
	private String harmful;
	
	/*
	 * Opt
	 */
	private Date modified;
	
	/*
	 * Opt
	 */
	private Date startValidDate;
	
	/*
	 * Opt
	 */
	private Date endValidDate;
	
	/*
	 * Opt
	 * VC
	 */
	private String countryCode;
	
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
	private String localityName;
	
	/*
	 * Opt
	 * VC
	 */
	private String language;
	
	/*
	 * Opt
	 */
	private String citation;
	
	/*
	 * Opt
	 */
	private String abundance;
	
	/*
	 * Opt
	 */
	private String trend;
	
	/*
	 * Opt
	 */
	private String rateOfSpread;
	
	/*
	 * Opt
	 */
	private String regulatoryListing;
	
	/*
	 * Opt
	 */
	private String memo;
	
	/*
	 * Opt
	 */
	private String publicationDate;
	
	/*
	 * Opt
	 */
	private String localityType;
	
	/*
	 * Opt
	 */
	private String locationValue;
	
	/*
	 * Opt
	 */
	private String publicationDatePrecision;
	
	/*
	 * Obl
	 */
	private String whatImpact;
	
	/*
	 * Opt
	 */
	private String vector;
	
	/*
	 * Opt
	 */
	private String route;
	
	/*
	 * Opt
	 */
	private List<String> impactTarget =Lists.newArrayList();
	
	/*
	 * Opt
	 */
	private List<AncillaryData> ancillaryData = Lists.newArrayList();;
	
	

}
