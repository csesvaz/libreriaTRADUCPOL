package traducpolPruebaLibreria;


public interface ServicioInterpretable {
	String getHorarioInicioServicio();
	void setHorarioInicioServicio(String horarioInicioServicio);
	String getHorarioFinServicio();
	void setHorarioFinServicio(String horarioFinServicio);
	String getProvincia();
	void setProvincia(String provincia);
	boolean isServicioOnline();
	void setServicioOnline(boolean servicioOnline);
}
