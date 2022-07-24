
public class Phone 
{
	 	private String phoneProvider;
	    private String brand;
	    private int price;
	  
	    public Phone()
	    {
	    	
	    }

		public Phone(String phoneProvider, String brand) 
		{
			this.phoneProvider = phoneProvider;
			this.brand = brand;
		}

		public Phone(String phoneProvider, String brand, int price) 
		{
			this.phoneProvider = phoneProvider;
			this.brand = brand;
			this.price = price;
		}

		public String getPhoneProvider() 
		{
			return phoneProvider;
		}

		public String getBrand() 
		{
			return brand;
		}

		public int getPrice() 
		{
			return price;
		}

		public void setPhoneProvider(String phoneProvider) 
		{
			this.phoneProvider = phoneProvider;
		}

		public void setBrand(String brand) 
		{
			this.brand = brand;
		}

		public void setPrice(int price) 
		{
			this.price = price;
		}
		
		public boolean isNew()
		{
			return true;
		}
		
		public String checkout()
		{
			return "Will that be all?";
		}
		
		
	    
	    
}
