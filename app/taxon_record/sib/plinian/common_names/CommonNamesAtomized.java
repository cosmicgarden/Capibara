package taxon_record.sib.plinian.common_names;

import java.util.List;

import com.google.common.collect.Lists;

import taxon_record.sib.plinian.distribution.Distribution;

public class CommonNamesAtomized {
	/*
	 * Obl
	 */
	private String name;
	
	/* Opt
	 * lenguaje(s) en ISO 639, ej:spa, eng
	 */
	private List<String> language = Lists.newArrayList();;
	
	//Opt
	private Distribution UsedIn;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getLanguage() {
		return language;
	}

	public void setLanguage(List<String> language) {
		this.language = language;
	}

	public Distribution getUsedIn() {
		return UsedIn;
	}

	public void setUsedIn(Distribution usedIn) {
		UsedIn = usedIn;
	}
	
	

}
