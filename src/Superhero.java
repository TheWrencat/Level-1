
public class Superhero {
	
	String name;
	String power;
	


public Superhero (String name, String power){
	this.name=name;
	this.power=power;
	
}
public String getName(){
	return name;
}
public String setName(){
	return name;
}

public String getPower(){
	return power;
}
public String setPower(){
	return power;
}

public String toString (){
return " "+name+" has mad "+power+" skills.";
}

public static void main(String[] args) {
	
	Superhero one = new Superhero("Superman", "strength");
	Superhero two = new Superhero("The Flash", "speed");
	Superhero three = new Superhero("Wonder Woman", "lasso");
	System.out.println(one);
	System.out.println(two);
	System.out.println(three);
	
}
}