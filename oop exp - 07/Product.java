class Product {
	private String pname, manuf;
	private double cost;
	private double maxDis;

	Product(String pname, double cost, String manuf, double maxDis){
		this.pname = pname;
		this.cost = cost;
		this.manuf = manuf;
		this.maxDis = maxDis;
	}
	
	double getMaxDis(){
		return maxDis;
	}
	double getCost(){
		return cost;
	}
	String getManf(){
		return manuf;
	}
	String getPro(){
		return pname;
	}
	public String toString(){
		return ("\nproduct name : " + pname + " || cost : " + cost + " || Manufacturer: " + manuf + " || Max Discount : " + maxDis +" %"+ "\n");	
	}
}
