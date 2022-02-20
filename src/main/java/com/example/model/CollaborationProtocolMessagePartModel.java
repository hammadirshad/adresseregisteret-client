package com.example.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/*
 Represents information about a part of a message
 </summary>
 <example>
		<![CDATA[
		<tns:SimplePart tns:id="message_dialogmld_v1p1" tns:mimetype="application/xml">
			<tns:NamespaceSupported tns:location="MsgHead-v1_2.xsd" tns:version="1.2">http://www.kith.no/xmlstds/msghead/2006-05-24</tns:NamespaceSupported>
			<tns:NamespaceSupported tns:location="dialogmelding-1.1.xsd" tns:version="1.1">http://www.kith.no/xmlstds/dialog/2013-01-23</tns:NamespaceSupported>
		</tns:SimplePart>
 ]]>
 </example>
*/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CollaborationProtocolMessagePartModel implements Serializable {

    /**
     * The XML namespace that defines content provided by the part
     */
    public String xmlNamespace;
    /**
     * The xsd file provided by the part
     */
    public String xmlSchema;
    /**
     * Minimum number of occurencies this part can be used
     */
    public int minOccurrence;
    /**
     * Maximum number of occurencies this part can be used
     */
    public int maxOccurrence;
}
