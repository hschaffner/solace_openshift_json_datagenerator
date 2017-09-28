
package ecs.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.bank.ecs.ArrayOfEvtActvyTypFeatureReltn;
import com.bank.ecs.ArrayOfEvtExtension;
import com.bank.ecs.ArrayOfEvtProductFeatureReltn;
import com.bank.ecs.ArrayOfEvtPrtyInfo;


/**
 * <p>Java class for evt__input__layout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="evt__input__layout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evt__id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__sys__app__cd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="4"/>
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__processing__centre" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__typ__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__status__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__result__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__business__process__id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__group__status__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="evt__time" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="evt__date__utc" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="evt__time__utc" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="evt__msg__version">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="20"/>
 *               &lt;pattern value="1.3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__prty__infos" type="{http://ECS.RBC.COM}ArrayOf_evt__prty__info" minOccurs="0"/>
 *         &lt;element name="evt__product__feature__reltns" type="{http://ECS.RBC.COM}ArrayOf_evt__product__feature__reltn" minOccurs="0"/>
 *         &lt;element name="evt__actvy__typ__feature__reltns" type="{http://ECS.RBC.COM}ArrayOf_evt__actvy__typ__feature__reltn"/>
 *         &lt;element name="evt__amount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="16"/>
 *               &lt;pattern value="[0-9]([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?(\.[0-9]([0-9])?)?"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__amount__cad" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="16"/>
 *               &lt;pattern value="[0-9]([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?(\.[0-9]([0-9])?)?"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__currency__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__forex__cad__rate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="17"/>
 *               &lt;pattern value="[0-9]([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?(\.[0-9]([0-9]([0-9]([0-9]([0-9]([0-9]([0-9]([0-9]([0-9])?)?)?)?)?)?)?)?)?"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__settlement__amount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="16"/>
 *               &lt;pattern value="[0-9]([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?([0-9])?(\.[0-9]([0-9])?)?"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__settlement__currency__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__source__channel__instance__id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__channel__typ__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__transit__no" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="5"/>
 *               &lt;maxLength value="5"/>
 *               &lt;pattern value="[0-9]+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__access__device__id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__access__device__typ__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__access__device__sub__typ__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__access__device__os__version" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__access__device__sim__card__no" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__access__device__model_no" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__access__device__geo__loc__long" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *               &lt;pattern value="[0-9]([0-9])([0-9])?(\.[0-9]([0-9]([0-9]([0-9]([0-9]([0-9])?)?)?)?)?)?"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__access__device__geo__loc__lat" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *               &lt;pattern value="[0-9]([0-9])([0-9])?(\.[0-9]([0-9]([0-9]([0-9]([0-9]([0-9])?)?)?)?)?)?"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__contact__mthd__typ__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__contact__point__typ__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__card__no" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="16"/>
 *               &lt;maxLength value="16"/>
 *               &lt;pattern value="[0-9]+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__card__typ__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__card__issuing__fi" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="5"/>
 *               &lt;pattern value="[0-9]+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__card__issue__no" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="2"/>
 *               &lt;pattern value="[0-9]+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__card__sequence__no" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="3"/>
 *               &lt;pattern value="[0-9]+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__cross__sell__indicator" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__identity__vldtn__mthd__typ__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__fulfillment__mthd__typ__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__appointment__typ__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__appointment__desc__typ__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__appointment__purpose__typ__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__initd__by__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__comment" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__acct__app__sys__app__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="4"/>
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__acct__app__id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__acct__dr__cr__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__campaign__id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__offer__expiry__date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="evt__adjudication__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__orgnt__app__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="4"/>
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__mktg__reference__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__offer__interest__rate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *               &lt;pattern value="[0-9]([0-9])?(\.[0-9]([0-9]([0-9]([0-9]([0-9]([0-9]([0-9])?)?)?)?)?)?)?"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__session__id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__addr__usg__typ__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__addr__lin__1__txt" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__addr__lin__2__txt" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__cty__twn__nm" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__subcntry__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="2"/>
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__pstl__zip__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__cntry__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__req__auth__mthd__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__orgnt__ip__addr__txt" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__mb__devc__crr__co__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__ofi__tr__no" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="8"/>
 *               &lt;pattern value="[0-9]+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__ofi__bnk__no" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="5"/>
 *               &lt;pattern value="[0-9]+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__ofi__acct__no" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__ofi__acct__typ__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__ofi__acct__own_dclrn__ind" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__delvry__mthd__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__business__process__typ__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__acs__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__mktg__sys__app__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__membrshp__id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__membrshp__id__typ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__mktg__adjdcn__typ__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__rtl__prtnr__agt__id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__rtl__prtnr__store__id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__business__context__id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__mb__devc__cntry__cd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evt__extensions" type="{http://ECS.RBC.COM}ArrayOf_evt__extension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "evt__input__layout", propOrder = {
    "evtId",
    "evtSysAppCd",
    "evtProcessingCentre",
    "evtTypCd",
    "evtStatusCd",
    "evtResultCd",
    "evtBusinessProcessId",
    "evtGroupStatusCd",
    "evtDate",
    "evtTime",
    "evtDateUtc",
    "evtTimeUtc",
    "evtMsgVersion",
    "evtPrtyInfos",
    "evtProductFeatureReltns",
    "evtActvyTypFeatureReltns",
    "evtAmount",
    "evtAmountCad",
    "evtCurrencyCd",
    "evtForexCadRate",
    "evtSettlementAmount",
    "evtSettlementCurrencyCd",
    "evtSourceChannelInstanceId",
    "evtChannelTypCd",
    "evtTransitNo",
    "evtAccessDeviceId",
    "evtAccessDeviceTypCd",
    "evtAccessDeviceSubTypCd",
    "evtAccessDeviceOsVersion",
    "evtAccessDeviceSimCardNo",
    "evtAccessDeviceModelNo",
    "evtAccessDeviceGeoLocLong",
    "evtAccessDeviceGeoLocLat",
    "evtContactMthdTypCd",
    "evtContactPointTypCd",
    "evtCardNo",
    "evtCardTypCd",
    "evtCardIssuingFi",
    "evtCardIssueNo",
    "evtCardSequenceNo",
    "evtCrossSellIndicator",
    "evtIdentityVldtnMthdTypCd",
    "evtFulfillmentMthdTypCd",
    "evtAppointmentTypCd",
    "evtAppointmentDescTypCd",
    "evtAppointmentPurposeTypCd",
    "evtInitdByCd",
    "evtComment",
    "evtAcctAppSysAppCd",
    "evtAcctAppId",
    "evtAcctDrCrCd",
    "evtCampaignId",
    "evtOfferExpiryDate",
    "evtAdjudicationCd",
    "evtOrgntAppCd",
    "evtMktgReferenceCd",
    "evtOfferInterestRate",
    "evtSessionId",
    "evtAddrUsgTypCd",
    "evtAddrLin1Txt",
    "evtAddrLin2Txt",
    "evtCtyTwnNm",
    "evtSubcntryCd",
    "evtPstlZipCd",
    "evtCntryCd",
    "evtReqAuthMthdCd",
    "evtOrgntIpAddrTxt",
    "evtMbDevcCrrCoCd",
    "evtOfiTrNo",
    "evtOfiBnkNo",
    "evtOfiAcctNo",
    "evtOfiAcctTypCd",
    "evtOfiAcctOwnDclrnInd",
    "evtDelvryMthdCd",
    "evtBusinessProcessTypCd",
    "evtAcsCd",
    "evtMktgSysAppCd",
    "evtMembrshpId",
    "evtMembrshpIdTyp",
    "evtMktgAdjdcnTypCd",
    "evtRtlPrtnrAgtId",
    "evtRtlPrtnrStoreId",
    "evtBusinessContextId",
    "evtMbDevcCntryCd",
    "evtExtensions"
})
public class EvtInputLayout {

    @XmlElementRef(name = "evt__id", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtId;
    @XmlElement(name = "evt__sys__app__cd", required = true)
    protected String evtSysAppCd;
    @XmlElementRef(name = "evt__processing__centre", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtProcessingCentre;
    @XmlElementRef(name = "evt__typ__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtTypCd;
    @XmlElementRef(name = "evt__status__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtStatusCd;
    @XmlElementRef(name = "evt__result__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtResultCd;
    @XmlElementRef(name = "evt__business__process__id", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtBusinessProcessId;
    @XmlElementRef(name = "evt__group__status__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtGroupStatusCd;
    @XmlElement(name = "evt__date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evtDate;
    @XmlElement(name = "evt__time", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar evtTime;
    @XmlElementRef(name = "evt__date__utc", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> evtDateUtc;
    @XmlElementRef(name = "evt__time__utc", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> evtTimeUtc;
    @XmlElement(name = "evt__msg__version", required = true)
    protected String evtMsgVersion;
    @XmlElementRef(name = "evt__prty__infos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEvtPrtyInfo> evtPrtyInfos;
    @XmlElementRef(name = "evt__product__feature__reltns", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEvtProductFeatureReltn> evtProductFeatureReltns;
    @XmlElement(name = "evt__actvy__typ__feature__reltns", required = true)
    protected ArrayOfEvtActvyTypFeatureReltn evtActvyTypFeatureReltns;
    @XmlElementRef(name = "evt__amount", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtAmount;
    @XmlElementRef(name = "evt__amount__cad", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtAmountCad;
    @XmlElementRef(name = "evt__currency__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtCurrencyCd;
    @XmlElementRef(name = "evt__forex__cad__rate", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtForexCadRate;
    @XmlElementRef(name = "evt__settlement__amount", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtSettlementAmount;
    @XmlElementRef(name = "evt__settlement__currency__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtSettlementCurrencyCd;
    @XmlElementRef(name = "evt__source__channel__instance__id", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtSourceChannelInstanceId;
    @XmlElementRef(name = "evt__channel__typ__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtChannelTypCd;
    @XmlElementRef(name = "evt__transit__no", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtTransitNo;
    @XmlElementRef(name = "evt__access__device__id", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtAccessDeviceId;
    @XmlElementRef(name = "evt__access__device__typ__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtAccessDeviceTypCd;
    @XmlElementRef(name = "evt__access__device__sub__typ__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtAccessDeviceSubTypCd;
    @XmlElementRef(name = "evt__access__device__os__version", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtAccessDeviceOsVersion;
    @XmlElementRef(name = "evt__access__device__sim__card__no", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtAccessDeviceSimCardNo;
    @XmlElementRef(name = "evt__access__device__model_no", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtAccessDeviceModelNo;
    @XmlElementRef(name = "evt__access__device__geo__loc__long", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtAccessDeviceGeoLocLong;
    @XmlElementRef(name = "evt__access__device__geo__loc__lat", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtAccessDeviceGeoLocLat;
    @XmlElementRef(name = "evt__contact__mthd__typ__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtContactMthdTypCd;
    @XmlElementRef(name = "evt__contact__point__typ__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtContactPointTypCd;
    @XmlElementRef(name = "evt__card__no", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtCardNo;
    @XmlElementRef(name = "evt__card__typ__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtCardTypCd;
    @XmlElementRef(name = "evt__card__issuing__fi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtCardIssuingFi;
    @XmlElementRef(name = "evt__card__issue__no", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtCardIssueNo;
    @XmlElementRef(name = "evt__card__sequence__no", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtCardSequenceNo;
    @XmlElementRef(name = "evt__cross__sell__indicator", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtCrossSellIndicator;
    @XmlElementRef(name = "evt__identity__vldtn__mthd__typ__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtIdentityVldtnMthdTypCd;
    @XmlElementRef(name = "evt__fulfillment__mthd__typ__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtFulfillmentMthdTypCd;
    @XmlElementRef(name = "evt__appointment__typ__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtAppointmentTypCd;
    @XmlElementRef(name = "evt__appointment__desc__typ__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtAppointmentDescTypCd;
    @XmlElementRef(name = "evt__appointment__purpose__typ__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtAppointmentPurposeTypCd;
    @XmlElementRef(name = "evt__initd__by__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtInitdByCd;
    @XmlElementRef(name = "evt__comment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtComment;
    @XmlElementRef(name = "evt__acct__app__sys__app__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtAcctAppSysAppCd;
    @XmlElementRef(name = "evt__acct__app__id", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtAcctAppId;
    @XmlElementRef(name = "evt__acct__dr__cr__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtAcctDrCrCd;
    @XmlElementRef(name = "evt__campaign__id", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtCampaignId;
    @XmlElementRef(name = "evt__offer__expiry__date", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> evtOfferExpiryDate;
    @XmlElementRef(name = "evt__adjudication__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtAdjudicationCd;
    @XmlElementRef(name = "evt__orgnt__app__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtOrgntAppCd;
    @XmlElementRef(name = "evt__mktg__reference__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtMktgReferenceCd;
    @XmlElementRef(name = "evt__offer__interest__rate", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtOfferInterestRate;
    @XmlElementRef(name = "evt__session__id", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtSessionId;
    @XmlElementRef(name = "evt__addr__usg__typ__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtAddrUsgTypCd;
    @XmlElementRef(name = "evt__addr__lin__1__txt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtAddrLin1Txt;
    @XmlElementRef(name = "evt__addr__lin__2__txt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtAddrLin2Txt;
    @XmlElementRef(name = "evt__cty__twn__nm", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtCtyTwnNm;
    @XmlElementRef(name = "evt__subcntry__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtSubcntryCd;
    @XmlElementRef(name = "evt__pstl__zip__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtPstlZipCd;
    @XmlElementRef(name = "evt__cntry__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtCntryCd;
    @XmlElementRef(name = "evt__req__auth__mthd__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtReqAuthMthdCd;
    @XmlElementRef(name = "evt__orgnt__ip__addr__txt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtOrgntIpAddrTxt;
    @XmlElementRef(name = "evt__mb__devc__crr__co__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtMbDevcCrrCoCd;
    @XmlElementRef(name = "evt__ofi__tr__no", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtOfiTrNo;
    @XmlElementRef(name = "evt__ofi__bnk__no", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtOfiBnkNo;
    @XmlElementRef(name = "evt__ofi__acct__no", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtOfiAcctNo;
    @XmlElementRef(name = "evt__ofi__acct__typ__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtOfiAcctTypCd;
    @XmlElementRef(name = "evt__ofi__acct__own_dclrn__ind", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtOfiAcctOwnDclrnInd;
    @XmlElementRef(name = "evt__delvry__mthd__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtDelvryMthdCd;
    @XmlElementRef(name = "evt__business__process__typ__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtBusinessProcessTypCd;
    @XmlElementRef(name = "evt__acs__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtAcsCd;
    @XmlElementRef(name = "evt__mktg__sys__app__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtMktgSysAppCd;
    @XmlElementRef(name = "evt__membrshp__id", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtMembrshpId;
    @XmlElementRef(name = "evt__membrshp__id__typ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtMembrshpIdTyp;
    @XmlElementRef(name = "evt__mktg__adjdcn__typ__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtMktgAdjdcnTypCd;
    @XmlElementRef(name = "evt__rtl__prtnr__agt__id", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtRtlPrtnrAgtId;
    @XmlElementRef(name = "evt__rtl__prtnr__store__id", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtRtlPrtnrStoreId;
    @XmlElementRef(name = "evt__business__context__id", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtBusinessContextId;
    @XmlElementRef(name = "evt__mb__devc__cntry__cd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evtMbDevcCntryCd;
    @XmlElementRef(name = "evt__extensions", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEvtExtension> evtExtensions;

    /**
     * Gets the value of the evtId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtId() {
        return evtId;
    }

    /**
     * Sets the value of the evtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtId(JAXBElement<String> value) {
        this.evtId = value;
    }

    /**
     * Gets the value of the evtSysAppCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtSysAppCd() {
        return evtSysAppCd;
    }

    /**
     * Sets the value of the evtSysAppCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtSysAppCd(String value) {
        this.evtSysAppCd = value;
    }

    /**
     * Gets the value of the evtProcessingCentre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtProcessingCentre() {
        return evtProcessingCentre;
    }

    /**
     * Sets the value of the evtProcessingCentre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtProcessingCentre(JAXBElement<String> value) {
        this.evtProcessingCentre = value;
    }

    /**
     * Gets the value of the evtTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtTypCd() {
        return evtTypCd;
    }

    /**
     * Sets the value of the evtTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtTypCd(JAXBElement<String> value) {
        this.evtTypCd = value;
    }

    /**
     * Gets the value of the evtStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtStatusCd() {
        return evtStatusCd;
    }

    /**
     * Sets the value of the evtStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtStatusCd(JAXBElement<String> value) {
        this.evtStatusCd = value;
    }

    /**
     * Gets the value of the evtResultCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtResultCd() {
        return evtResultCd;
    }

    /**
     * Sets the value of the evtResultCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtResultCd(JAXBElement<String> value) {
        this.evtResultCd = value;
    }

    /**
     * Gets the value of the evtBusinessProcessId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtBusinessProcessId() {
        return evtBusinessProcessId;
    }

    /**
     * Sets the value of the evtBusinessProcessId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtBusinessProcessId(JAXBElement<String> value) {
        this.evtBusinessProcessId = value;
    }

    /**
     * Gets the value of the evtGroupStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtGroupStatusCd() {
        return evtGroupStatusCd;
    }

    /**
     * Sets the value of the evtGroupStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtGroupStatusCd(JAXBElement<String> value) {
        this.evtGroupStatusCd = value;
    }

    /**
     * Gets the value of the evtDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvtDate() {
        return evtDate;
    }

    /**
     * Sets the value of the evtDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvtDate(XMLGregorianCalendar value) {
        this.evtDate = value;
    }

    /**
     * Gets the value of the evtTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvtTime() {
        return evtTime;
    }

    /**
     * Sets the value of the evtTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvtTime(XMLGregorianCalendar value) {
        this.evtTime = value;
    }

    /**
     * Gets the value of the evtDateUtc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEvtDateUtc() {
        return evtDateUtc;
    }

    /**
     * Sets the value of the evtDateUtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEvtDateUtc(JAXBElement<XMLGregorianCalendar> value) {
        this.evtDateUtc = value;
    }

    /**
     * Gets the value of the evtTimeUtc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEvtTimeUtc() {
        return evtTimeUtc;
    }

    /**
     * Sets the value of the evtTimeUtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEvtTimeUtc(JAXBElement<XMLGregorianCalendar> value) {
        this.evtTimeUtc = value;
    }

    /**
     * Gets the value of the evtMsgVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtMsgVersion() {
        return evtMsgVersion;
    }

    /**
     * Sets the value of the evtMsgVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtMsgVersion(String value) {
        this.evtMsgVersion = value;
    }

    /**
     * Gets the value of the evtPrtyInfos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEvtPrtyInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEvtPrtyInfo> getEvtPrtyInfos() {
        return evtPrtyInfos;
    }

    /**
     * Sets the value of the evtPrtyInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEvtPrtyInfo }{@code >}
     *     
     */
    public void setEvtPrtyInfos(JAXBElement<ArrayOfEvtPrtyInfo> value) {
        this.evtPrtyInfos = value;
    }

    /**
     * Gets the value of the evtProductFeatureReltns property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEvtProductFeatureReltn }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEvtProductFeatureReltn> getEvtProductFeatureReltns() {
        return evtProductFeatureReltns;
    }

    /**
     * Sets the value of the evtProductFeatureReltns property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEvtProductFeatureReltn }{@code >}
     *     
     */
    public void setEvtProductFeatureReltns(JAXBElement<ArrayOfEvtProductFeatureReltn> value) {
        this.evtProductFeatureReltns = value;
    }

    /**
     * Gets the value of the evtActvyTypFeatureReltns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEvtActvyTypFeatureReltn }
     *     
     */
    public ArrayOfEvtActvyTypFeatureReltn getEvtActvyTypFeatureReltns() {
        return evtActvyTypFeatureReltns;
    }

    /**
     * Sets the value of the evtActvyTypFeatureReltns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEvtActvyTypFeatureReltn }
     *     
     */
    public void setEvtActvyTypFeatureReltns(ArrayOfEvtActvyTypFeatureReltn value) {
        this.evtActvyTypFeatureReltns = value;
    }

    /**
     * Gets the value of the evtAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAmount() {
        return evtAmount;
    }

    /**
     * Sets the value of the evtAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAmount(JAXBElement<String> value) {
        this.evtAmount = value;
    }

    /**
     * Gets the value of the evtAmountCad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAmountCad() {
        return evtAmountCad;
    }

    /**
     * Sets the value of the evtAmountCad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAmountCad(JAXBElement<String> value) {
        this.evtAmountCad = value;
    }

    /**
     * Gets the value of the evtCurrencyCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtCurrencyCd() {
        return evtCurrencyCd;
    }

    /**
     * Sets the value of the evtCurrencyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtCurrencyCd(JAXBElement<String> value) {
        this.evtCurrencyCd = value;
    }

    /**
     * Gets the value of the evtForexCadRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtForexCadRate() {
        return evtForexCadRate;
    }

    /**
     * Sets the value of the evtForexCadRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtForexCadRate(JAXBElement<String> value) {
        this.evtForexCadRate = value;
    }

    /**
     * Gets the value of the evtSettlementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtSettlementAmount() {
        return evtSettlementAmount;
    }

    /**
     * Sets the value of the evtSettlementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtSettlementAmount(JAXBElement<String> value) {
        this.evtSettlementAmount = value;
    }

    /**
     * Gets the value of the evtSettlementCurrencyCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtSettlementCurrencyCd() {
        return evtSettlementCurrencyCd;
    }

    /**
     * Sets the value of the evtSettlementCurrencyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtSettlementCurrencyCd(JAXBElement<String> value) {
        this.evtSettlementCurrencyCd = value;
    }

    /**
     * Gets the value of the evtSourceChannelInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtSourceChannelInstanceId() {
        return evtSourceChannelInstanceId;
    }

    /**
     * Sets the value of the evtSourceChannelInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtSourceChannelInstanceId(JAXBElement<String> value) {
        this.evtSourceChannelInstanceId = value;
    }

    /**
     * Gets the value of the evtChannelTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtChannelTypCd() {
        return evtChannelTypCd;
    }

    /**
     * Sets the value of the evtChannelTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtChannelTypCd(JAXBElement<String> value) {
        this.evtChannelTypCd = value;
    }

    /**
     * Gets the value of the evtTransitNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtTransitNo() {
        return evtTransitNo;
    }

    /**
     * Sets the value of the evtTransitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtTransitNo(JAXBElement<String> value) {
        this.evtTransitNo = value;
    }

    /**
     * Gets the value of the evtAccessDeviceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAccessDeviceId() {
        return evtAccessDeviceId;
    }

    /**
     * Sets the value of the evtAccessDeviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAccessDeviceId(JAXBElement<String> value) {
        this.evtAccessDeviceId = value;
    }

    /**
     * Gets the value of the evtAccessDeviceTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAccessDeviceTypCd() {
        return evtAccessDeviceTypCd;
    }

    /**
     * Sets the value of the evtAccessDeviceTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAccessDeviceTypCd(JAXBElement<String> value) {
        this.evtAccessDeviceTypCd = value;
    }

    /**
     * Gets the value of the evtAccessDeviceSubTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAccessDeviceSubTypCd() {
        return evtAccessDeviceSubTypCd;
    }

    /**
     * Sets the value of the evtAccessDeviceSubTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAccessDeviceSubTypCd(JAXBElement<String> value) {
        this.evtAccessDeviceSubTypCd = value;
    }

    /**
     * Gets the value of the evtAccessDeviceOsVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAccessDeviceOsVersion() {
        return evtAccessDeviceOsVersion;
    }

    /**
     * Sets the value of the evtAccessDeviceOsVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAccessDeviceOsVersion(JAXBElement<String> value) {
        this.evtAccessDeviceOsVersion = value;
    }

    /**
     * Gets the value of the evtAccessDeviceSimCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAccessDeviceSimCardNo() {
        return evtAccessDeviceSimCardNo;
    }

    /**
     * Sets the value of the evtAccessDeviceSimCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAccessDeviceSimCardNo(JAXBElement<String> value) {
        this.evtAccessDeviceSimCardNo = value;
    }

    /**
     * Gets the value of the evtAccessDeviceModelNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAccessDeviceModelNo() {
        return evtAccessDeviceModelNo;
    }

    /**
     * Sets the value of the evtAccessDeviceModelNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAccessDeviceModelNo(JAXBElement<String> value) {
        this.evtAccessDeviceModelNo = value;
    }

    /**
     * Gets the value of the evtAccessDeviceGeoLocLong property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAccessDeviceGeoLocLong() {
        return evtAccessDeviceGeoLocLong;
    }

    /**
     * Sets the value of the evtAccessDeviceGeoLocLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAccessDeviceGeoLocLong(JAXBElement<String> value) {
        this.evtAccessDeviceGeoLocLong = value;
    }

    /**
     * Gets the value of the evtAccessDeviceGeoLocLat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAccessDeviceGeoLocLat() {
        return evtAccessDeviceGeoLocLat;
    }

    /**
     * Sets the value of the evtAccessDeviceGeoLocLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAccessDeviceGeoLocLat(JAXBElement<String> value) {
        this.evtAccessDeviceGeoLocLat = value;
    }

    /**
     * Gets the value of the evtContactMthdTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtContactMthdTypCd() {
        return evtContactMthdTypCd;
    }

    /**
     * Sets the value of the evtContactMthdTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtContactMthdTypCd(JAXBElement<String> value) {
        this.evtContactMthdTypCd = value;
    }

    /**
     * Gets the value of the evtContactPointTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtContactPointTypCd() {
        return evtContactPointTypCd;
    }

    /**
     * Sets the value of the evtContactPointTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtContactPointTypCd(JAXBElement<String> value) {
        this.evtContactPointTypCd = value;
    }

    /**
     * Gets the value of the evtCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtCardNo() {
        return evtCardNo;
    }

    /**
     * Sets the value of the evtCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtCardNo(JAXBElement<String> value) {
        this.evtCardNo = value;
    }

    /**
     * Gets the value of the evtCardTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtCardTypCd() {
        return evtCardTypCd;
    }

    /**
     * Sets the value of the evtCardTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtCardTypCd(JAXBElement<String> value) {
        this.evtCardTypCd = value;
    }

    /**
     * Gets the value of the evtCardIssuingFi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtCardIssuingFi() {
        return evtCardIssuingFi;
    }

    /**
     * Sets the value of the evtCardIssuingFi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtCardIssuingFi(JAXBElement<String> value) {
        this.evtCardIssuingFi = value;
    }

    /**
     * Gets the value of the evtCardIssueNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtCardIssueNo() {
        return evtCardIssueNo;
    }

    /**
     * Sets the value of the evtCardIssueNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtCardIssueNo(JAXBElement<String> value) {
        this.evtCardIssueNo = value;
    }

    /**
     * Gets the value of the evtCardSequenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtCardSequenceNo() {
        return evtCardSequenceNo;
    }

    /**
     * Sets the value of the evtCardSequenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtCardSequenceNo(JAXBElement<String> value) {
        this.evtCardSequenceNo = value;
    }

    /**
     * Gets the value of the evtCrossSellIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtCrossSellIndicator() {
        return evtCrossSellIndicator;
    }

    /**
     * Sets the value of the evtCrossSellIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtCrossSellIndicator(JAXBElement<String> value) {
        this.evtCrossSellIndicator = value;
    }

    /**
     * Gets the value of the evtIdentityVldtnMthdTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtIdentityVldtnMthdTypCd() {
        return evtIdentityVldtnMthdTypCd;
    }

    /**
     * Sets the value of the evtIdentityVldtnMthdTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtIdentityVldtnMthdTypCd(JAXBElement<String> value) {
        this.evtIdentityVldtnMthdTypCd = value;
    }

    /**
     * Gets the value of the evtFulfillmentMthdTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtFulfillmentMthdTypCd() {
        return evtFulfillmentMthdTypCd;
    }

    /**
     * Sets the value of the evtFulfillmentMthdTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtFulfillmentMthdTypCd(JAXBElement<String> value) {
        this.evtFulfillmentMthdTypCd = value;
    }

    /**
     * Gets the value of the evtAppointmentTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAppointmentTypCd() {
        return evtAppointmentTypCd;
    }

    /**
     * Sets the value of the evtAppointmentTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAppointmentTypCd(JAXBElement<String> value) {
        this.evtAppointmentTypCd = value;
    }

    /**
     * Gets the value of the evtAppointmentDescTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAppointmentDescTypCd() {
        return evtAppointmentDescTypCd;
    }

    /**
     * Sets the value of the evtAppointmentDescTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAppointmentDescTypCd(JAXBElement<String> value) {
        this.evtAppointmentDescTypCd = value;
    }

    /**
     * Gets the value of the evtAppointmentPurposeTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAppointmentPurposeTypCd() {
        return evtAppointmentPurposeTypCd;
    }

    /**
     * Sets the value of the evtAppointmentPurposeTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAppointmentPurposeTypCd(JAXBElement<String> value) {
        this.evtAppointmentPurposeTypCd = value;
    }

    /**
     * Gets the value of the evtInitdByCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtInitdByCd() {
        return evtInitdByCd;
    }

    /**
     * Sets the value of the evtInitdByCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtInitdByCd(JAXBElement<String> value) {
        this.evtInitdByCd = value;
    }

    /**
     * Gets the value of the evtComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtComment() {
        return evtComment;
    }

    /**
     * Sets the value of the evtComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtComment(JAXBElement<String> value) {
        this.evtComment = value;
    }

    /**
     * Gets the value of the evtAcctAppSysAppCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAcctAppSysAppCd() {
        return evtAcctAppSysAppCd;
    }

    /**
     * Sets the value of the evtAcctAppSysAppCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAcctAppSysAppCd(JAXBElement<String> value) {
        this.evtAcctAppSysAppCd = value;
    }

    /**
     * Gets the value of the evtAcctAppId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAcctAppId() {
        return evtAcctAppId;
    }

    /**
     * Sets the value of the evtAcctAppId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAcctAppId(JAXBElement<String> value) {
        this.evtAcctAppId = value;
    }

    /**
     * Gets the value of the evtAcctDrCrCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAcctDrCrCd() {
        return evtAcctDrCrCd;
    }

    /**
     * Sets the value of the evtAcctDrCrCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAcctDrCrCd(JAXBElement<String> value) {
        this.evtAcctDrCrCd = value;
    }

    /**
     * Gets the value of the evtCampaignId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtCampaignId() {
        return evtCampaignId;
    }

    /**
     * Sets the value of the evtCampaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtCampaignId(JAXBElement<String> value) {
        this.evtCampaignId = value;
    }

    /**
     * Gets the value of the evtOfferExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEvtOfferExpiryDate() {
        return evtOfferExpiryDate;
    }

    /**
     * Sets the value of the evtOfferExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEvtOfferExpiryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.evtOfferExpiryDate = value;
    }

    /**
     * Gets the value of the evtAdjudicationCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAdjudicationCd() {
        return evtAdjudicationCd;
    }

    /**
     * Sets the value of the evtAdjudicationCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAdjudicationCd(JAXBElement<String> value) {
        this.evtAdjudicationCd = value;
    }

    /**
     * Gets the value of the evtOrgntAppCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtOrgntAppCd() {
        return evtOrgntAppCd;
    }

    /**
     * Sets the value of the evtOrgntAppCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtOrgntAppCd(JAXBElement<String> value) {
        this.evtOrgntAppCd = value;
    }

    /**
     * Gets the value of the evtMktgReferenceCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtMktgReferenceCd() {
        return evtMktgReferenceCd;
    }

    /**
     * Sets the value of the evtMktgReferenceCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtMktgReferenceCd(JAXBElement<String> value) {
        this.evtMktgReferenceCd = value;
    }

    /**
     * Gets the value of the evtOfferInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtOfferInterestRate() {
        return evtOfferInterestRate;
    }

    /**
     * Sets the value of the evtOfferInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtOfferInterestRate(JAXBElement<String> value) {
        this.evtOfferInterestRate = value;
    }

    /**
     * Gets the value of the evtSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtSessionId() {
        return evtSessionId;
    }

    /**
     * Sets the value of the evtSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtSessionId(JAXBElement<String> value) {
        this.evtSessionId = value;
    }

    /**
     * Gets the value of the evtAddrUsgTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAddrUsgTypCd() {
        return evtAddrUsgTypCd;
    }

    /**
     * Sets the value of the evtAddrUsgTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAddrUsgTypCd(JAXBElement<String> value) {
        this.evtAddrUsgTypCd = value;
    }

    /**
     * Gets the value of the evtAddrLin1Txt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAddrLin1Txt() {
        return evtAddrLin1Txt;
    }

    /**
     * Sets the value of the evtAddrLin1Txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAddrLin1Txt(JAXBElement<String> value) {
        this.evtAddrLin1Txt = value;
    }

    /**
     * Gets the value of the evtAddrLin2Txt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAddrLin2Txt() {
        return evtAddrLin2Txt;
    }

    /**
     * Sets the value of the evtAddrLin2Txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAddrLin2Txt(JAXBElement<String> value) {
        this.evtAddrLin2Txt = value;
    }

    /**
     * Gets the value of the evtCtyTwnNm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtCtyTwnNm() {
        return evtCtyTwnNm;
    }

    /**
     * Sets the value of the evtCtyTwnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtCtyTwnNm(JAXBElement<String> value) {
        this.evtCtyTwnNm = value;
    }

    /**
     * Gets the value of the evtSubcntryCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtSubcntryCd() {
        return evtSubcntryCd;
    }

    /**
     * Sets the value of the evtSubcntryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtSubcntryCd(JAXBElement<String> value) {
        this.evtSubcntryCd = value;
    }

    /**
     * Gets the value of the evtPstlZipCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtPstlZipCd() {
        return evtPstlZipCd;
    }

    /**
     * Sets the value of the evtPstlZipCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtPstlZipCd(JAXBElement<String> value) {
        this.evtPstlZipCd = value;
    }

    /**
     * Gets the value of the evtCntryCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtCntryCd() {
        return evtCntryCd;
    }

    /**
     * Sets the value of the evtCntryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtCntryCd(JAXBElement<String> value) {
        this.evtCntryCd = value;
    }

    /**
     * Gets the value of the evtReqAuthMthdCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtReqAuthMthdCd() {
        return evtReqAuthMthdCd;
    }

    /**
     * Sets the value of the evtReqAuthMthdCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtReqAuthMthdCd(JAXBElement<String> value) {
        this.evtReqAuthMthdCd = value;
    }

    /**
     * Gets the value of the evtOrgntIpAddrTxt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtOrgntIpAddrTxt() {
        return evtOrgntIpAddrTxt;
    }

    /**
     * Sets the value of the evtOrgntIpAddrTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtOrgntIpAddrTxt(JAXBElement<String> value) {
        this.evtOrgntIpAddrTxt = value;
    }

    /**
     * Gets the value of the evtMbDevcCrrCoCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtMbDevcCrrCoCd() {
        return evtMbDevcCrrCoCd;
    }

    /**
     * Sets the value of the evtMbDevcCrrCoCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtMbDevcCrrCoCd(JAXBElement<String> value) {
        this.evtMbDevcCrrCoCd = value;
    }

    /**
     * Gets the value of the evtOfiTrNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtOfiTrNo() {
        return evtOfiTrNo;
    }

    /**
     * Sets the value of the evtOfiTrNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtOfiTrNo(JAXBElement<String> value) {
        this.evtOfiTrNo = value;
    }

    /**
     * Gets the value of the evtOfiBnkNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtOfiBnkNo() {
        return evtOfiBnkNo;
    }

    /**
     * Sets the value of the evtOfiBnkNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtOfiBnkNo(JAXBElement<String> value) {
        this.evtOfiBnkNo = value;
    }

    /**
     * Gets the value of the evtOfiAcctNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtOfiAcctNo() {
        return evtOfiAcctNo;
    }

    /**
     * Sets the value of the evtOfiAcctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtOfiAcctNo(JAXBElement<String> value) {
        this.evtOfiAcctNo = value;
    }

    /**
     * Gets the value of the evtOfiAcctTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtOfiAcctTypCd() {
        return evtOfiAcctTypCd;
    }

    /**
     * Sets the value of the evtOfiAcctTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtOfiAcctTypCd(JAXBElement<String> value) {
        this.evtOfiAcctTypCd = value;
    }

    /**
     * Gets the value of the evtOfiAcctOwnDclrnInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtOfiAcctOwnDclrnInd() {
        return evtOfiAcctOwnDclrnInd;
    }

    /**
     * Sets the value of the evtOfiAcctOwnDclrnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtOfiAcctOwnDclrnInd(JAXBElement<String> value) {
        this.evtOfiAcctOwnDclrnInd = value;
    }

    /**
     * Gets the value of the evtDelvryMthdCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtDelvryMthdCd() {
        return evtDelvryMthdCd;
    }

    /**
     * Sets the value of the evtDelvryMthdCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtDelvryMthdCd(JAXBElement<String> value) {
        this.evtDelvryMthdCd = value;
    }

    /**
     * Gets the value of the evtBusinessProcessTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtBusinessProcessTypCd() {
        return evtBusinessProcessTypCd;
    }

    /**
     * Sets the value of the evtBusinessProcessTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtBusinessProcessTypCd(JAXBElement<String> value) {
        this.evtBusinessProcessTypCd = value;
    }

    /**
     * Gets the value of the evtAcsCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAcsCd() {
        return evtAcsCd;
    }

    /**
     * Sets the value of the evtAcsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAcsCd(JAXBElement<String> value) {
        this.evtAcsCd = value;
    }

    /**
     * Gets the value of the evtMktgSysAppCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtMktgSysAppCd() {
        return evtMktgSysAppCd;
    }

    /**
     * Sets the value of the evtMktgSysAppCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtMktgSysAppCd(JAXBElement<String> value) {
        this.evtMktgSysAppCd = value;
    }

    /**
     * Gets the value of the evtMembrshpId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtMembrshpId() {
        return evtMembrshpId;
    }

    /**
     * Sets the value of the evtMembrshpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtMembrshpId(JAXBElement<String> value) {
        this.evtMembrshpId = value;
    }

    /**
     * Gets the value of the evtMembrshpIdTyp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtMembrshpIdTyp() {
        return evtMembrshpIdTyp;
    }

    /**
     * Sets the value of the evtMembrshpIdTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtMembrshpIdTyp(JAXBElement<String> value) {
        this.evtMembrshpIdTyp = value;
    }

    /**
     * Gets the value of the evtMktgAdjdcnTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtMktgAdjdcnTypCd() {
        return evtMktgAdjdcnTypCd;
    }

    /**
     * Sets the value of the evtMktgAdjdcnTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtMktgAdjdcnTypCd(JAXBElement<String> value) {
        this.evtMktgAdjdcnTypCd = value;
    }

    /**
     * Gets the value of the evtRtlPrtnrAgtId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtRtlPrtnrAgtId() {
        return evtRtlPrtnrAgtId;
    }

    /**
     * Sets the value of the evtRtlPrtnrAgtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtRtlPrtnrAgtId(JAXBElement<String> value) {
        this.evtRtlPrtnrAgtId = value;
    }

    /**
     * Gets the value of the evtRtlPrtnrStoreId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtRtlPrtnrStoreId() {
        return evtRtlPrtnrStoreId;
    }

    /**
     * Sets the value of the evtRtlPrtnrStoreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtRtlPrtnrStoreId(JAXBElement<String> value) {
        this.evtRtlPrtnrStoreId = value;
    }

    /**
     * Gets the value of the evtBusinessContextId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtBusinessContextId() {
        return evtBusinessContextId;
    }

    /**
     * Sets the value of the evtBusinessContextId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtBusinessContextId(JAXBElement<String> value) {
        this.evtBusinessContextId = value;
    }

    /**
     * Gets the value of the evtMbDevcCntryCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtMbDevcCntryCd() {
        return evtMbDevcCntryCd;
    }

    /**
     * Sets the value of the evtMbDevcCntryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtMbDevcCntryCd(JAXBElement<String> value) {
        this.evtMbDevcCntryCd = value;
    }

    /**
     * Gets the value of the evtExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEvtExtension }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEvtExtension> getEvtExtensions() {
        return evtExtensions;
    }

    /**
     * Sets the value of the evtExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEvtExtension }{@code >}
     *     
     */
    public void setEvtExtensions(JAXBElement<ArrayOfEvtExtension> value) {
        this.evtExtensions = value;
    }

}
