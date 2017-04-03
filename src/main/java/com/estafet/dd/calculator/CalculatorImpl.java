package com.estafet.dd.calculator;

import org.apache.log4j.Logger;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.ws.Endpoint;

/**
 * Created by Delcho Delov on 1.3.2017 г..
 */
@WebService(name="CalculatorImpl", targetNamespace = "DDtest")
public class CalculatorImpl implements Calculator {
		private final static Logger logger = Logger.getLogger(CalculatorImpl.class);

		public CalculatorImpl(){
				System.out.println("CalculatorImpl WS created");
		}
		@WebMethod(operationName = "addDoubles")
		public Double add(@XmlElement(required = true) @WebParam(name = "arg1") Double a, @XmlElement(required = true) @WebParam(name = "arg2") Double b){
				final double res = a + b;
				logger.debug("sum of "+a + " and " + b + " is "+ res);
				return res;
		}
		@WebMethod(operationName = "addComplex")
		public Complex addComplex(@XmlElement(required = true) @WebParam(name = "arg1") Complex a, @XmlElement(required = true) @WebParam(name = "arg2") Complex b){
				return a.add(b);
		}

		public static void main(String[] args) {
//				Calculator calculator = new CalculatorImpl();
//				if(args.length<2){
//						final Double res = calculator.add(70d, 2d);
//						System.out.println("res = " + res);
//				}else{
////						Scanner scanner = new Scanner(System.in);
////						double i = scanner.nextDouble();
////						double k = scanner.nextDouble();
////						final Double res = calculator.add(i, k);
//						final Double res = calculator.add(Double.valueOf(args[0]), Double.valueOf(args[1]));
//						System.out.println("res = " + res);
//				}
				Endpoint.publish("http://calculator-calculator.192.168.42.182.nip.io:8080/ws/CalculatorImpl", new CalculatorImpl());
		}
}
