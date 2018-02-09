package instituto;

import auxiliar.*;

public class Instituto {

	private final int MAX_ALUMNOS = 1000;

	Alumno[] alumnos = new Alumno[MAX_ALUMNOS];

	// public Instituto(){
	// alumnos = new Alumno[MAX_ALUMNOS];
	// }

	public void addAlumno(Alumno alu) {

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alu;
				break;
			}

		}

	}

	public void delAlumno(int numExp) {
		
//		int pos = buscaAlumno(numExp);  //Forma mas corta usando otro método.
//		
//		if(pos != -1){
//			alumnos[pos] = null;
//		}

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumExpediente() == numExp){
				
			alumnos[i] = null;
			break;
			}
		}

	}

	public void muestraAlumnos() {

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				System.out.println(alumnos[i].toString()); // No es necesario el
															// .toString(), ya
															// esta incluido en
															// el array alumno.
			}

		}

	}

	public int numAlumnos() {

		int aluMatriculados = 0;

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				aluMatriculados++;
			}

		}
		
		return aluMatriculados;

	}

	public int buscaAlumno(int numExp) {

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumExpediente() == numExp) {
				return i;

			}

		}

		return -1;
	}

}
