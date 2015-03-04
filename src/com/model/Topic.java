package com.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "t")
public class Topic {
	private int idTOPICS;
	private String NAME;
	private String CREATEDBY;
	private String CREATEDIN;
	private String SUBJECT;

	@XmlElement
	public int getIdTOPICS() {
		return idTOPICS;
	}

	public void setIdTOPICS(int idTOPICS) {
		this.idTOPICS = idTOPICS;
	}
	@XmlElement
	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getCREATEDBY() {
		return CREATEDBY;
	}

	public void setCREATEDBY(String cREATEDBY) {
		CREATEDBY = cREATEDBY;
	}

	public String getCREATEDIN() {
		return CREATEDIN;
	}

	public void setCREATEDIN(String cREATEDIN) {
		CREATEDIN = cREATEDIN;
	}

	@XmlElement
	public String getSUBJECT() {
		return SUBJECT;
	}

	public void setSUBJECT(String sUBJECT) {
		SUBJECT = sUBJECT;
	}
}
