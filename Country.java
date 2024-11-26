public class Country{
//constructor chaining
String countryName;
int noOfStates;
int nofPopulation;
String capitalcity;
String nationalGame;
String nationalAnimal;



public Country(){
	
}

public Country(String countryName){
	//this( countryName);
	this.countryName=countryName;
}

public Country(String countryName, int noOfStates){
	this( countryName);
	//this.countryName=countryName;
	this.noOfStates=noOfStates;
}


public Country(String countryName, int noOfStates, int nofPopulation){
	this(countryName,noOfStates);
	/*this.countryName=countryName;
	this.noOfStates=noOfStates;*/
	this.nofPopulation=nofPopulation;
	
}

public Country(String countryName, int noOfStates, int nofPopulation, String capitalcity){
	this(countryName, noOfStates, nofPopulation);
	/*this.countryName=countryName;
	this.noOfStates=noOfStates;
	this.nofPopulation=nofPopulation;*/
	this.capitalcity=capitalcity;
}

public Country(String countryName, int noOfStates, int nofPopulation, String capitalcity, String nationalGame){
	this(countryName, noOfStates, nofPopulation, capitalcity);
	/*this.countryName=countryName;
	this.noOfStates=noOfStates;
	this.nofPopulation=nofPopulation;
	this.capitalcity=capitalcity;*/
	this.nationalGame=nationalGame;
	
}

public Country(String countryName, int noOfStates, int nofPopulation, String capitalcity, String nationalGame,String nationalAnimal){
	this(countryName, noOfStates, nofPopulation, capitalcity, nationalGame);
	/*this. countryName=countryName;
	this.noOfStates=noOfStates;
	this.nofPopulation=nofPopulation;
	this.capitalcity=capitalcity;
	this.nationalGame=nationalGame;*/
	this.nationalAnimal=nationalAnimal;
	
}












	public void printdetails(){
		
		System.out.println("countryName is : "+countryName);
		System.out.println("noOfStates is : "+noOfStates);
		System.out.println("nofPopulation is : "+nofPopulation);
		System.out.println("capitalcity is : "+capitalcity);
		System.out.println("nationalGame is : "+nationalGame);
		System.out.println("nationalAnimal is : "+nationalAnimal);
		
	}
	



}