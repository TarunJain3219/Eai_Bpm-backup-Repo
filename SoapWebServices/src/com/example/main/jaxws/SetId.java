
package com.example.main.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.16
 * Wed Jan 17 09:49:01 IST 2018
 * Generated source version: 3.0.16
 */

@XmlRootElement(name = "setId", namespace = "http://main.example.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setId", namespace = "http://main.example.com/")

public class SetId {

    @XmlElement(name = "arg0")
    private int arg0;

    public int getArg0() {
        return this.arg0;
    }

    public void setArg0(int newArg0)  {
        this.arg0 = newArg0;
    }

}
