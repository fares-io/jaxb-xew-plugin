
package element_with_parent;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the element_with_parent package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: element_with_parent
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Group }
     * 
     * @return
     *     the new instance of {@link Group }
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link Alliance }
     * 
     * @return
     *     the new instance of {@link Alliance }
     */
    public Alliance createAlliance() {
        return new Alliance();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     * @return
     *     the new instance of {@link Organization }
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link Group.Person }
     * 
     * @return
     *     the new instance of {@link Group.Person }
     */
    public Group.Person createGroupPerson() {
        return new Group.Person();
    }

}
