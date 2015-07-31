package taxon_record.sib;

import java.util.Date;
import java.util.List;

import com.google.common.collect.Lists;

public class AncillaryData {
	//op
	private int identifier;
	
	//ob
	private String dataType;
	
	//op
	private String mimeType;
	
	//op
	private List<AgentEntity> agent =Lists.newArrayList();
	
	//op
	private Date created;
	
	//op
	private Date modified;
	
	//op
	private String title;
	
	//op
	//License type?**
	private String license;
	
	//op
	private String rights;
	
	//op
	private String rightsHolder;
	
	//op //es String? **
	private String bibliographicCitation;
	
	//op // Lenguaje controlado
	private List<String> audience =Lists.newArrayList();
	
	//op
	private String source;
	
	//op // Lista donde cada valor está basado en un lenguaje controlado **
	private List<String> subject = Lists.newArrayList();
	
	//op 
	private String description;
	
	//op //URL
	private List<String> mediaURL = Lists.newArrayList();
	
	//op //URL
	private String thumbnailURL;
	
	//op //**
	private String location;
	
	//op  //decimal WGS84 latitude and longitude (and optional altitude) as defined by the W3C Basic Geo Vocabulary
	private String geoPoint;
	
	//op //** En lugar de String (p.e DOI), se usa lista referenceEntity?
	private List<String> reference = Lists.newArrayList();
	
	//op
	private String additionalInformation;
	
	//op //** Este no está en la documentación: A text description or multimedia resource which describes the taxon
	private String dataObject;
	
	
	
	
	
	
	
	
	
}
