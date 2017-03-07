package ChemSim.data;

public enum Elements {
	Hydrogen("H", 1, 0, "Hydrogen"), Helium("He", 2, 2, "Helium"), Lithium("Li", 3, 4, "Lithium"), Berylium("Be", 4, 5,
			"Berylium"), Boron("B", 5, 6, "Boron"), Carbon("C", 6, 6, "Carbon"), Nitrogen("N", 7, 7, "Nitogen"), Oxygen(
					"O", 8, 8, "Oxygen"), Flourine("F", 9, 9, "Flourine"), Neon("Ne", 10, 10, "Neon");

	private int protons, neutrons, electrons;
	private String symbol, name;

	Elements(String symbol, int atomicNumber, int neutrons, String name) {
		protons = atomicNumber;
		electrons = protons;
		this.neutrons = neutrons;
		this.name = name;
		this.symbol = symbol;
	}

	public static Elements getFromSymbol(String symbol) {
		Elements r;
		r = null;
		for (Elements s : Elements.values()) {
			if (s.symbol == symbol) {
				r = s;
				break;
			}
		}

		return r;

	}
	
	public int getProtons(){
		return protons;
		
	}
	
	public int getNeutrons(){
		return neutrons;
	}
	
	
}
