package traducpolPruebaLibreria;

public class ServicioTraduccion extends Servicio {
	private String tipoDocumento;
	private String plazoEntrega;
	private boolean traductorJurado;
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getPlazoEntrega() {
		return plazoEntrega;
	}
	public void setPlazoEntrega(String plazoEntrega) {
		this.plazoEntrega = plazoEntrega;
	}
	public boolean isTraductorJurado() {
		return traductorJurado;
	}
	public void setTraductorJurado(boolean traductorJurado) {
		this.traductorJurado = traductorJurado;
	}
	@Override
	public Tipo getTipo() {
		return Tipo.TRADUCCION;
	}
	
}
