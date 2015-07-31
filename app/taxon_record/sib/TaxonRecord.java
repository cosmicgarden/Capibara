package taxon_record.sib;

import java.util.List;

import taxon_record.sib.plinian.annual_cycles.AnnualCycles;
import taxon_record.sib.plinian.base_elements.BaseElements;
import taxon_record.sib.plinian.behavior.Behavior;
import taxon_record.sib.plinian.common_names.CommonNamesAtomized;
import taxon_record.sib.plinian.dispersal.Dispersal;
import taxon_record.sib.plinian.distribution.Distribution;
import taxon_record.sib.plinian.ecological_significance.EcologicalSignificance;
import taxon_record.sib.plinian.endemic.EndemicAtomized;
import taxon_record.sib.plinian.environmental_envelope.EnvironmentalEnvelope;
import taxon_record.sib.plinian.feeding.Feeding;
import taxon_record.sib.plinian.full_description.FullDescription;
import taxon_record.sib.plinian.habitats.Habitats;
import taxon_record.sib.plinian.hierarchy.Hierarchy;
import taxon_record.sib.plinian.identification_keys.*;
import taxon_record.sib.plinian.interactions.Interactions;
import taxon_record.sib.plinian.invasiveness.Invasiveness;
import taxon_record.sib.plinian.life_cycle.LifeCycle;
import taxon_record.sib.plinian.life_form.LifeForm;
import taxon_record.sib.plinian.migratory.Migratory;
import taxon_record.sib.plinian.molecuar_data.MolecularData;
import taxon_record.sib.plinian.reproduction.Reproduction;
import taxon_record.sib.plinian.revision.Revision;
import taxon_record.sib.plinian.synonyms.SynonymsAtomized;
import taxon_record.sib.plinian.taxon_record_name.TaxonRecordName;
import taxon_record.sib.plinian.territory.Territory;

import com.google.common.collect.Lists;

public class TaxonRecord {
	
	/*
	 * Obl
	 */
	private BaseElements baseElements;
	
	/*
	 * Opt
	 */
	private String language;
	
	/*
	 * Obl
	 */
	private Version version;
	
	/*
	 * Opt
	 * RecordMetadata > Revision
	 */
	private List<Revision> revision =Lists.newArrayList();
	
	/*
	 * Obl
	 * NomenclatureAndClassification > taxonRecordName
	 * (AncillaryData)
	 */
	private TaxonRecordName taxonRecordName;
	
	/*
	 * Opt
	 * NomenclatureAndClassification > SynonymsClass > SynonymsAtomized
	 * (AncillaryData)
	 */
	private List<SynonymsAtomized> synonymsAtomized;
	
	
	/*
	 * Opt
	 * CommonNamesAtomizedType tiene AncillaryData. Este elemento esta en
	 * NomenclatureAndClassificationClass > CommonNamesClass> CommonNamesAtomizedClass
	 */
	private List<CommonNamesAtomized> commonNamesAtomized;
	
	/*
	 * Opt
	 * NomenclatureAndClassification > Hierarchy
	 */
	private List<Hierarchy> hierarchy;
	
	/*
	 * Opt
	 * TaxonomicDescription > BriefDescription
	 */
	private String briefDescription;
	
	/*
	 * Opt
	 * TaxonomicDescription > FullDescription
	 * Tiene AncillaryData
	 */
	private FullDescription fullDescription;
	
	/*
	 * Opt
	 * TaxonomicDescription > IdentificationKeys 
	 * Tiene AncillaryData
	 */
	private IdentificationKeys IdentificationKeys;
	
	/*
	 * Opt 
	 * NaturalHistory > LifeForm
	 */
	private LifeForm lifeForm;
	
	
	/*
	 * Opt
	 * NaturalHistory > LifeCycle
	 */
	private LifeCycle lifeCycle;
	
	/*
	 * Opt
	 * NaturalHistory > Reproduction
	 */
	private Reproduction Reproduction;
	
	/*
	 * Opt
	 * NaturalHistory > AnnualCycles
	 */
	private AnnualCycles annualCycles;
	
	
	/*
	 * Opt
	 * NaturalHistory > Feeding
	 */
	private Feeding feeding;
	
	/*
	 * Opt
	 * NaturalHistory >  Dispersal
	 */
	private Dispersal dispersal;
	
	/*
	 * Opt
	 * NaturalHistory >  Behavior
	 */
	private Behavior behavior;
	
	/*
	 * Opt
	 * NaturalHistory >  Interactions
	 */
	private Interactions interactions;
	
	/*
	 * Opt
	 * NaturalHistory > MolecularData
	 */
	private MolecularData molecularData;
	
	/*
	 * Opt
	 * NaturalHistory > Migratory
	 */
	private Migratory migratory;
	
	
	/*
	 * Opt
	 * NaturalHistory > Migratory
	 */
	private EcologicalSignificance  ecologicalSignificance;
	
	/*
	 * Opt
	 * NaturalHistory > EnvironmentalEnvelope
	 */
	private EnvironmentalEnvelope environmentalEnvelope;
	
	
	/*
	 * Opt
	 * Invasiveness
	 */
	private Invasiveness invasiveness;
	
	/*
	 * Opt
	 * HabitatAndDistribution > Habitats
	 */
	private Habitats habitats;
	
	/*
	 * Opt
	 * HabitatAndDistribution > Distribution
	 */
	private List<Distribution> distribution =Lists.newArrayList();
	
	/*
	 * Opt
	 * HabitatAndDistribution> Endemic > EndemicAtomized 
	 * Have AncillaryData
	 */
	private EndemicAtomized endemicAtomized;
	
	/*
	 * Optional element
	 * DemographyAndThreat > Territory 
	 */
	private Territory territory;
	
	/*
	 * 
	 */
	
	
	
	
	
	
	
}
