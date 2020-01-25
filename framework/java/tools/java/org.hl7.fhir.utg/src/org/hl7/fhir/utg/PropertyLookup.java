package org.hl7.fhir.utg;

import java.util.HashMap;
import java.util.Map;

public class PropertyLookup {

	public static final Map<String, String> V2_PROPERTY_URIS = new HashMap<String, String>() {
		private static final long serialVersionUID = 1L;
		{
			put("binding", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#v2-binding");
			put("cld", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#v2-cld");
			put("csoid", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#v2-cs-oid");
			put("csuri", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#v2-cs-uri");
			put("deprecated", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#v2-table-deprecated");
			put("generate", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#v2-generate");
			put("status", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#status");
			put("structuredefinition-wg", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#steward");
			put("table-oid", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#v2-table-oid");
			put("v2-codes-table-comment", "http://hl7.org/fhir/concept-properties#comment");
			put("v2type", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#v2-table-type");
			put("version", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#v2-cs-version");
			put("version-introduced", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#v2-version-introduced");
			put("vocab-domain", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#vocab-domain");
			put("vsoid", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#v2-vs-oid");
			put("where-used", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#v2-where-used");
		}
	};
	
	public static final Map<String, String> V3_PROPERTY_URIS = new HashMap<String, String>() {
		private static final long serialVersionUID = 1L;
		{
			put("ClassifiesClassCode", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-classifies-class-code");
			put("ComponentOf", "http://hl7.org/fhir/concept-properties#partOf");
			put("MayBeQualifiedBy", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-qualified-by");
			put("Name:Act:inboundRelationship:ActRelationship", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-inbound-relationship");
			put("Name:Act:outboundRelationship:ActRelationship", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-outbound-relationship");
			put("Name:Act:participation:Participation", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-participation");
			put("Name:ActRelationship:source:Act", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-ActRelationship-source");
			put("Name:ActRelationship:target:Act", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-ActRelationship-target");
			put("Name:Class", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-Class");
			put("Name:Entity:playedRole:Role", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-Entity-played");
			put("Name:Entity:scopedRole:Role", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-Entity-scoped");
			put("Name:Participation:act:Act", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-Participation-act");
			put("Name:Participation:role:Role", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-Participation-role");
			put("Name:Role:inboundLink:RoleLink", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-Role-inbound");
			put("Name:Role:outboundLink:RoleLink", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-Role-outbound");
			put("Name:Role:participation:Participation", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-Role-participation");
			put("Name:Role:player:Entity", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-Role-player");
			put("Name:Role:scoper:Entity", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-Role-scoper");
			put("OID", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#v3-cs-oid");
			put("OwningAffiliate", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#owning-affiliate");
			put("OwningSection", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#owning-section");
			put("OwningSubSection", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#owning-subsection");
			put("SmallerThan", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#v3-smaller-than");
			put("Sort:Act:inboundRelationship:ActRelationship", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-Act-inbound-sort");
			put("Sort:Act:outboundRelationship:ActRelationship", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-act-outbound-sort");
			put("Sort:Act:participation:Participation", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-Act-participation-sort");
			put("Sort:Entity:playedRole:Role", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-Entity-played-sort");
			put("Sort:Entity:scopedRole:Role", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-Entity-scoped-sort");
			put("Sort:Role:inboundLink:RoleLink", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-Role-inbound-sort");
			put("Sort:Role:outboundLink:RoleLink", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-Role-outbound-sort");
			put("Sort:Role:participation:Participation", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-Role-participation-sort");
			put("appliesTo", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#v3-applies-to");
			put("conductible", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-conductible");
			put("howApplies", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#v3-how-applies");
			put("internalId", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#v3-internal-id");
			put("inverseRelationship", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#v3-inverse-relationship");
			put("isDocumentCharacteristic", "http://terminology.hl7.org/CodeSystem/utg-concept-properties#rim-document-characteristic");
			put("notSelectable", "http://hl7.org/fhir/concept-properties#notSelectable");
			put("status", "http://hl7.org/fhir/concept-properties#status");
			put("subsumedBy", "http://hl7.org/fhir/concept-properties#parent");
			put("synonymCode", "http://hl7.org/fhir/concept-properties#synonym");
		}
	};
	
}