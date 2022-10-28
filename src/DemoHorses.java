
public class DemoHorses {

	public static void main(String[] args) {
		Horse horse1 = new Horse();
		RaceHorse horse2 = new RaceHorse();
		
		horse1.setName("Billy");
		horse1.setColor("Pink");
		horse1.setBirthyear(1874);
		
		horse2.setName("Athletic Billy");
		horse2.setColor("Also Pink");
		horse2.setBirthyear(1874);
		horse2.setRaces(500);
		
		System.out.println("Name: " + horse1.getName() + "\nColor: " + horse1.getColor() + "\nBirthyear: " + horse1.getBirthyear() + "\n");
		System.out.println("Name: " + horse2.getName() + "\nColor: " + horse2.getColor() + "\nBirthyear: " + horse2.getBirthyear() + 
						   "\n# of races: " + horse2.getRaces());
	}

}
