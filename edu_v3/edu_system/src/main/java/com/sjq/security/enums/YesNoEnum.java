package com.sjq.security.enums;

public enum YesNoEnum implements BusinessEnum {
	
	YES("Y", "Y"), NO("N", "N");

	private String code;
	private String name;

	private YesNoEnum(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

}
