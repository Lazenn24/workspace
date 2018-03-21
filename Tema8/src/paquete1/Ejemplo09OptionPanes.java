package paquete1;

import javax.swing.JOptionPane;

public class Ejemplo09OptionPanes {

	public static void main(String[] args) {

		// JOptionPane.showMessageDialog(null, "Se ha borrado el historial.");

		// JOptionPane.showMessageDialog(null, "No se ha podido conectar a la base de
		// datos", "Error", JOptionPane.ERROR_MESSAGE);

		// JOptionPane.showConfirmDialog(null, "¿Guardar cambios en el archivo?");

		int opcion = JOptionPane.showConfirmDialog(null,
				"¿Está de seguro de querer eliminar todos los archivos en el disco?", "Formatear disco",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

		if (opcion == JOptionPane.YES_OPTION) {
			// System.out.println("¿Estas seguro?");
			JOptionPane.showConfirmDialog(null, "¿Estas seguro?", "Borrar datos", JOptionPane.YES_NO_OPTION,
					JOptionPane.WARNING_MESSAGE);
		} else if (opcion == JOptionPane.NO_OPTION) {
			System.out.println("Menos mal...");
			JOptionPane.showMessageDialog(null, "Menos mal", "Borrar datos", JOptionPane.INFORMATION_MESSAGE);
		} else {
			System.out.println("EIN???");
			JOptionPane.showMessageDialog(null, "¿EIN??", "Borrar datos", JOptionPane.QUESTION_MESSAGE);
		}
	}

}
