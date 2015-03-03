package com.model;

public class Topic {
	private int idTOPICS;
	private String NAME;
	private String CREATEDBY;
	private String CREATEDIN;
	private String SUBJECT;

	public int getIdTOPICS() {
		return idTOPICS;
	}

	public void setIdTOPICS(int idTOPICS) {
		this.idTOPICS = idTOPICS;
	}

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

	public String getSUBJECT() {
		return SUBJECT;
	}

	public void setSUBJECT(String sUBJECT) {
		SUBJECT = sUBJECT;
	}
}
