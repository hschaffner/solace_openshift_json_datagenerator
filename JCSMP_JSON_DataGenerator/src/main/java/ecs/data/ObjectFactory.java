
package ecs.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.bank.ecs.ArrayOfEvtExtension;
import com.bank.ecs.ArrayOfEvtProductFeatureReltn;
import com.bank.ecs.ArrayOfEvtPrtyInfo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ecs.data package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EVTINPUTBUNDLERESPONSEEvtInputResDesc_QNAME = new QName("", "evt__input__res__desc");
    private final static QName _EVTINPUTBUNDLERESPONSEEvtInputResCode_QNAME = new QName("", "evt__input__res__code");
    private final static QName _EvtExtensionEvtExtensionDebugStrg_QNAME = new QName("", "evt__extension__debug__strg");
    private final static QName _EvtExtensionEvtExtensionName_QNAME = new QName("", "evt__extension__name");
    private final static QName _EvtExtensionEvtExtensionSeqNo_QNAME = new QName("", "evt__extension__seq__no");
    private final static QName _EvtExtensionEvtExtensionValue_QNAME = new QName("", "evt__extension__value");
    private final static QName _EvtInputLayoutEvtCardSequenceNo_QNAME = new QName("", "evt__card__sequence__no");
    private final static QName _EvtInputLayoutEvtAcctAppSysAppCd_QNAME = new QName("", "evt__acct__app__sys__app__cd");
    private final static QName _EvtInputLayoutEvtAcsCd_QNAME = new QName("", "evt__acs__cd");
    private final static QName _EvtInputLayoutEvtMembrshpIdTyp_QNAME = new QName("", "evt__membrshp__id__typ");
    private final static QName _EvtInputLayoutEvtAcctDrCrCd_QNAME = new QName("", "evt__acct__dr__cr__cd");
    private final static QName _EvtInputLayoutEvtCntryCd_QNAME = new QName("", "evt__cntry__cd");
    private final static QName _EvtInputLayoutEvtAccessDeviceModelNo_QNAME = new QName("", "evt__access__device__model_no");
    private final static QName _EvtInputLayoutEvtSettlementAmount_QNAME = new QName("", "evt__settlement__amount");
    private final static QName _EvtInputLayoutEvtMktgSysAppCd_QNAME = new QName("", "evt__mktg__sys__app__cd");
    private final static QName _EvtInputLayoutEvtChannelTypCd_QNAME = new QName("", "evt__channel__typ__cd");
    private final static QName _EvtInputLayoutEvtId_QNAME = new QName("", "evt__id");
    private final static QName _EvtInputLayoutEvtContactMthdTypCd_QNAME = new QName("", "evt__contact__mthd__typ__cd");
    private final static QName _EvtInputLayoutEvtAddrLin2Txt_QNAME = new QName("", "evt__addr__lin__2__txt");
    private final static QName _EvtInputLayoutEvtAccessDeviceId_QNAME = new QName("", "evt__access__device__id");
    private final static QName _EvtInputLayoutEvtRtlPrtnrStoreId_QNAME = new QName("", "evt__rtl__prtnr__store__id");
    private final static QName _EvtInputLayoutEvtOfiTrNo_QNAME = new QName("", "evt__ofi__tr__no");
    private final static QName _EvtInputLayoutEvtDelvryMthdCd_QNAME = new QName("", "evt__delvry__mthd__cd");
    private final static QName _EvtInputLayoutEvtAmountCad_QNAME = new QName("", "evt__amount__cad");
    private final static QName _EvtInputLayoutEvtAccessDeviceSubTypCd_QNAME = new QName("", "evt__access__device__sub__typ__cd");
    private final static QName _EvtInputLayoutEvtSessionId_QNAME = new QName("", "evt__session__id");
    private final static QName _EvtInputLayoutEvtOfiAcctOwnDclrnInd_QNAME = new QName("", "evt__ofi__acct__own_dclrn__ind");
    private final static QName _EvtInputLayoutEvtTimeUtc_QNAME = new QName("", "evt__time__utc");
    private final static QName _EvtInputLayoutEvtCardNo_QNAME = new QName("", "evt__card__no");
    private final static QName _EvtInputLayoutEvtOfferInterestRate_QNAME = new QName("", "evt__offer__interest__rate");
    private final static QName _EvtInputLayoutEvtAccessDeviceOsVersion_QNAME = new QName("", "evt__access__device__os__version");
    private final static QName _EvtInputLayoutEvtBusinessProcessTypCd_QNAME = new QName("", "evt__business__process__typ__cd");
    private final static QName _EvtInputLayoutEvtAddrLin1Txt_QNAME = new QName("", "evt__addr__lin__1__txt");
    private final static QName _EvtInputLayoutEvtMembrshpId_QNAME = new QName("", "evt__membrshp__id");
    private final static QName _EvtInputLayoutEvtPrtyInfos_QNAME = new QName("", "evt__prty__infos");
    private final static QName _EvtInputLayoutEvtAccessDeviceSimCardNo_QNAME = new QName("", "evt__access__device__sim__card__no");
    private final static QName _EvtInputLayoutEvtAccessDeviceTypCd_QNAME = new QName("", "evt__access__device__typ__cd");
    private final static QName _EvtInputLayoutEvtOfiAcctNo_QNAME = new QName("", "evt__ofi__acct__no");
    private final static QName _EvtInputLayoutEvtTypCd_QNAME = new QName("", "evt__typ__cd");
    private final static QName _EvtInputLayoutEvtOfiAcctTypCd_QNAME = new QName("", "evt__ofi__acct__typ__cd");
    private final static QName _EvtInputLayoutEvtCtyTwnNm_QNAME = new QName("", "evt__cty__twn__nm");
    private final static QName _EvtInputLayoutEvtPstlZipCd_QNAME = new QName("", "evt__pstl__zip__cd");
    private final static QName _EvtInputLayoutEvtOrgntIpAddrTxt_QNAME = new QName("", "evt__orgnt__ip__addr__txt");
    private final static QName _EvtInputLayoutEvtMbDevcCntryCd_QNAME = new QName("", "evt__mb__devc__cntry__cd");
    private final static QName _EvtInputLayoutEvtAcctAppId_QNAME = new QName("", "evt__acct__app__id");
    private final static QName _EvtInputLayoutEvtCardIssuingFi_QNAME = new QName("", "evt__card__issuing__fi");
    private final static QName _EvtInputLayoutEvtAppointmentTypCd_QNAME = new QName("", "evt__appointment__typ__cd");
    private final static QName _EvtInputLayoutEvtAppointmentPurposeTypCd_QNAME = new QName("", "evt__appointment__purpose__typ__cd");
    private final static QName _EvtInputLayoutEvtResultCd_QNAME = new QName("", "evt__result__cd");
    private final static QName _EvtInputLayoutEvtIdentityVldtnMthdTypCd_QNAME = new QName("", "evt__identity__vldtn__mthd__typ__cd");
    private final static QName _EvtInputLayoutEvtTransitNo_QNAME = new QName("", "evt__transit__no");
    private final static QName _EvtInputLayoutEvtOfferExpiryDate_QNAME = new QName("", "evt__offer__expiry__date");
    private final static QName _EvtInputLayoutEvtDateUtc_QNAME = new QName("", "evt__date__utc");
    private final static QName _EvtInputLayoutEvtReqAuthMthdCd_QNAME = new QName("", "evt__req__auth__mthd__cd");
    private final static QName _EvtInputLayoutEvtFulfillmentMthdTypCd_QNAME = new QName("", "evt__fulfillment__mthd__typ__cd");
    private final static QName _EvtInputLayoutEvtSubcntryCd_QNAME = new QName("", "evt__subcntry__cd");
    private final static QName _EvtInputLayoutEvtContactPointTypCd_QNAME = new QName("", "evt__contact__point__typ__cd");
    private final static QName _EvtInputLayoutEvtRtlPrtnrAgtId_QNAME = new QName("", "evt__rtl__prtnr__agt__id");
    private final static QName _EvtInputLayoutEvtMbDevcCrrCoCd_QNAME = new QName("", "evt__mb__devc__crr__co__cd");
    private final static QName _EvtInputLayoutEvtProcessingCentre_QNAME = new QName("", "evt__processing__centre");
    private final static QName _EvtInputLayoutEvtAccessDeviceGeoLocLong_QNAME = new QName("", "evt__access__device__geo__loc__long");
    private final static QName _EvtInputLayoutEvtSourceChannelInstanceId_QNAME = new QName("", "evt__source__channel__instance__id");
    private final static QName _EvtInputLayoutEvtComment_QNAME = new QName("", "evt__comment");
    private final static QName _EvtInputLayoutEvtAmount_QNAME = new QName("", "evt__amount");
    private final static QName _EvtInputLayoutEvtCrossSellIndicator_QNAME = new QName("", "evt__cross__sell__indicator");
    private final static QName _EvtInputLayoutEvtProductFeatureReltns_QNAME = new QName("", "evt__product__feature__reltns");
    private final static QName _EvtInputLayoutEvtAccessDeviceGeoLocLat_QNAME = new QName("", "evt__access__device__geo__loc__lat");
    private final static QName _EvtInputLayoutEvtForexCadRate_QNAME = new QName("", "evt__forex__cad__rate");
    private final static QName _EvtInputLayoutEvtCurrencyCd_QNAME = new QName("", "evt__currency__cd");
    private final static QName _EvtInputLayoutEvtMktgAdjdcnTypCd_QNAME = new QName("", "evt__mktg__adjdcn__typ__cd");
    private final static QName _EvtInputLayoutEvtMktgReferenceCd_QNAME = new QName("", "evt__mktg__reference__cd");
    private final static QName _EvtInputLayoutEvtAdjudicationCd_QNAME = new QName("", "evt__adjudication__cd");
    private final static QName _EvtInputLayoutEvtGroupStatusCd_QNAME = new QName("", "evt__group__status__cd");
    private final static QName _EvtInputLayoutEvtInitdByCd_QNAME = new QName("", "evt__initd__by__cd");
    private final static QName _EvtInputLayoutEvtCardTypCd_QNAME = new QName("", "evt__card__typ__cd");
    private final static QName _EvtInputLayoutEvtAppointmentDescTypCd_QNAME = new QName("", "evt__appointment__desc__typ__cd");
    private final static QName _EvtInputLayoutEvtAddrUsgTypCd_QNAME = new QName("", "evt__addr__usg__typ__cd");
    private final static QName _EvtInputLayoutEvtCampaignId_QNAME = new QName("", "evt__campaign__id");
    private final static QName _EvtInputLayoutEvtExtensions_QNAME = new QName("", "evt__extensions");
    private final static QName _EvtInputLayoutEvtStatusCd_QNAME = new QName("", "evt__status__cd");
    private final static QName _EvtInputLayoutEvtOfiBnkNo_QNAME = new QName("", "evt__ofi__bnk__no");
    private final static QName _EvtInputLayoutEvtBusinessProcessId_QNAME = new QName("", "evt__business__process__id");
    private final static QName _EvtInputLayoutEvtCardIssueNo_QNAME = new QName("", "evt__card__issue__no");
    private final static QName _EvtInputLayoutEvtOrgntAppCd_QNAME = new QName("", "evt__orgnt__app__cd");
    private final static QName _EvtInputLayoutEvtSettlementCurrencyCd_QNAME = new QName("", "evt__settlement__currency__cd");
    private final static QName _EvtInputLayoutEvtBusinessContextId_QNAME = new QName("", "evt__business__context__id");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ecs.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EvtProductFeatureReltn }
     * 
     */
    public EvtProductFeatureReltn createEvtProductFeatureReltn() {
        return new EvtProductFeatureReltn();
    }

    /**
     * Create an instance of {@link EvtExtension }
     * 
     */
    public EvtExtension createEvtExtension() {
        return new EvtExtension();
    }

    /**
     * Create an instance of {@link EVTINPUTBUNDLERESPONSE }
     * 
     */
    public EVTINPUTBUNDLERESPONSE createEVTINPUTBUNDLERESPONSE() {
        return new EVTINPUTBUNDLERESPONSE();
    }

    /**
     * Create an instance of {@link EVTINPUTBUNDLE }
     * 
     */
    public EVTINPUTBUNDLE createEVTINPUTBUNDLE() {
        return new EVTINPUTBUNDLE();
    }

    /**
     * Create an instance of {@link EvtActvyTypFeatureReltn }
     * 
     */
    public EvtActvyTypFeatureReltn createEvtActvyTypFeatureReltn() {
        return new EvtActvyTypFeatureReltn();
    }

    /**
     * Create an instance of {@link EvtPrtyInfo }
     * 
     */
    public EvtPrtyInfo createEvtPrtyInfo() {
        return new EvtPrtyInfo();
    }

    /**
     * Create an instance of {@link EvtInputLayout }
     * 
     */
    public EvtInputLayout createEvtInputLayout() {
        return new EvtInputLayout();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__input__res__desc", scope = EVTINPUTBUNDLERESPONSE.class)
    public JAXBElement<String> createEVTINPUTBUNDLERESPONSEEvtInputResDesc(String value) {
        return new JAXBElement<String>(_EVTINPUTBUNDLERESPONSEEvtInputResDesc_QNAME, String.class, EVTINPUTBUNDLERESPONSE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__input__res__code", scope = EVTINPUTBUNDLERESPONSE.class)
    public JAXBElement<String> createEVTINPUTBUNDLERESPONSEEvtInputResCode(String value) {
        return new JAXBElement<String>(_EVTINPUTBUNDLERESPONSEEvtInputResCode_QNAME, String.class, EVTINPUTBUNDLERESPONSE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__extension__debug__strg", scope = EvtExtension.class)
    public JAXBElement<String> createEvtExtensionEvtExtensionDebugStrg(String value) {
        return new JAXBElement<String>(_EvtExtensionEvtExtensionDebugStrg_QNAME, String.class, EvtExtension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__extension__name", scope = EvtExtension.class)
    public JAXBElement<String> createEvtExtensionEvtExtensionName(String value) {
        return new JAXBElement<String>(_EvtExtensionEvtExtensionName_QNAME, String.class, EvtExtension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__extension__seq__no", scope = EvtExtension.class)
    public JAXBElement<String> createEvtExtensionEvtExtensionSeqNo(String value) {
        return new JAXBElement<String>(_EvtExtensionEvtExtensionSeqNo_QNAME, String.class, EvtExtension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__extension__value", scope = EvtExtension.class)
    public JAXBElement<String> createEvtExtensionEvtExtensionValue(String value) {
        return new JAXBElement<String>(_EvtExtensionEvtExtensionValue_QNAME, String.class, EvtExtension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__card__sequence__no", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtCardSequenceNo(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtCardSequenceNo_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__acct__app__sys__app__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtAcctAppSysAppCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtAcctAppSysAppCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__acs__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtAcsCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtAcsCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__membrshp__id__typ", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtMembrshpIdTyp(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtMembrshpIdTyp_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__acct__dr__cr__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtAcctDrCrCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtAcctDrCrCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__cntry__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtCntryCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtCntryCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__access__device__model_no", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtAccessDeviceModelNo(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtAccessDeviceModelNo_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__settlement__amount", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtSettlementAmount(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtSettlementAmount_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__mktg__sys__app__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtMktgSysAppCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtMktgSysAppCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__channel__typ__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtChannelTypCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtChannelTypCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__id", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtId(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtId_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__contact__mthd__typ__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtContactMthdTypCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtContactMthdTypCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__addr__lin__2__txt", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtAddrLin2Txt(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtAddrLin2Txt_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__access__device__id", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtAccessDeviceId(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtAccessDeviceId_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__rtl__prtnr__store__id", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtRtlPrtnrStoreId(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtRtlPrtnrStoreId_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__ofi__tr__no", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtOfiTrNo(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtOfiTrNo_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__delvry__mthd__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtDelvryMthdCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtDelvryMthdCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__amount__cad", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtAmountCad(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtAmountCad_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__access__device__sub__typ__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtAccessDeviceSubTypCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtAccessDeviceSubTypCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__session__id", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtSessionId(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtSessionId_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__ofi__acct__own_dclrn__ind", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtOfiAcctOwnDclrnInd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtOfiAcctOwnDclrnInd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__time__utc", scope = EvtInputLayout.class)
    public JAXBElement<XMLGregorianCalendar> createEvtInputLayoutEvtTimeUtc(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EvtInputLayoutEvtTimeUtc_QNAME, XMLGregorianCalendar.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__card__no", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtCardNo(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtCardNo_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__offer__interest__rate", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtOfferInterestRate(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtOfferInterestRate_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__access__device__os__version", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtAccessDeviceOsVersion(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtAccessDeviceOsVersion_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__business__process__typ__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtBusinessProcessTypCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtBusinessProcessTypCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__addr__lin__1__txt", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtAddrLin1Txt(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtAddrLin1Txt_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__membrshp__id", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtMembrshpId(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtMembrshpId_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEvtPrtyInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__prty__infos", scope = EvtInputLayout.class)
    public JAXBElement<ArrayOfEvtPrtyInfo> createEvtInputLayoutEvtPrtyInfos(ArrayOfEvtPrtyInfo value) {
        return new JAXBElement<ArrayOfEvtPrtyInfo>(_EvtInputLayoutEvtPrtyInfos_QNAME, ArrayOfEvtPrtyInfo.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__access__device__sim__card__no", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtAccessDeviceSimCardNo(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtAccessDeviceSimCardNo_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__access__device__typ__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtAccessDeviceTypCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtAccessDeviceTypCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__ofi__acct__no", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtOfiAcctNo(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtOfiAcctNo_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__typ__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtTypCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtTypCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__ofi__acct__typ__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtOfiAcctTypCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtOfiAcctTypCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__cty__twn__nm", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtCtyTwnNm(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtCtyTwnNm_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__pstl__zip__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtPstlZipCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtPstlZipCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__orgnt__ip__addr__txt", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtOrgntIpAddrTxt(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtOrgntIpAddrTxt_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__mb__devc__cntry__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtMbDevcCntryCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtMbDevcCntryCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__acct__app__id", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtAcctAppId(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtAcctAppId_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__card__issuing__fi", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtCardIssuingFi(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtCardIssuingFi_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__appointment__typ__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtAppointmentTypCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtAppointmentTypCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__appointment__purpose__typ__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtAppointmentPurposeTypCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtAppointmentPurposeTypCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__result__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtResultCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtResultCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__identity__vldtn__mthd__typ__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtIdentityVldtnMthdTypCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtIdentityVldtnMthdTypCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__transit__no", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtTransitNo(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtTransitNo_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__offer__expiry__date", scope = EvtInputLayout.class)
    public JAXBElement<XMLGregorianCalendar> createEvtInputLayoutEvtOfferExpiryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EvtInputLayoutEvtOfferExpiryDate_QNAME, XMLGregorianCalendar.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__date__utc", scope = EvtInputLayout.class)
    public JAXBElement<XMLGregorianCalendar> createEvtInputLayoutEvtDateUtc(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EvtInputLayoutEvtDateUtc_QNAME, XMLGregorianCalendar.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__req__auth__mthd__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtReqAuthMthdCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtReqAuthMthdCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__fulfillment__mthd__typ__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtFulfillmentMthdTypCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtFulfillmentMthdTypCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__subcntry__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtSubcntryCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtSubcntryCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__contact__point__typ__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtContactPointTypCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtContactPointTypCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__rtl__prtnr__agt__id", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtRtlPrtnrAgtId(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtRtlPrtnrAgtId_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__mb__devc__crr__co__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtMbDevcCrrCoCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtMbDevcCrrCoCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__processing__centre", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtProcessingCentre(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtProcessingCentre_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__access__device__geo__loc__long", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtAccessDeviceGeoLocLong(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtAccessDeviceGeoLocLong_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__source__channel__instance__id", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtSourceChannelInstanceId(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtSourceChannelInstanceId_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__comment", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtComment(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtComment_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__amount", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtAmount(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtAmount_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__cross__sell__indicator", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtCrossSellIndicator(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtCrossSellIndicator_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEvtProductFeatureReltn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__product__feature__reltns", scope = EvtInputLayout.class)
    public JAXBElement<ArrayOfEvtProductFeatureReltn> createEvtInputLayoutEvtProductFeatureReltns(ArrayOfEvtProductFeatureReltn value) {
        return new JAXBElement<ArrayOfEvtProductFeatureReltn>(_EvtInputLayoutEvtProductFeatureReltns_QNAME, ArrayOfEvtProductFeatureReltn.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__access__device__geo__loc__lat", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtAccessDeviceGeoLocLat(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtAccessDeviceGeoLocLat_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__forex__cad__rate", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtForexCadRate(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtForexCadRate_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__currency__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtCurrencyCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtCurrencyCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__mktg__adjdcn__typ__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtMktgAdjdcnTypCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtMktgAdjdcnTypCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__mktg__reference__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtMktgReferenceCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtMktgReferenceCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__adjudication__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtAdjudicationCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtAdjudicationCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__group__status__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtGroupStatusCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtGroupStatusCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__initd__by__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtInitdByCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtInitdByCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__card__typ__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtCardTypCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtCardTypCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__appointment__desc__typ__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtAppointmentDescTypCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtAppointmentDescTypCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__addr__usg__typ__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtAddrUsgTypCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtAddrUsgTypCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__campaign__id", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtCampaignId(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtCampaignId_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEvtExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__extensions", scope = EvtInputLayout.class)
    public JAXBElement<ArrayOfEvtExtension> createEvtInputLayoutEvtExtensions(ArrayOfEvtExtension value) {
        return new JAXBElement<ArrayOfEvtExtension>(_EvtInputLayoutEvtExtensions_QNAME, ArrayOfEvtExtension.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__status__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtStatusCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtStatusCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__ofi__bnk__no", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtOfiBnkNo(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtOfiBnkNo_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__business__process__id", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtBusinessProcessId(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtBusinessProcessId_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__card__issue__no", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtCardIssueNo(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtCardIssueNo_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__orgnt__app__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtOrgntAppCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtOrgntAppCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__settlement__currency__cd", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtSettlementCurrencyCd(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtSettlementCurrencyCd_QNAME, String.class, EvtInputLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "evt__business__context__id", scope = EvtInputLayout.class)
    public JAXBElement<String> createEvtInputLayoutEvtBusinessContextId(String value) {
        return new JAXBElement<String>(_EvtInputLayoutEvtBusinessContextId_QNAME, String.class, EvtInputLayout.class, value);
    }

}
