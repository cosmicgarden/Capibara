package taxon_record.sib.eml;

import java.util.Date;

public class TemporalCoverage {
	
	/*Se selecciona entre varios tipos
	 * rangeOfDates ó
	 * singleDateTime
	 */
	
	private Date startDate;
	
	private Date endDate;

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
