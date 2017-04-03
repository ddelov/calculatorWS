package com.estafet.dd.calculator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Delcho Delov on 1.3.2017 г..
 */
public interface Calculator {
		@WebMethod(operationName = "addDoubles")
		Double add(@XmlElement(required = true) @WebParam(name = "arg1") Double a, @XmlElement(required = true) @WebParam(name = "arg2") Double b);

		@WebMethod(operationName = "addComplex")
		Complex addComplex(@XmlElement(required = true) @WebParam(name = "arg1") Complex a, @XmlElement(required = true) @WebParam(name = "arg2") Complex b);
}
