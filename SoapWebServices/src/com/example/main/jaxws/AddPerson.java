
package com.example.main.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.16
 * Wed Jan 17 09:57:17 IST 2018
 * Generated source version: 3.0.16
 */

@XmlRootElement(name = "addPerson", namespace = "http://main.example.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPerson", namespace = "http://main.example.com/")

public class AddPerson {

    @XmlElement(name = "arg0")
    private com.example.main.Person arg0;

    public com.example.main.Person getArg0() {
        return this.arg0;
    }

    public void setArg0(com.example.main.Person newArg0)  {
        this.arg0 = newArg0;
    }

}

