package taxon_record.sib.darwin_core;

public class ResourceRelationship {
	/*
	 * Opt
	 */
	private String resourceRelationshipID;
	
	/*
	 * Obl
	 */
	private String relatedResourceID;
	
	/*
	 * Obl
	 */
	private String relationshipOfResource;
	
	/*
	 * Opt
	 */
	private String relationshipAccordingTo;
	
	/*
	 * Opt
	 */
	private String relationshipEstablishedDate;
	
	/*
	 * Opt
	 */
	private String relationshipRemarks;

	public String getResourceRelationshipID() {
		return resourceRelationshipID;
	}

	public void setResourceRelationshipID(String resourceRelationshipID) {
		this.resourceRelationshipID = resourceRelationshipID;
	}

	public String getRelatedResourceID() {
		return relatedResourceID;
	}

	public void setRelatedResourceID(String relatedResourceID) {
		this.relatedResourceID = relatedResourceID;
	}

	public String getRelationshipOfResource() {
		return relationshipOfResource;
	}

	public void setRelationshipOfResource(String relationshipOfResource) {
		this.relationshipOfResource = relationshipOfResource;
	}

	public String getRelationshipAccordingTo() {
		return relationshipAccordingTo;
	}

	public void setRelationshipAccordingTo(String relationshipAccordingTo) {
		this.relationshipAccordingTo = relationshipAccordingTo;
	}

	public String getRelationshipEstablishedDate() {
		return relationshipEstablishedDate;
	}

	public void setRelationshipEstablishedDate(String relationshipEstablishedDate) {
		this.relationshipEstablishedDate = relationshipEstablishedDate;
	}

	public String getRelationshipRemarks() {
		return relationshipRemarks;
	}

	public void setRelationshipRemarks(String relationshipRemarks) {
		this.relationshipRemarks = relationshipRemarks;
	}
	
	

}
