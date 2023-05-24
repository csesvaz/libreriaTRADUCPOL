package traducpolPruebaLibreria;

import java.util.List;

import traducpolPruebaLibreria.Servicio.Tipo;

public interface Serviciable {

	String getIdioma();
	void setIdioma(String idioma);
	Tipo getTipo();
	
	Empresable getEmpresa();

}
