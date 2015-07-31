package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import com.google.common.collect.Lists;

public class TestPlinianCard {
 	
  private String datasetID;
  
  //Date
  private Date dateStamp;
  
  //DOI or URI or URY
  private String citation;
  
  //------
  //dataset type EML
  private String dataSet;
  
  private List<String> alternateIdentifiers = Lists.newArrayList();
  //private String [] alternateIdentifiers;
  
  private String title;
  
  //**
  private String creator; //actor
  
  //**
  private String metadataProvider;
  
  //private Date pubDate;
  private String pubDate;
  
  private String language;
  
  //private List<KeywordSet> keywords = Lists.newArrayList();
  private String [] keywords;
  
  //abstract element
  private String description;
  
  private String additionalInfo;
  
  private String intellectualRights;
  
  private String distribution;
  //**
  private String coverage;
  
  private String purpose;
  
  //private Agent contact = new Agent();
  private String contact;
  //**
  private String methods;
  
  //private Project project = new Project();
  private String project;
  
  
  //--------
  //TaxonRecord
  
  //BaseElements
  private String taxonRecordID;
  
  private String nameAccordingTo; //dwc
  
  private String taxonConceptID; //dwc
  
  private String globalUniqueIdentifier;
  
  private String descriptionBaseElement;
  
  //RecordMetadata
  
  private String languageRecordMetadata;
  
  private String targetAudiences;
  
  //private String targetAudiences;
  //targetAudiences classes
  private String audience;
  
  private String audiencesUnstructured;
  
  private String legend;
  //
  
  //private String version;
  //version class
  
  private int major;
  
  private int minor;
  
  private String modifier; //String255
  
  private Date dateIssued;
  
  private boolean preferredFlag;
  
  //private String revision
  //Revision class
  
  //**
  private String associatedParty;//agent
  
  private Date pubDateRevision;
  
  private Date created;
  
  
  
  
  
  //-------
  private String alternateIdentifier;
  
  private String resourceLogoUrl;
  
  private String [] references;
  
  
}
