package com.gao.web.controller;

import org.springframework.core.convert.converter.Converter;

public class IntegerConverter implements Converter<String, Integer> {

	@Override
	public Integer convert(String source) {
		Integer i = null;
		if(source != null) {
			i = Integer.parseInt(source) * 10;
		}
		return i;
	}


}
