
package inner_scoped_element;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="stockage">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence minOccurs="0">
 *                   <element name="stockage" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <all>
 *                             <element name="collection" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence maxOccurs="unbounded" minOccurs="0">
 *                                       <element name="effect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       <element name="term" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </all>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stockage"
})
@XmlRootElement(name = "catalogue")
public class Catalogue {

    @XmlElementWrapper(required = true)
    @XmlElement(name = "stockage")
    protected List<Catalogue.StockageStockage> stockage = new ArrayList<>();

    public List<Catalogue.StockageStockage> getStockage() {
        return stockage;
    }

    public void setStockage(List<Catalogue.StockageStockage> stockage) {
        this.stockage = stockage;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <all>
     *         <element name="collection" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence maxOccurs="unbounded" minOccurs="0">
     *                   <element name="effect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   <element name="term" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </all>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class StockageStockage {

        @XmlElementWrapper
        @XmlElementRefs({
            @XmlElementRef(name = "effect", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "term", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<String>> collection = new ArrayList<>();

        public List<JAXBElement<String>> getCollection() {
            return collection;
        }

        public void setCollection(List<JAXBElement<String>> collection) {
            this.collection = collection;
        }

    }

}
