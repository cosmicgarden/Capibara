package taxon_record.sib.plinian.migratory;

import java.util.List;

import taxon_record.sib.AncillaryData;

import com.google.common.collect.Lists;

public class Migratory {
	/*
	 * Opt
	 * Atomized branch
	 * Tiene AncillaryData
	 * Clase creada para agrupar los elementos
	 */
	private List<MigratoryAtomizedBranch> migratoryAtomizedBranch =Lists.newArrayList();
	
	/*
	 * Opt
	 * Unstructured branch
	 */
	private String MigratoryUnstructured;
	private List<AncillaryData> ancillaryData =Lists.newArrayList();

}
