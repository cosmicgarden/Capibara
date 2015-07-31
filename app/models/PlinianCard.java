package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import com.google.common.collect.Lists;

public class PlinianCard {
 	
  private String datasetID;
  
  //Date
  private Date dateStamp;
  
  //------
  //dataset type EML
  private List<String> alternateIdentifiers = Lists.newArrayList();
  //private String [] alternateIdentifiers;
  
//**
  private Agent creator = new Agent();
  
  
  private List<String> keywords = new ArrayList<String>();
  //private String [] keywords;
  
  //abstract element
  private String description;
  
  //private Agent contact = new Agent();
  private String contact;
  
  public String getDatasetID() {
	return datasetID;
}

public void setDatasetID(String datasetID) {
	this.datasetID = datasetID;
}

public Date getDateStamp() {
	return dateStamp;
}

public void setDateStamp(Date dateStamp) {
	this.dateStamp = dateStamp;
}

public List<String> getAlternateIdentifiers() {
	return alternateIdentifiers;
}

public void setAlternateIdentifiers(List<String> alternateIdentifiers) {
	this.alternateIdentifiers = alternateIdentifiers;
}

public Agent getCreator() {
	return creator;
}

/*
public void setCreator(Agent creator) {
	this.creator = creator;
}
*/
public void setCreator() {
	this.creator.setAddress("Calle28");
	this.creator.setEmail("ojduque@humboldt.org.co");
	this.creator.setFirstName("Oscar");
	this.creator.setHomepage("www.google.com");
	this.creator.setLastName("Duque");
	this.creator.setOrganisation("SIB");
	this.creator.setPhone("154546");
	this.creator.setPosition("InAsistente");
	this.creator.setRole("Editor");
}

public List<String> getKeywords() {
	return keywords;
}

public void setKeywords(List<String> keywords) {
	this.keywords = keywords;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getContact() {
	return contact;
}

public void setContact(String contact) {
	this.contact = contact;
}

}
