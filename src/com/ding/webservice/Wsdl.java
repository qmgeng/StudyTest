/**
 * Wsdl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.ding.webservice;

public interface Wsdl extends javax.xml.rpc.Service {
    public java.lang.String getwsdlPortAddress();

    public com.ding.webservice.WsdlPortType getwsdlPort() throws javax.xml.rpc.ServiceException;

    public com.ding.webservice.WsdlPortType getwsdlPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
