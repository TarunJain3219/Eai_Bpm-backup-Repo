
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

@XmlRootElement(name = "DeletePersonResponse", namespace = "http://main.example.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeletePersonResponse", namespace = "http://main.example.com/")

public class DeletePersonResponse {

    @XmlElement(name = "return")
    private boolean _return;

    public boolean getReturn() {
        return this._return;
    }

    public void setReturn(boolean new_return)  {
        this._return = new_return;
    }

}

