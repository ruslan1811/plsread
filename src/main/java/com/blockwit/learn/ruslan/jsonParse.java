package com.blockwit.learn.ruslan;


import com.fasterxml.jackson.core.ObjectCodec;

public class jsonParse {
	public static void main (String args[]) {
		String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
		ObjectCodec objectMapper;
		jsonParse car = objectMapper.readValue(json, jsonParse.class);

	}
}
