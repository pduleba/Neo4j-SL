package com.pduleba.spring.utils;

import java.math.BigInteger;
import java.security.SecureRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ProjectUtils {
	
	public static final Logger LOG = LoggerFactory.getLogger(ProjectUtils.class);

	private SecureRandom random = new SecureRandom();


	String generateString(int bitsNum, int radix) {
		return new BigInteger(bitsNum, random).toString(radix);
	}

}