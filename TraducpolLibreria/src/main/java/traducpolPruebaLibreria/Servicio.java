package traducpolPruebaLibreria;

public abstract class Servicio {
	public static enum Tipo {
		TRADUCCION, INTERPRETACION
	}
	

	private Long id;
	private String idioma;
	
	private Empresa empresa;
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public Tipo getTipo() {
		return null;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	@Override
	public String toString() {
		return "Servicio [id=" + id + ", idioma=" + idioma + ", empresa=" + empresa + "]";
	}
	
}
