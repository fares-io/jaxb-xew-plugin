
package element_any_type;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the element_any_type package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _EntryKey_QNAME = new QName("", "key");
    private static final QName _EntryValue_QNAME = new QName("", "value");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: element_any_type
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Conversion }
     * 
     * @return
     *     the new instance of {@link Conversion }
     */
    public Conversion createConversion() {
        return new Conversion();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     * @return
     *     the new instance of {@link Entry }
     */
    public Entry createEntry() {
        return new Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "key", scope = Entry.class)
    public JAXBElement<Object> createEntryKey(Object value) {
        return new JAXBElement<>(_EntryKey_QNAME, Object.class, Entry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "value", scope = Entry.class)
    public JAXBElement<Object> createEntryValue(Object value) {
        return new JAXBElement<>(_EntryValue_QNAME, Object.class, Entry.class, value);
    }

}
