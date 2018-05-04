package Enum;

public enum SizeConstants{
	  EIGHTFIVE("8.5"), NINE("9"),NINEFIVE("9.5"),
	  TEN("10"), TENFIVE("10.5"),ELEVEN("11") , 
	  TWELVE("12"),THIRTEEN("13");
	  private String value;
	  
	  @Override
	    public String toString() {
	        return value;
	    }
	  
	  SizeConstants(String value){
	    this.value = value;
	  }
	}