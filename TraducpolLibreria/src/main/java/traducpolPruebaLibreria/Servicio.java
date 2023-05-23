package traducpolPruebaLibreria;

public abstract class Servicio implements Serviciable {
	public static enum Tipo {
		TRADUCCION, INTERPRETACION
	}
	
	private String idioma;
	
	
	@Override
	public String getIdioma() {
		return idioma;
	}
	@Override
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	@Override
	public Tipo getTipo() {
		return null;
	}
	
	@Override
	public String toString() {
		return "Servicio [idioma=" + idioma + "]";
	}
	
}
