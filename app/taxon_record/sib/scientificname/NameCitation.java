package taxon_record.sib.scientificname;

import java.util.Date;
import java.util.List;

import com.google.common.collect.Lists;

public class NameCitation {
	
	private String simple;
	
	/*
	 * year
	 */
	private List<Date> year =Lists.newArrayList();
	
	/*
	 * agentNames
	 */
	private List<AgentName> authors;
	
	

}
