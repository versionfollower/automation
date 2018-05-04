package Enum;

public enum BrandConstants{
	  ADIDAS("adidas"), ASICS("ASICS"),GUCCI("Gucci"),
	  NEWBALANCE("New Balance"), NIKE("Nike"),PRADA("PRADA") , 
	  PUMA("PUMA"),UNBRANDED("Unbranded");
	  private String value;
	  
	  @Override
	    public String toString() {
	        return value;
	    }
	  
	  BrandConstants(String value){
	    this.value = value;
	  }
	}