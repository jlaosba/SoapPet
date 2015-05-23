
package pe.com.soappet.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DoctorWS", targetNamespace = "http://service.soappet.com.pe/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DoctorWS {


    /**
     * 
     * @return
     *     returns java.util.List<pe.com.soappet.service.Doctor>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarDoctores", targetNamespace = "http://service.soappet.com.pe/", className = "pe.com.soappet.service.ListarDoctores")
    @ResponseWrapper(localName = "listarDoctoresResponse", targetNamespace = "http://service.soappet.com.pe/", className = "pe.com.soappet.service.ListarDoctoresResponse")
    @Action(input = "http://service.soappet.com.pe/DoctorWS/listarDoctoresRequest", output = "http://service.soappet.com.pe/DoctorWS/listarDoctoresResponse")
    public List<Doctor> listarDoctores();

    /**
     * 
     * @param idDoctor
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarDoctor", targetNamespace = "http://service.soappet.com.pe/", className = "pe.com.soappet.service.EliminarDoctor")
    @ResponseWrapper(localName = "eliminarDoctorResponse", targetNamespace = "http://service.soappet.com.pe/", className = "pe.com.soappet.service.EliminarDoctorResponse")
    @Action(input = "http://service.soappet.com.pe/DoctorWS/eliminarDoctorRequest", output = "http://service.soappet.com.pe/DoctorWS/eliminarDoctorResponse")
    public String eliminarDoctor(
        @WebParam(name = "idDoctor", targetNamespace = "")
        int idDoctor);

    /**
     * 
     * @param doctor
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "guardarDoctor", targetNamespace = "http://service.soappet.com.pe/", className = "pe.com.soappet.service.GuardarDoctor")
    @ResponseWrapper(localName = "guardarDoctorResponse", targetNamespace = "http://service.soappet.com.pe/", className = "pe.com.soappet.service.GuardarDoctorResponse")
    @Action(input = "http://service.soappet.com.pe/DoctorWS/guardarDoctorRequest", output = "http://service.soappet.com.pe/DoctorWS/guardarDoctorResponse")
    public String guardarDoctor(
        @WebParam(name = "doctor", targetNamespace = "")
        Doctor doctor);

    /**
     * 
     * @param id
     * @return
     *     returns pe.com.soappet.service.Doctor
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerDoctor", targetNamespace = "http://service.soappet.com.pe/", className = "pe.com.soappet.service.ObtenerDoctor")
    @ResponseWrapper(localName = "obtenerDoctorResponse", targetNamespace = "http://service.soappet.com.pe/", className = "pe.com.soappet.service.ObtenerDoctorResponse")
    @Action(input = "http://service.soappet.com.pe/DoctorWS/obtenerDoctorRequest", output = "http://service.soappet.com.pe/DoctorWS/obtenerDoctorResponse")
    public Doctor obtenerDoctor(
        @WebParam(name = "id", targetNamespace = "")
        int id);

}