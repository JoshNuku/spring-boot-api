package com.josh.cpen_208.models;

public class formdata {
    private String title;
    private String code;
  
    // Default constructor (required for deserialization)
    public formdata() {
    }
  
    // Getters and setters
    public String gettitle() {
      return title;
    }
  
    public void settitle(String title) {
      this.title = title;
    }
  
    public String getcode() {
      return code;
    }
  
    public void setcode(String code) {
      this.code = code;
    }
  }