package javaLabStrams;

public class Cities {

	
	private String Code;
	private String Name;
	private int Population;
	
	

	public Cities(String code, String name, String population) {
		super();
		Code = code;
		Name = name;
		Population = Integer.parseInt(population);
	}

	public String getCode() {
		return Code;
	}

	public String getName() {
		return Name;
	}

	public int getPopulation() {
		return Population;
	}

	@Override
	public String toString() {
		return "Cities [Code=" + Code + ", Name=" + Name + ", Population=" + Population + "]";
	}

	

	

}
