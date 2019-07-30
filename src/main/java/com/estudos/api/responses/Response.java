package com.estudos.api.responses;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@XmlRootElement
public class Response<T> {
	
	private T data;
	private List<String> errors;
	
	public List<String> getErrors() {
		if (this.errors == null) {
			return new ArrayList<>();
		}
		return errors;
	}
	
}
