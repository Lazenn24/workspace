package conversion;

public class Conversor {

	private final static double KM_A_MILLAS = 0.62137;
	private final static double MB_A_ATM = 0.000986923299833;
	private final static double CAL_A_JULIOS = 4.184;

	public Conversor() {

	}

	public static double millas(double km) {
		return KM_A_MILLAS * km;
	}

	public static double km(double millas) {
		return millas / KM_A_MILLAS;
	}

	public static double atmosferas(double milibares) {
		return MB_A_ATM * milibares;
	}

	public static double milibares(double atmosferas) {
		return atmosferas / MB_A_ATM;
	}

	public static double julios(double calorias) {
		return CAL_A_JULIOS * calorias;
	}

	public static double calorias(double julios) {
		return julios / CAL_A_JULIOS;
	}

}
