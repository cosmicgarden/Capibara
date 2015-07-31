package taxon_record.sib.plinian.annual_cycles;

import java.util.List;

import taxon_record.sib.AncillaryData;

import com.google.common.collect.Lists;

public class AnnualCycleAtomized {
	/*
	 * Obl
	 * VC
	 */
	private String event;
	
	/*
	 * Opt
	 * VC
	 * ISO 8601:2004
	 */
	private String startTimeInterval;
	
	/*
	 * Opt
	 * VC
	 * ISO 8601:2004
	 */
	private String endTimeInterval;
	
	/*
	 * Opt
	 */
	private List<AncillaryData> ancillaryData =Lists.newArrayList();

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getStartTimeInterval() {
		return startTimeInterval;
	}

	public void setStartTimeInterval(String startTimeInterval) {
		this.startTimeInterval = startTimeInterval;
	}

	public String getEndTimeInterval() {
		return endTimeInterval;
	}

	public void setEndTimeInterval(String endTimeInterval) {
		this.endTimeInterval = endTimeInterval;
	}

	public List<AncillaryData> getAncillaryData() {
		return ancillaryData;
	}

	public void setAncillaryData(List<AncillaryData> ancillaryData) {
		this.ancillaryData = ancillaryData;
	}
}
