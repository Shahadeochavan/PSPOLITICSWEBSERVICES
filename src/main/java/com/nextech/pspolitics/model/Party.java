package com.nextech.pspolitics.model;

public class Party {
	private String partyImage;
	private String personImage;
	private String personName;
    private String partyName;
    private String desgination;
    private String aboutParty;
	  public String getAboutParty() {
		return aboutParty;
	}

	public void setAboutParty(String aboutParty) {
		this.aboutParty = aboutParty;
	}

	public String getPartyImage() {
		return partyImage;
	}

	public void setPartyImage(String partyImage) {
		this.partyImage = partyImage;
	}
    public String getPersonImage() {
		return personImage;
	}

	public void setPersonImage(String personImage) {
		this.personImage = personImage;
	}

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


}
