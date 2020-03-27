package com.teste.uds.demo.domain.dto;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import com.teste.uds.demo.domain.entity.AdditionalsType;
import com.teste.uds.demo.domain.entity.FlavorType;
import com.teste.uds.demo.domain.entity.SizeType;

public class OrdersPersistDTO {
  

    private String size;

    private String flavor;
    
    private List<String> additionals;
    
    private OrdersPersistDTO() {}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public List<String> getAdditionals() {
		return additionals;
	}

	public void setAdditionals(List<String> additionals) {
		this.additionals = additionals;
	}


    

}
