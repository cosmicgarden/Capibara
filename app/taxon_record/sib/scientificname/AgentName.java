package taxon_record.sib.scientificname;

import taxon_record.sib.Reference;

public class AgentName extends Reference{
	private String name;
	/*
	 * Optional
	 * Value ex or sanctioning
	 */
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
