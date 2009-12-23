package ar.com.agromayor.DB.codigoDescripciones;

import java.util.HashMap;
import java.util.Map;

public abstract class CodigoTipoDeResponsable {
	private static Map<String, String> responsable = null;

	public static String getDescipcion(String codigo){
		inicialize();

		return responsable.get(codigo);		
	}
	
	private static void inicialize() {
		if (responsable == null) {
			responsable = new HashMap<String, String>();

			responsable.put("01", "IVA Responsable Inscripto");
			responsable.put("02", "IVA Responsable no Inscripto");
			responsable.put("03", "IVA no Responsable");
			responsable.put("04", "IVA Sujeto Exento");
			responsable.put("05", "Consumidor Final");
			responsable.put("06", "Responsable Monotributo");
			responsable.put("07", "Sujeto no Categorizado");
			responsable.put("08", "Proveedor del Exterior");
			responsable.put("09", "Cliente del Exterior");
			responsable.put("10", "IVA Liberado � Ley N� 19.640");
			responsable.put("11", "IVA Responsable Inscripto � Agente de Percepci�n");
			responsable.put("12", "Peque�o Contribuyente Eventual");
			responsable.put("13", "Monotributista Social");
			responsable.put("14", "Peque�o Contribuyente Eventual Social");

		}

	}

}
