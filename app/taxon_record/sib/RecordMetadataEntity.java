package taxon_record.sib;

import taxon_record.sib.plinian.revision.Revision;

import com.google.common.collect.Lists;

public class RecordMetadataEntity {
	//*
	private String language;
	
	//Esto debe ser una Lista //*
	private TargetAudiencesEntity targetAudiences;
	
	private Version version;
	
	//Lista
	private Revision revision;
}
