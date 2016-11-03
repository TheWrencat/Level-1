
public class Athlete {
	
	String name;
	int speed;
	int bibNumber;
	static String location = "San Fransisco";
	static int numRunners;
	
	Athlete(String name, int speed){
		this.name=name;
		this.speed=speed;
		numRunners++;
		bibNumber = numRunners;
	};
	public String toString(){
		String a = "Athlete: "+name+" Speed: "+speed+" Number: "+bibNumber+" Location: "+ location;
		return a;
		}
public static void main(String[] args) {
	
		Athlete Wilson = new Athlete("Wilson", 10);
		Athlete Jeff = new Athlete("Jeff", 15);
		Athlete Willow = new Athlete("Willow", 17);
		
		System.out.println(Wilson);
		System.out.println(Jeff);
		System.out.println(Willow);
		Jeff.speed = 9;
		Jeff.location = "San Diego";
		System.out.println(Jeff);
		System.out.println(Willow);
		
}	
	
}
