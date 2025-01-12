
package element_name_collision;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the element_name_collision package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: element_name_collision
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Root }
     * 
     * @return
     *     the new instance of {@link Root }
     */
    public Root createRoot() {
        return new Root();
    }

    /**
     * Create an instance of {@link Root.Action }
     * 
     * @return
     *     the new instance of {@link Root.Action }
     */
    public Root.Action createRootAction() {
        return new Root.Action();
    }

    /**
     * Create an instance of {@link Root.Action.AddItem }
     * 
     * @return
     *     the new instance of {@link Root.Action.AddItem }
     */
    public Root.Action.AddItem createRootActionAddItem() {
        return new Root.Action.AddItem();
    }

    /**
     * Create an instance of {@link Root.Action.Item }
     * 
     * @return
     *     the new instance of {@link Root.Action.Item }
     */
    public Root.Action.Item createRootActionItem() {
        return new Root.Action.Item();
    }

}
