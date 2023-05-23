package traducpolPruebaLibreria;


public interface ServicioTraduccible {
	String getTipoDocumento();
	void setTipoDocumento(String tipoDocumento);
	String getPlazoEntrega();
	void setPlazoEntrega(String plazoEntrega);
	boolean isTraductorJurado();
	void setTraductorJurado(boolean traductorJurado);
}
