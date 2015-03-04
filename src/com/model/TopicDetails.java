package com.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


public class TopicDetails {
	private int idTOPICSDETAILS;
	private String COMMENT;
	private String CREATEDBY;
	private String CREATEDIN;
	private int TOPICID;

	public int getIdTOPICSDETAILS() {
		return idTOPICSDETAILS;
	}

	public void setIdTOPICSDETAILS(int idTOPICSDETAILS) {
		this.idTOPICSDETAILS = idTOPICSDETAILS;
	}
	public String getCOMMENT() {
		return COMMENT;
	}

	public void setCOMMENT(String cOMMENT) {
		COMMENT = cOMMENT;
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

	public int getTOPICID() {
		return TOPICID;
	}

	public void setTOPICID(int tOPICID) {
		TOPICID = tOPICID;
	}
}