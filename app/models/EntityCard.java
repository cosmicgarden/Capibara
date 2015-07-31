package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.common.collect.Lists;

@Entity
@Table(name = "Cards", schema = "KunderaExamples@plinian_test")
public class EntityCard {
 
  @Id	
  @Column(name="datasetID")
  private String datasetID;
  
  //Date
  @Column(name="dateStamp")
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
  
  





}
