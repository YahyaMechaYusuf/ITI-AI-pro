package javaLabStrams;

public class Countries {
	private String code;
	private String name;
	
	public Countries(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Countries [code=" + code + ", name=" + name + "]";
	}
	
}
