package com.fomammer.vocab.model;

import java.util.Date;
public class Vocabulary implements java.io.Serializable {

	private int vocabNo;
	private String vocabulary;
	private Date updateDate;
	
	public Vocabulary() {
		// TODO Auto-generated constructor stub
	}

	public int getVocabNo() {
		return vocabNo;
	}

	public void setVocabNo(int vocabNo) {
		this.vocabNo = vocabNo;
	}

	public String getVocabulary() {
		return vocabulary;
	}

	public void setVocabulary(String vocabulary) {
		this.vocabulary = vocabulary;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	

}
