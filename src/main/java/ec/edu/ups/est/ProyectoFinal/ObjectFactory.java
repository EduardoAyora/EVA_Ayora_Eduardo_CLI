
package ec.edu.ups.est.ProyectoFinal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.ups.est.ProyectoFinal package. 
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

    private final static QName _CrearAutomovil_QNAME = new QName("http://bean.ProyectoFinal.est.ups.edu.ec/", "crearAutomovil");
    private final static QName _CrearAutomovilResponse_QNAME = new QName("http://bean.ProyectoFinal.est.ups.edu.ec/", "crearAutomovilResponse");
    private final static QName _GetAutomoviles_QNAME = new QName("http://bean.ProyectoFinal.est.ups.edu.ec/", "getAutomoviles");
    private final static QName _GetAutomovilesResponse_QNAME = new QName("http://bean.ProyectoFinal.est.ups.edu.ec/", "getAutomovilesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.ups.est.ProyectoFinal
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearAutomovil }
     * 
     */
    public CrearAutomovil createCrearAutomovil() {
        return new CrearAutomovil();
    }

    /**
     * Create an instance of {@link CrearAutomovilResponse }
     * 
     */
    public CrearAutomovilResponse createCrearAutomovilResponse() {
        return new CrearAutomovilResponse();
    }

    /**
     * Create an instance of {@link GetAutomoviles }
     * 
     */
    public GetAutomoviles createGetAutomoviles() {
        return new GetAutomoviles();
    }

    /**
     * Create an instance of {@link GetAutomovilesResponse }
     * 
     */
    public GetAutomovilesResponse createGetAutomovilesResponse() {
        return new GetAutomovilesResponse();
    }

    /**
     * Create an instance of {@link Automovil }
     * 
     */
    public Automovil createAutomovil() {
        return new Automovil();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearAutomovil }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearAutomovil }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.ProyectoFinal.est.ups.edu.ec/", name = "crearAutomovil")
    public JAXBElement<CrearAutomovil> createCrearAutomovil(CrearAutomovil value) {
        return new JAXBElement<CrearAutomovil>(_CrearAutomovil_QNAME, CrearAutomovil.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearAutomovilResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearAutomovilResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.ProyectoFinal.est.ups.edu.ec/", name = "crearAutomovilResponse")
    public JAXBElement<CrearAutomovilResponse> createCrearAutomovilResponse(CrearAutomovilResponse value) {
        return new JAXBElement<CrearAutomovilResponse>(_CrearAutomovilResponse_QNAME, CrearAutomovilResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAutomoviles }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAutomoviles }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.ProyectoFinal.est.ups.edu.ec/", name = "getAutomoviles")
    public JAXBElement<GetAutomoviles> createGetAutomoviles(GetAutomoviles value) {
        return new JAXBElement<GetAutomoviles>(_GetAutomoviles_QNAME, GetAutomoviles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAutomovilesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAutomovilesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.ProyectoFinal.est.ups.edu.ec/", name = "getAutomovilesResponse")
    public JAXBElement<GetAutomovilesResponse> createGetAutomovilesResponse(GetAutomovilesResponse value) {
        return new JAXBElement<GetAutomovilesResponse>(_GetAutomovilesResponse_QNAME, GetAutomovilesResponse.class, null, value);
    }

}
