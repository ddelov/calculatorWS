package com.estafet.dd.calculator;

import org.apache.log4j.Logger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Delcho Delov on 1.3.2017 г..
 */
@XmlType(name = "ComplexType")
@XmlAccessorType(XmlAccessType.FIELD)
public class Complex {
		private final Logger logger = Logger.getLogger(Complex.class);
		private int intPart;
		private int imagPart;

		public Complex(){
				intPart = 0;
				imagPart = 0;
		}
		public Complex(int a, int b){
				this.intPart = a;
				this.imagPart = b;
		}
		public int getIntPart() {
				return intPart;
		}
		public Complex add(Complex b) {
				final Complex res = new Complex(intPart + b.intPart, imagPart + b.imagPart);
				logger.debug("sum of "+toString() + " and " + b.toString() + " is "+res);
				return res;
		}
		public void setIntPart(int intPart) {
				this.intPart = intPart;
		}

		public int getImagPart() {
				return imagPart;
		}

		public void setImagPart(int imagPart) {
				this.imagPart = imagPart;
		}

		@Override
		public String toString() {
				return "Complex{" +
								"intPart=" + intPart +
								", imagPart=" + imagPart +
								'}';
		}
}
