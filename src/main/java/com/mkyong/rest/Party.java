package com.mkyong.rest;

import java.awt.Image;

public class Party {
	private String personPhoto;
	public String getPersonPhoto() {
		return personPhoto;
	}

	public void setPersonPhoto(String personPhoto) {
		this.personPhoto = personPhoto;
	}

	private String personName;
    private String partyName;
    private String desgination;
    public String getDesgination() {
        return desgination;
    }

    public void setDesgination(String desgination) {
        this.desgination = desgination;
    }
    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

	public void setPersonPhoto(Image img) {
		// TODO Auto-generated method stub
		
	}


}
