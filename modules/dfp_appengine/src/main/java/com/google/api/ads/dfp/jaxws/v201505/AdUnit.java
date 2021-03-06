
package com.google.api.ads.dfp.jaxws.v201505;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An {@code AdUnit} represents a chunk of identified inventory for the
 *             publisher. It contains all the settings that need to be associated with
 *             inventory in order to serve ads to it. An {@code AdUnit} can also be the
 *             parent of other ad units in the inventory hierarchy.
 *           
 * 
 * <p>Java class for AdUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasChildren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="parentPath" type="{https://www.google.com/apis/ads/publisher/v201505}AdUnitParent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetWindow" type="{https://www.google.com/apis/ads/publisher/v201505}AdUnit.TargetWindow" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201505}InventoryStatus" minOccurs="0"/>
 *         &lt;element name="adUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adUnitSizes" type="{https://www.google.com/apis/ads/publisher/v201505}AdUnitSize" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="targetPlatform" type="{https://www.google.com/apis/ads/publisher/v201505}TargetPlatform" minOccurs="0"/>
 *         &lt;element name="mobilePlatform" type="{https://www.google.com/apis/ads/publisher/v201505}MobilePlatform" minOccurs="0"/>
 *         &lt;element name="explicitlyTargeted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="inheritedAdSenseSettings" type="{https://www.google.com/apis/ads/publisher/v201505}AdSenseSettingsInheritedProperty" minOccurs="0"/>
 *         &lt;element name="partnerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="appliedLabelFrequencyCaps" type="{https://www.google.com/apis/ads/publisher/v201505}LabelFrequencyCap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="effectiveLabelFrequencyCaps" type="{https://www.google.com/apis/ads/publisher/v201505}LabelFrequencyCap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="appliedLabels" type="{https://www.google.com/apis/ads/publisher/v201505}AppliedLabel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="effectiveAppliedLabels" type="{https://www.google.com/apis/ads/publisher/v201505}AppliedLabel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="effectiveTeamIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="appliedTeamIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lastModifiedDateTime" type="{https://www.google.com/apis/ads/publisher/v201505}DateTime" minOccurs="0"/>
 *         &lt;element name="smartSizeMode" type="{https://www.google.com/apis/ads/publisher/v201505}SmartSizeMode" minOccurs="0"/>
 *         &lt;element name="refreshRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isSharedByDistributor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="crossSellingDistributor" type="{https://www.google.com/apis/ads/publisher/v201505}CrossSellingDistributor" minOccurs="0"/>
 *         &lt;element name="externalSetTopBoxChannelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isSetTopBoxEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdUnit", propOrder = {
    "id",
    "parentId",
    "hasChildren",
    "parentPath",
    "name",
    "description",
    "targetWindow",
    "status",
    "adUnitCode",
    "adUnitSizes",
    "targetPlatform",
    "mobilePlatform",
    "explicitlyTargeted",
    "inheritedAdSenseSettings",
    "partnerId",
    "appliedLabelFrequencyCaps",
    "effectiveLabelFrequencyCaps",
    "appliedLabels",
    "effectiveAppliedLabels",
    "effectiveTeamIds",
    "appliedTeamIds",
    "lastModifiedDateTime",
    "smartSizeMode",
    "refreshRate",
    "isSharedByDistributor",
    "crossSellingDistributor",
    "externalSetTopBoxChannelId",
    "isSetTopBoxEnabled"
})
public class AdUnit {

    protected String id;
    protected String parentId;
    protected Boolean hasChildren;
    protected List<AdUnitParent> parentPath;
    protected String name;
    protected String description;
    protected AdUnitTargetWindow targetWindow;
    protected InventoryStatus status;
    protected String adUnitCode;
    protected List<AdUnitSize> adUnitSizes;
    protected TargetPlatform targetPlatform;
    protected MobilePlatform mobilePlatform;
    protected Boolean explicitlyTargeted;
    protected AdSenseSettingsInheritedProperty inheritedAdSenseSettings;
    protected Long partnerId;
    protected List<LabelFrequencyCap> appliedLabelFrequencyCaps;
    protected List<LabelFrequencyCap> effectiveLabelFrequencyCaps;
    protected List<AppliedLabel> appliedLabels;
    protected List<AppliedLabel> effectiveAppliedLabels;
    @XmlElement(type = Long.class)
    protected List<Long> effectiveTeamIds;
    @XmlElement(type = Long.class)
    protected List<Long> appliedTeamIds;
    protected DateTime lastModifiedDateTime;
    protected SmartSizeMode smartSizeMode;
    protected Integer refreshRate;
    protected Boolean isSharedByDistributor;
    protected CrossSellingDistributor crossSellingDistributor;
    protected String externalSetTopBoxChannelId;
    protected Boolean isSetTopBoxEnabled;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentId(String value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the hasChildren property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasChildren() {
        return hasChildren;
    }

    /**
     * Sets the value of the hasChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasChildren(Boolean value) {
        this.hasChildren = value;
    }

    /**
     * Gets the value of the parentPath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentPath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdUnitParent }
     * 
     * 
     */
    public List<AdUnitParent> getParentPath() {
        if (parentPath == null) {
            parentPath = new ArrayList<AdUnitParent>();
        }
        return this.parentPath;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the targetWindow property.
     * 
     * @return
     *     possible object is
     *     {@link AdUnitTargetWindow }
     *     
     */
    public AdUnitTargetWindow getTargetWindow() {
        return targetWindow;
    }

    /**
     * Sets the value of the targetWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdUnitTargetWindow }
     *     
     */
    public void setTargetWindow(AdUnitTargetWindow value) {
        this.targetWindow = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryStatus }
     *     
     */
    public InventoryStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryStatus }
     *     
     */
    public void setStatus(InventoryStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the adUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdUnitCode() {
        return adUnitCode;
    }

    /**
     * Sets the value of the adUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdUnitCode(String value) {
        this.adUnitCode = value;
    }

    /**
     * Gets the value of the adUnitSizes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adUnitSizes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdUnitSizes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdUnitSize }
     * 
     * 
     */
    public List<AdUnitSize> getAdUnitSizes() {
        if (adUnitSizes == null) {
            adUnitSizes = new ArrayList<AdUnitSize>();
        }
        return this.adUnitSizes;
    }

    /**
     * Gets the value of the targetPlatform property.
     * 
     * @return
     *     possible object is
     *     {@link TargetPlatform }
     *     
     */
    public TargetPlatform getTargetPlatform() {
        return targetPlatform;
    }

    /**
     * Sets the value of the targetPlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetPlatform }
     *     
     */
    public void setTargetPlatform(TargetPlatform value) {
        this.targetPlatform = value;
    }

    /**
     * Gets the value of the mobilePlatform property.
     * 
     * @return
     *     possible object is
     *     {@link MobilePlatform }
     *     
     */
    public MobilePlatform getMobilePlatform() {
        return mobilePlatform;
    }

    /**
     * Sets the value of the mobilePlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilePlatform }
     *     
     */
    public void setMobilePlatform(MobilePlatform value) {
        this.mobilePlatform = value;
    }

    /**
     * Gets the value of the explicitlyTargeted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExplicitlyTargeted() {
        return explicitlyTargeted;
    }

    /**
     * Sets the value of the explicitlyTargeted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExplicitlyTargeted(Boolean value) {
        this.explicitlyTargeted = value;
    }

    /**
     * Gets the value of the inheritedAdSenseSettings property.
     * 
     * @return
     *     possible object is
     *     {@link AdSenseSettingsInheritedProperty }
     *     
     */
    public AdSenseSettingsInheritedProperty getInheritedAdSenseSettings() {
        return inheritedAdSenseSettings;
    }

    /**
     * Sets the value of the inheritedAdSenseSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdSenseSettingsInheritedProperty }
     *     
     */
    public void setInheritedAdSenseSettings(AdSenseSettingsInheritedProperty value) {
        this.inheritedAdSenseSettings = value;
    }

    /**
     * Gets the value of the partnerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartnerId() {
        return partnerId;
    }

    /**
     * Sets the value of the partnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartnerId(Long value) {
        this.partnerId = value;
    }

    /**
     * Gets the value of the appliedLabelFrequencyCaps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedLabelFrequencyCaps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedLabelFrequencyCaps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelFrequencyCap }
     * 
     * 
     */
    public List<LabelFrequencyCap> getAppliedLabelFrequencyCaps() {
        if (appliedLabelFrequencyCaps == null) {
            appliedLabelFrequencyCaps = new ArrayList<LabelFrequencyCap>();
        }
        return this.appliedLabelFrequencyCaps;
    }

    /**
     * Gets the value of the effectiveLabelFrequencyCaps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveLabelFrequencyCaps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveLabelFrequencyCaps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelFrequencyCap }
     * 
     * 
     */
    public List<LabelFrequencyCap> getEffectiveLabelFrequencyCaps() {
        if (effectiveLabelFrequencyCaps == null) {
            effectiveLabelFrequencyCaps = new ArrayList<LabelFrequencyCap>();
        }
        return this.effectiveLabelFrequencyCaps;
    }

    /**
     * Gets the value of the appliedLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppliedLabel }
     * 
     * 
     */
    public List<AppliedLabel> getAppliedLabels() {
        if (appliedLabels == null) {
            appliedLabels = new ArrayList<AppliedLabel>();
        }
        return this.appliedLabels;
    }

    /**
     * Gets the value of the effectiveAppliedLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveAppliedLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveAppliedLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppliedLabel }
     * 
     * 
     */
    public List<AppliedLabel> getEffectiveAppliedLabels() {
        if (effectiveAppliedLabels == null) {
            effectiveAppliedLabels = new ArrayList<AppliedLabel>();
        }
        return this.effectiveAppliedLabels;
    }

    /**
     * Gets the value of the effectiveTeamIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveTeamIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveTeamIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getEffectiveTeamIds() {
        if (effectiveTeamIds == null) {
            effectiveTeamIds = new ArrayList<Long>();
        }
        return this.effectiveTeamIds;
    }

    /**
     * Gets the value of the appliedTeamIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedTeamIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedTeamIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getAppliedTeamIds() {
        if (appliedTeamIds == null) {
            appliedTeamIds = new ArrayList<Long>();
        }
        return this.appliedTeamIds;
    }

    /**
     * Gets the value of the lastModifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * Sets the value of the lastModifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setLastModifiedDateTime(DateTime value) {
        this.lastModifiedDateTime = value;
    }

    /**
     * Gets the value of the smartSizeMode property.
     * 
     * @return
     *     possible object is
     *     {@link SmartSizeMode }
     *     
     */
    public SmartSizeMode getSmartSizeMode() {
        return smartSizeMode;
    }

    /**
     * Sets the value of the smartSizeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartSizeMode }
     *     
     */
    public void setSmartSizeMode(SmartSizeMode value) {
        this.smartSizeMode = value;
    }

    /**
     * Gets the value of the refreshRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefreshRate() {
        return refreshRate;
    }

    /**
     * Sets the value of the refreshRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefreshRate(Integer value) {
        this.refreshRate = value;
    }

    /**
     * Gets the value of the isSharedByDistributor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSharedByDistributor() {
        return isSharedByDistributor;
    }

    /**
     * Sets the value of the isSharedByDistributor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSharedByDistributor(Boolean value) {
        this.isSharedByDistributor = value;
    }

    /**
     * Gets the value of the crossSellingDistributor property.
     * 
     * @return
     *     possible object is
     *     {@link CrossSellingDistributor }
     *     
     */
    public CrossSellingDistributor getCrossSellingDistributor() {
        return crossSellingDistributor;
    }

    /**
     * Sets the value of the crossSellingDistributor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossSellingDistributor }
     *     
     */
    public void setCrossSellingDistributor(CrossSellingDistributor value) {
        this.crossSellingDistributor = value;
    }

    /**
     * Gets the value of the externalSetTopBoxChannelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalSetTopBoxChannelId() {
        return externalSetTopBoxChannelId;
    }

    /**
     * Sets the value of the externalSetTopBoxChannelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalSetTopBoxChannelId(String value) {
        this.externalSetTopBoxChannelId = value;
    }

    /**
     * Gets the value of the isSetTopBoxEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSetTopBoxEnabled() {
        return isSetTopBoxEnabled;
    }

    /**
     * Sets the value of the isSetTopBoxEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSetTopBoxEnabled(Boolean value) {
        this.isSetTopBoxEnabled = value;
    }

}
