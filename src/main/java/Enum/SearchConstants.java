package Enum;

public enum SearchConstants{
	  SHOES("shoes"), JEANS("jeans");
	  private String value;
	  
	  @Override
	    public String toString() {
	        return value;
	    }
	  
	  SearchConstants(String value){
	    this.value = value;
	  }
	}

