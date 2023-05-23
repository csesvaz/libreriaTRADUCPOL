package traducpolPruebaLibreria;

import java.util.List;

public class Empresa implements Empresable {

	private String nombre;
	private String direccion;
	private String email;
	private String telefono;
	private String cif;
	private List<Servicio> servicios;

	@Override
	public String getNombre() {
		return nombre;
	}
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	@Override
	public String getDireccion() {
		return direccion;
	}
	@Override
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String getEmail() {
		return email;
	}
	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getTelefono() {
		return telefono;
	}
	@Override
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String getCif() {
		return cif;
	}
	@Override
	public void setCif(String cif) {
		this.cif = cif;
	}

	@Override
	public List<Servicio> getServicio() {
		return servicios;
	}
	@Override
	public void setServicio(List<Servicio> servicios) {
		this.servicios = servicios;
	}

}
