package taxon_record.sib.scientificname.typification;

import java.util.List;

import taxon_record.sib.Reference;

public class TypeVoucher {
	
	private List<Reference> voucherReference; //ReferenceType
	
	private List<Reference> lectotypePublicationVoucher; //ReferenceType
	
	private List<Reference> lectotypeMicroReferenceVoucher; //ReferenceType
	
	private String typeOfType; //Lenguaje controlado NomenclaturalTypeStatusOfUnitsEnum paratype, isotype, holotype **

}
