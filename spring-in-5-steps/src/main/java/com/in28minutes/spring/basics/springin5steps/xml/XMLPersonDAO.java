package com.in28minutes.spring.basics.springin5steps.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class XMLPersonDAO {

    XMLJdbcConnection xmlJdbcConnection;

    public XMLJdbcConnection getXMLJdbcConnection() {
        return xmlJdbcConnection;
    }

    public void setXMLJdbcConnection(XMLJdbcConnection jdbcConnection) {
        this.xmlJdbcConnection = xmlJdbcConnection;
    }


}
