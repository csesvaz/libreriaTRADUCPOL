package traducpolPruebaLibreria;

import java.util.List;

public interface Empresable {

	String getNombre();

	void setNombre(String nombre);

	String getDireccion();

	void setDireccion(String direccion);

	String getTelefono();

	void setTelefono(String telefono);

	String getCif();

	void setCif(String cif);

	List<Servicio> getServicio();

	void setServicio(List<Servicio> servicios);

	String getEmail();

	void setEmail(String email);

}
