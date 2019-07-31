package com.estudos.api.responses;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
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
=======
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
>>>>>>> b1c558ddbe43b50907a040b6252ba7cab9b959fa
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
