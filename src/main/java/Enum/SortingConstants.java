package Enum;

public enum SortingConstants{
	  ASCENPRICE("lowest first"), DESCENPRICE("Price: highest first"), BESTMATCH("Best Match");
	  private String value;
	  
	  @Override
	    public String toString() {
	        return value;
	    }
	  
	  SortingConstants(String value){
	    this.value = value;
	  }
	}

