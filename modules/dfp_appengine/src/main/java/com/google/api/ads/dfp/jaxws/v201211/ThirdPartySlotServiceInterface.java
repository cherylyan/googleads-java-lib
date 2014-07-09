
package com.google.api.ads.dfp.jaxws.v201211;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides operations for creating, updating, and retrieving
 *       {@link ThirdPartySlot} objects.
 *       <p>
 *       A {@link ThirdPartySlot} defines how a third-party creative is identified
 *       in a third-party ad network, yield manager, or ad exchange's system.
 *       <p>
 *       You may need additional features enabled on your account to use this
 *       service. Please discuss this with your account manager.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ThirdPartySlotServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ThirdPartySlotServiceInterface {


    /**
     * 
     *         Creates a new {@link ThirdPartySlot}.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link ThirdPartySlot#companyId}</li>
     *         <li>{@link ThirdPartySlot#externalUniqueId}</li>
     *         <li>{@link ThirdPartySlot#externalUniqueName}</li>
     *         <li>{@link ThirdPartySlot#description}</li>
     *         </ul>
     *         
     *         @param thirdPartySlot the third-party slot to create
     *         @return the new third-party slot with its ID filled in
     *       
     * 
     * @param thirdPartySlot
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201211.ThirdPartySlot
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
    @RequestWrapper(localName = "createThirdPartySlot", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.ThirdPartySlotServiceInterfacecreateThirdPartySlot")
    @ResponseWrapper(localName = "createThirdPartySlotResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.ThirdPartySlotServiceInterfacecreateThirdPartySlotResponse")
    public ThirdPartySlot createThirdPartySlot(
        @WebParam(name = "thirdPartySlot", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
        ThirdPartySlot thirdPartySlot)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link ThirdPartySlotPage} of {@link ThirdPartySlot} objects that
     *         satisfy the filter query.
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of third-party slots
     *         @return the third-party slots that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201211.ThirdPartySlotPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
    @RequestWrapper(localName = "getThirdPartySlotsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.ThirdPartySlotServiceInterfacegetThirdPartySlotsByStatement")
    @ResponseWrapper(localName = "getThirdPartySlotsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.ThirdPartySlotServiceInterfacegetThirdPartySlotsByStatementResponse")
    public ThirdPartySlotPage getThirdPartySlotsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link ThirdPartySlot} objects that match the given
     *         {@link Statement#query}.
     *         
     *         @param thirdPartySlotAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of third-party slots
     *         @return the result of the action performed
     *       
     * 
     * @param thirdPartySlotAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201211.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
    @RequestWrapper(localName = "performThirdPartySlotAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.ThirdPartySlotServiceInterfaceperformThirdPartySlotAction")
    @ResponseWrapper(localName = "performThirdPartySlotActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.ThirdPartySlotServiceInterfaceperformThirdPartySlotActionResponse")
    public UpdateResult performThirdPartySlotAction(
        @WebParam(name = "thirdPartySlotAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
        ThirdPartySlotAction thirdPartySlotAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link ThirdPartySlot}.
     *         
     *         @param thirdPartySlot the third-party slot to update
     *         @return the updated third-party slot
     *       
     * 
     * @param thirdPartySlot
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201211.ThirdPartySlot
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
    @RequestWrapper(localName = "updateThirdPartySlot", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.ThirdPartySlotServiceInterfaceupdateThirdPartySlot")
    @ResponseWrapper(localName = "updateThirdPartySlotResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.ThirdPartySlotServiceInterfaceupdateThirdPartySlotResponse")
    public ThirdPartySlot updateThirdPartySlot(
        @WebParam(name = "thirdPartySlot", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
        ThirdPartySlot thirdPartySlot)
        throws ApiException_Exception
    ;

}