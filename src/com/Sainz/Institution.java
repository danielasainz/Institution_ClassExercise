package com.Sainz;

public class Institution {

    @Override
    public String toString() {
        return institutionName;
    }

    private String institutionName;

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }
}
