package org.hl7.fhir.utg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OIDLookup {

	private static final Map<String, String> OID_URL_MAP = new HashMap<String, String>() {
		private static final long serialVersionUID = 1L;
		{
			// put("some OID", "http://some.url");
			// V2 OIDS
			put("2.16.840.1.113883.6.301.9"    , "http://terminology.hl7.org/CodeSystem/v3-extTmp-OCEEC"   );

			put("1.0.3166.1.2.2"               , "urn:iso:std:iso:3166 "                                   );
			put("1.2.840.10008.2.16.4"         , "http://dicom.nema.org/resources/ontology/DCM"            );
			put("1.3.160"                      , "https://www.gs1.org/gtin "                               );
			put("2.16.840.1.113883.12.1"       , "http://terminology.hl7.org/CodeSystem/v2-0001"           );
			put("2.16.840.1.113883.12.136"     , "http://terminology.hl7.org/CodeSystem/v2-0532"           );
			put("2.16.840.1.113883.12.162"     , "http://terminology.hl7.org/CodeSystem/v2-0162"           );
			put("2.16.840.1.113883.12.163"     , "http://terminology.hl7.org/CodeSystem/v2-0163"           );
			put("2.16.840.1.113883.12.189"     , "http://terminology.hl7.org/CodeSystem/v2-0189"           );
			put("2.16.840.1.113883.12.2"       , "http://terminology.hl7.org/CodeSystem/v2-0002"           );
			put("2.16.840.1.113883.12.203"     , "http://terminology.hl7.org/CodeSystem/v2-0203"           );
			put("2.16.840.1.113883.12.292"     , "http://hl7.org/fhir/sid/cvx"                             );
			put("2.16.840.1.113883.12.6"       , "http://terminology.hl7.org/CodeSystem/v2-0006"           );
			put("2.16.840.1.113883.13.191"     , "http://www.ncbi.nlm.nih.gov/pubmed"                      );
			put("2.16.840.1.113883.2.4.4.31.1" , "http://hl7.org/fhir/sid/icpc-1-nl"                       );
			put("2.16.840.1.113883.3.1077"     , "http://clinicaltrials.gov"                               );
			put("2.16.840.1.113883.3.26.1.2"   , "http://ncimeta.nci.nih.gov "                             );
			put("2.16.840.1.113883.3.3150"     , "http://www.ada.org/snodent"                              );
			put("2.16.840.1.113883.3.912"      , "http://cancer.sanger.ac.uk/cancergenome/projects/cosmic" );
			put("2.16.840.1.113883.3.913"      , "http://www.pharmgkb.org"                                 );
			put("2.16.840.1.113883.4.9"        , "http://fdasis.nlm.nih.gov "                              );
			// Ted said do not generate for this oid
			//put("2.16.840.1.113883.5.1105"     , "http://hl7.org/fhir/NamingSystem/ca-hc-din "             );
			//put("2.16.840.1.113883.5.1105"     , "http://hl7.org/fhir/sid/ca-hc-npn "                      );
			put("2.16.840.1.113883.6.1"        , "http://loinc.org "                                       );
			put("2.16.840.1.113883.6.101"      , "http://nucc.org/provider-taxonomy "                      );
			put("2.16.840.1.113883.6.12"       , "http://www.ama-assn.org/go/cpt "                         );
			put("2.16.840.1.113883.6.139"      , "http://hl7.org/fhir/sid/icpc-2 "                         );
			put("2.16.840.1.113883.6.14"       , "http://terminology.hl7.org/CodeSystem/HCPCS"             );
			put("2.16.840.1.113883.6.174"      , "http://www.omim.org"                                     );
			put("2.16.840.1.113883.6.209"      , "http://hl7.org/fhir/ndfrt "                              );
			put("2.16.840.1.113883.6.24"       , "urn:iso:std:iso:11073:10101 "                            );
			put("2.16.840.1.113883.6.254"      , "http://hl7.org/fhir/sid/icf-nl "                         );
			put("2.16.840.1.113883.6.256 "     , "http://www.radlex.org "                                  );
			put("2.16.840.1.113883.6.280"      , "http://www.ncbi.nlm.nih.gov/refseq/"                     );
			put("2.16.840.1.113883.6.281"      , "http://www.genenames.org"                                );
			put("2.16.840.1.113883.6.282"      , "http://varnomen.hgvs.org/"                               );
			put("2.16.840.1.113883.6.283"      , "http://www.lrg-sequence.org"                             );
			put("2.16.840.1.113883.6.284"      , "http://www.ncbi.nlm.nih.gov/projects/SNP"                );
			put("2.16.840.1.113883.6.301.5"    , "http://www.nubc.org/patient-discharge "                  );
			put("2.16.840.1.113883.6.341"      , "http://www.ebi.ac.uk/ipd/imgt/hla "                      );
			put("2.16.840.1.113883.6.344"      , "http://hl7.org/fhir/sid/dsm5 "                           );
			put("2.16.840.1.113883.6.69"       , "http://hl7.org/fhir/sid/ndc "                            );
			put("2.16.840.1.113883.6.73"       , "http://www.whocc.no/atc "                                );
			put("2.16.840.1.113883.6.8"        , "http://unitsofmeasure.org "                              );
			put("2.16.840.1.113883.6.88"       , "http://www.nlm.nih.gov/research/umls/rxnorm"             );
			put("2.16.840.1.113883.6.96"       , "http://snomed.info/sct "                                 );	
			
			// V3
			put("1.0.21000.6"                  , "http://terminology.hl7.org/CodeSystem/v3-extTmp-RDD"                                                      );
			put("1.0.3166.1"                   , "http://terminology.hl7.org/CodeSystem/v3-extTmp-3166-1-all"                                               );
			//put("1.0.3166.1.2"                 , "http://terminology.hl7.org/CodeSystem/v3-extTmp-3166-1-ed2"                                               );
			put("1.0.3166.1.2.1"               , "http://terminology.hl7.org/CodeSystem/v3-extTmp-3166-1-ed2num"                                            );
			put("1.0.3166.1.2.2"               , "http://terminology.hl7.org/CodeSystem/v3-extTmp-3166-1-ed2alpha2"                                         );
			put("1.0.3166.1.2.3"               , "http://terminology.hl7.org/CodeSystem/v3-extTmp-3166-1-ed2alpha3"                                         );
			put("1.0.3166.2"                   , "http://terminology.hl7.org/CodeSystem/v3-extTmp-3166-2"                                                   );
			put("1.0.4217"                     , "http://terminology.hl7.org/CodeSystem/v3-extTmp-4217"                                                     );
			put("1.0.639.1"                    , "http://terminology.hl7.org/CodeSystem/v3-extTmp-639-1"                                                    );
			put("1.0.639.2"                    , "http://terminology.hl7.org/CodeSystem/v3-extTmp-639-2"                                                    );
			put("1.0.639.3"                    , "http://terminology.hl7.org/CodeSystem/v3-extTmp-639-3"                                                    );
			put("1.2.840.10008.2.16.4"         , "http://dicom.nema.org/medical/dicom"                                                                      );
			put("1.3.160"                      , "http://terminology.hl7.org/CodeSystem/v3-extTmp-gtin"                                                     );
			put("2.16.840.1.113883.1.18"       , "http://terminology.hl7.org/CodeSystem/v3-TrigEventID"                                                     );
			put("2.16.840.1.113883.2.13"       , "http://terminology.hl7.org/CodeSystem/v3-extTmp-ncpdp-sbu"                                                );
			put("2.16.840.1.113883.2.20.5.1"   , "http://terminology.hl7.org/CodeSystem/v3-extTmp-pclocd"                                                   );
			put("2.16.840.1.113883.2.20.5.2"   , "http://terminology.hl7.org/CodeSystem/v3-extTmp-sctmp"                                                    );
			put("2.16.840.1.113883.2.20.5.3"   , "http://terminology.hl7.org/CodeSystem/v3-extTmp-scptype"                                                  );
			put("2.16.840.1.113883.2.20.5.4"   , "http://terminology.hl7.org/CodeSystem/v3-extTmp-scpqual"                                                  );
			put("2.16.840.1.113883.2.21.10"    , "http://terminology.hl7.org/CodeSystem/v3-extTmp-brz-pcsus"                                                );
			put("2.16.840.1.113883.3.26.1.1"   , "http://ncithesaurus-stage.nci.nih.gov"                                                                    );
			put("2.16.840.1.113883.3.26.1.5"   , "http://terminology.hl7.org/CodeSystem/v3-extTmp-nci-ndfrt"                                                );
			put("2.16.840.1.113883.3.84"       , "http://terminology.hl7.org/CodeSystem/v3-extTmp-FDBHIC"                                                   );
			put("2.16.840.1.113883.4.79"       , "http://terminology.hl7.org/CodeSystem/v3-extTmp-GDCF"                                                     );
			put("2.16.840.1.113883.4.80"       , "http://terminology.hl7.org/CodeSystem/v3-extTmp-GCRT"                                                     );
			put("2.16.840.1.113883.4.81"       , "http://terminology.hl7.org/CodeSystem/v3-extTmp-gs-cpnum"                                                 );
			put("2.16.840.1.113883.5.1102"     , "http://terminology.hl7.org/CodeSystem/v3-extTmp-opinions"                                                 );
			put("2.16.840.1.113883.5.1103"     , "http://www.canada.ca/en/health-canada/services/drugs-health-products/drug-products/drug-product-database" );
			put("2.16.840.1.113883.5.1104"     , "http://www.canada.ca/en/health-canada/services/drugs-health-products/drug-products/drug-product-database" );
			put("2.16.840.1.113883.5.1105"     , "http://www.canada.ca/en/health-canada/services/drugs-health-products/drug-products/drug-product-database" );
			put("2.16.840.1.113883.5.1106"     , "http://www.canada.ca/en/health-canada/services/drugs-health-products/drug-products/drug-product-database" );
			put("2.16.840.1.113883.5.53"       , "http://terminology.hl7.org/CodeSystem/v3-HealthcareProviderTaxonomyHIPAA"                                 );
			put("2.16.840.1.113883.5.79"       , "http://terminology.hl7.org/CodeSystem/v3-extTmp-mediatypes"                                               );
			put("2.16.840.1.113883.6.10"       , "http://www.iana.org/assignments/media-types"                                                              );
			put("2.16.840.1.113883.6.100"      , "http://terminology.hl7.org/CodeSystem/v3-extTmp-639-2"                                                    );
			put("2.16.840.1.113883.6.102"      , "http://terminology.hl7.org/CodeSystem/v3-extTmp-DEEDS"                                                    );
			put("2.16.840.1.113883.6.102.2.10" , "http://terminology.hl7.org/CodeSystem/v3-extTmp-DEEDS210"                                                 );
			put("2.16.840.1.113883.6.102.4.12" , "http://terminology.hl7.org/CodeSystem/v3-extTmp-DEEDS412"                                                 );
			put("2.16.840.1.113883.6.102.4.14" , "http://terminology.hl7.org/CodeSystem/v3-extTmp-DEEDS414"                                                 );
			put("2.16.840.1.113883.6.102.4.15" , "http://terminology.hl7.org/CodeSystem/v3-extTmp-DEEDS415"                                                 );
			put("2.16.840.1.113883.6.102.4.16" , "http://terminology.hl7.org/CodeSystem/v3-extTmp-DEEDS416"                                                 );
			put("2.16.840.1.113883.6.102.4.18" , "http://terminology.hl7.org/CodeSystem/v3-extTmp-DEEDS418"                                                 );
			put("2.16.840.1.113883.6.102.4.2"  , "http://terminology.hl7.org/CodeSystem/v3-extTmp-DEEDS402"                                                 );
			put("2.16.840.1.113883.6.102.4.22" , "http://terminology.hl7.org/CodeSystem/v3-extTmp-DEEDS422"                                                 );
			put("2.16.840.1.113883.6.102.4.24" , "http://terminology.hl7.org/CodeSystem/v3-extTmp-DEEDS424"                                                 );
			put("2.16.840.1.113883.6.102.4.27" , "http://terminology.hl7.org/CodeSystem/v3-extTmp-DEEDS427"                                                 );
			put("2.16.840.1.113883.6.102.4.5"  , "http://terminology.hl7.org/CodeSystem/v3-extTmp-DEEDS405"                                                 );
			put("2.16.840.1.113883.6.102.4.7"  , "http://terminology.hl7.org/CodeSystem/v3-extTmp-DEEDS407"                                                 );
			put("2.16.840.1.113883.6.102.4.8"  , "http://terminology.hl7.org/CodeSystem/v3-extTmp-DEEDS408"                                                 );
			put("2.16.840.1.113883.6.102.5.19" , "http://terminology.hl7.org/CodeSystem/v3-extTmp-DEEDS519"                                                 );
			put("2.16.840.1.113883.6.102.5.6"  , "http://terminology.hl7.org/CodeSystem/v3-extTmp-DEEDS506"                                                 );
			put("2.16.840.1.113883.6.102.5.8"  , "http://terminology.hl7.org/CodeSystem/v3-extTmp-DEEDS508"                                                 );			
			
		}
	};
	
	private static final Set<String> OID_NO_URL = new HashSet<String>() {
		private static final long serialVersionUID = 1L;
		{
			// add("some OID");
			// V3
			add("2.16.840.1.113883.3.24.6.1");
			add("2.16.840.1.113883.3.24.6.2");

		}
	};
	
/*	private static final Set<String> OID_DO_NOT_GENERATE = new HashSet<String>() {
		private static final long serialVersionUID = 1L;
		{
			// add("some OID");
			// V3
			add("2.16.840.1.113883.5.1105"   );
			add("2.16.840.1.113883.5.1107"   );
			add("2.16.840.1.113883.6"        );
			add("2.16.840.1.113883.6.103"    );
			add("2.16.840.1.113883.6.104"    );
			add("2.16.840.1.113883.6.11"     );
			add("2.16.840.1.113883.6.12"     );
			add("2.16.840.1.113883.6.121"    );
			add("2.16.840.1.113883.6.13"     );
			add("2.16.840.1.113883.6.138"    );
			add("2.16.840.1.113883.6.138.1"  );
			add("2.16.840.1.113883.6.138.10" );
			add("2.16.840.1.113883.6.138.11" );
			add("2.16.840.1.113883.6.138.12" );
			add("2.16.840.1.113883.6.138.13" );
			add("2.16.840.1.113883.6.138.14" );
			add("2.16.840.1.113883.6.138.2"  );
			add("2.16.840.1.113883.6.138.3"  );
			add("2.16.840.1.113883.6.138.4"  );
			add("2.16.840.1.113883.6.138.5"  );
			add("2.16.840.1.113883.6.138.6"  );
			add("2.16.840.1.113883.6.138.7"  );
			add("2.16.840.1.113883.6.138.8"  );
			add("2.16.840.1.113883.6.138.9"  );
			add("2.16.840.1.113883.6.139.1"  );
			add("2.16.840.1.113883.6.139.2"  );
			add("2.16.840.1.113883.6.139.3"  );
			add("2.16.840.1.113883.6.140"    );
			add("2.16.840.1.113883.6.140.1"  );
			add("2.16.840.1.113883.6.140.2"  );
			add("2.16.840.1.113883.6.142"    );
			add("2.16.840.1.113883.6.142.1"  );
			add("2.16.840.1.113883.6.142.2"  );
			add("2.16.840.1.113883.6.142.3"  );
			add("2.16.840.1.113883.6.142.4"  );
			add("2.16.840.1.113883.6.15"     );
			add("2.16.840.1.113883.6.16"     );
			add("2.16.840.1.113883.6.163"    );
			add("2.16.840.1.113883.6.163.1"  );
			add("2.16.840.1.113883.6.163.2"  );
			add("2.16.840.1.113883.6.163.3"  );
			add("2.16.840.1.113883.6.163.4"  );
			add("2.16.840.1.113883.6.163.5"  );
			add("2.16.840.1.113883.6.163.6"  );
			add("2.16.840.1.113883.6.164"    );
			add("2.16.840.1.113883.6.164.1"  );
			add("2.16.840.1.113883.6.165"    );
			add("2.16.840.1.113883.6.17"     );
			add("2.16.840.1.113883.6.177"    );
			add("2.16.840.1.113883.6.18"     );
			add("2.16.840.1.113883.6.19"     );
			add("2.16.840.1.113883.6.2"      );
			add("2.16.840.1.113883.6.20"     );
			add("2.16.840.1.113883.6.208"    );
			add("2.16.840.1.113883.6.21"     );
			add("2.16.840.1.113883.6.22"     );
			add("2.16.840.1.113883.6.23"     );
			add("2.16.840.1.113883.6.230"    );
			add("2.16.840.1.113883.6.230.1"  );
			add("2.16.840.1.113883.6.230.2"  );
			add("2.16.840.1.113883.6.230.3"  );
			add("2.16.840.1.113883.6.230.4"  );
			add("2.16.840.1.113883.6.231"    );
			add("2.16.840.1.113883.6.232"    );
			add("2.16.840.1.113883.6.233"    );
			add("2.16.840.1.113883.6.234"    );
			add("2.16.840.1.113883.6.235"    );
			add("2.16.840.1.113883.6.236"    );
			add("2.16.840.1.113883.6.238"    );
			add("2.16.840.1.113883.6.239"    );
			add("2.16.840.1.113883.6.240"    );
			add("2.16.840.1.113883.6.241"    );
			add("2.16.840.1.113883.6.242"    );
			add("2.16.840.1.113883.6.243"    );
			add("2.16.840.1.113883.6.249"    );
			add("2.16.840.1.113883.6.25"     );
			add("2.16.840.1.113883.6.253"    );
			add("2.16.840.1.113883.6.255"    );
			add("2.16.840.1.113883.6.259"    );
			add("2.16.840.1.113883.6.26"     );
			add("2.16.840.1.113883.6.260"    );
			add("2.16.840.1.113883.6.261"    );
			add("2.16.840.1.113883.6.262"    );
			add("2.16.840.1.113883.6.263"    );
			add("2.16.840.1.113883.6.264"    );
			add("2.16.840.1.113883.6.265"    );
			add("2.16.840.1.113883.6.266"    );
			add("2.16.840.1.113883.6.267"    );
			add("2.16.840.1.113883.6.268"    );
			add("2.16.840.1.113883.6.269"    );
			add("2.16.840.1.113883.6.27"     );
			add("2.16.840.1.113883.6.270"    );
			add("2.16.840.1.113883.6.271"    );
			add("2.16.840.1.113883.6.272"    );
			add("2.16.840.1.113883.6.273"    );
			add("2.16.840.1.113883.6.274"    );
			add("2.16.840.1.113883.6.275"    );
			add("2.16.840.1.113883.6.276"    );
			add("2.16.840.1.113883.6.277"    );
			add("2.16.840.1.113883.6.278"    );
			add("2.16.840.1.113883.6.279"    );
			add("2.16.840.1.113883.6.28"     );
			add("2.16.840.1.113883.6.29"     );
			add("2.16.840.1.113883.6.3"      );
			add("2.16.840.1.113883.6.3.1"    );
			add("2.16.840.1.113883.6.3.2"    );
			add("2.16.840.1.113883.6.3.3"    );
			add("2.16.840.1.113883.6.30"     );
			add("2.16.840.1.113883.6.31"     );
			add("2.16.840.1.113883.6.32"     );
			add("2.16.840.1.113883.6.33"     );
			add("2.16.840.1.113883.6.34"     );
			add("2.16.840.1.113883.6.35"     );
			add("2.16.840.1.113883.6.36"     );
			add("2.16.840.1.113883.6.37"     );
			add("2.16.840.1.113883.6.38"     );
			add("2.16.840.1.113883.6.39"     );
			add("2.16.840.1.113883.6.4"      );
			add("2.16.840.1.113883.6.40"     );
			add("2.16.840.1.113883.6.41"     );
			add("2.16.840.1.113883.6.42"     );
			add("2.16.840.1.113883.6.43"     );
			add("2.16.840.1.113883.6.43.1"   );
			add("2.16.840.1.113883.6.44"     );
			add("2.16.840.1.113883.6.45"     );
			add("2.16.840.1.113883.6.46"     );
			add("2.16.840.1.113883.6.47"     );
			add("2.16.840.1.113883.6.48"     );
			add("2.16.840.1.113883.6.5"      );
			add("2.16.840.1.113883.6.50"     );
			add("2.16.840.1.113883.6.51"     );
			add("2.16.840.1.113883.6.52"     );
			add("2.16.840.1.113883.6.53"     );
			add("2.16.840.1.113883.6.54"     );
			add("2.16.840.1.113883.6.55"     );
			add("2.16.840.1.113883.6.56"     );
			add("2.16.840.1.113883.6.57"     );
			add("2.16.840.1.113883.6.58"     );
			add("2.16.840.1.113883.6.59"     );
			add("2.16.840.1.113883.6.6"      );
			add("2.16.840.1.113883.6.60"     );
			add("2.16.840.1.113883.6.61"     );
			add("2.16.840.1.113883.6.62"     );
			add("2.16.840.1.113883.6.63"     );
			add("2.16.840.1.113883.6.64"     );
			add("2.16.840.1.113883.6.65"     );
			add("2.16.840.1.113883.6.66"     );
			add("2.16.840.1.113883.6.67"     );
			add("2.16.840.1.113883.6.68"     );
			add("2.16.840.1.113883.6.69"     );
			add("2.16.840.1.113883.6.7"      );
			add("2.16.840.1.113883.6.71"     );
			add("2.16.840.1.113883.6.72"     );
			add("2.16.840.1.113883.6.73"     );
			add("2.16.840.1.113883.6.74"     );
			add("2.16.840.1.113883.6.75"     );
			add("2.16.840.1.113883.6.76"     );
			add("2.16.840.1.113883.6.77"     );
			add("2.16.840.1.113883.6.78"     );
			add("2.16.840.1.113883.6.79"     );
			add("2.16.840.1.113883.6.8"      );
			add("2.16.840.1.113883.6.80"     );
			add("2.16.840.1.113883.6.81"     );
			add("2.16.840.1.113883.6.82"     );
			add("2.16.840.1.113883.6.83"     );
			add("2.16.840.1.113883.6.84"     );
			add("2.16.840.1.113883.6.85"     );
			add("2.16.840.1.113883.6.86"     );
			add("2.16.840.1.113883.6.87"     );
			add("2.16.840.1.113883.6.88"     );
			add("2.16.840.1.113883.6.89"     );
			add("2.16.840.1.113883.6.90"     );
			add("2.16.840.1.113883.6.91"     );
			add("2.16.840.1.113883.6.94"     );
			add("2.16.840.1.113883.6.95"     );
			add("2.16.840.1.113883.6.96"     );
			add("2.16.840.1.113883.6.97"     );
			add("2.16.840.1.113883.6.98"     );
			add("2.16.840.1.113883.6.99"     );
			add("2.16.840.1.114222.4.5.314"  );
			add("2.16.840.1.114222.4.5.315"  );
			add("2.16.840.1.114222.4.5.327"  );
		}
	};
*/	

	public static String getUrl(String oid) {
		return OID_URL_MAP.get(oid);
	}

	public static boolean hasUrlOverride(String oid) {
		return OID_URL_MAP.containsKey(oid);
	}
	
	public static boolean noUrl(String oid) {
		return OID_NO_URL.contains(oid);
	}
	
	public static boolean doNotGenerate(String oid) {
		//return !hasUrlOverride(oid) && OID_DO_NOT_GENERATE.contains(oid);
		return false;
	}
}
