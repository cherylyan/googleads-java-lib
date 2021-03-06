
package com.google.api.ads.dfp.jaxws.v201408;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link CustomFieldOption} objects.
 *             
 *             @param customFieldOptions the custom field options to update
 *             @return the updated custom field options
 *           
 * 
 * <p>Java class for updateCustomFieldOptions element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateCustomFieldOptions">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="customFieldOptions" type="{https://www.google.com/apis/ads/publisher/v201408}CustomFieldOption" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customFieldOptions"
})
@XmlRootElement(name = "updateCustomFieldOptions")
public class CustomFieldServiceInterfaceupdateCustomFieldOptions {

    protected List<CustomFieldOption> customFieldOptions;

    /**
     * Gets the value of the customFieldOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customFieldOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomFieldOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomFieldOption }
     * 
     * 
     */
    public List<CustomFieldOption> getCustomFieldOptions() {
        if (customFieldOptions == null) {
            customFieldOptions = new ArrayList<CustomFieldOption>();
        }
        return this.customFieldOptions;
    }

}
