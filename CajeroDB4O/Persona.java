package CajeroDB4O;

public class Persona {

	private String nombrePersona;
	private String apellidoPPersona;
	private String apellidoMPersona;
	private String Fechadenaci;
	private String sexo;
	private String Domicilio;
    private String clavedeelector;
	private String curp;
	private int Anioderegistro;
    private int Estado;
    private int Localidad;
    private int Municipio;
    private int Emision;
    private int Seccion;
    private int Vigencia;
    
    
	
      

	public String getNombrePersona() {
		return nombrePersona;
	}





	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}





	public String getApellidoPPersona() {
		return apellidoPPersona;
	}





	public void setApellidoPPersona(String apellidoPPersona) {
		this.apellidoPPersona = apellidoPPersona;
	}





	public String getApellidoMPersona() {
		return apellidoMPersona;
	}





	public void setApellidoMPersona(String apellidoMPersona) {
		this.apellidoMPersona = apellidoMPersona;
	}





	public String getFechadenaci() {
		return Fechadenaci;
	}





	public void setFechadenaci(String fechadenaci) {
		Fechadenaci = fechadenaci;
	}





	public String getSexo() {
		return sexo;
	}





	public void setSexo(String sexo) {
		this.sexo = sexo;
	}





	public String getDomicilio() {
		return Domicilio;
	}





	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}





	public String getClavedeelector() {
		return clavedeelector;
	}





	public void setClavedeelector(String clavedeelector) {
		this.clavedeelector = clavedeelector;
	}





	public String getCurp() {
		return curp;
	}





	public void setCurp(String curp) {
		this.curp = curp;
	}





	public int getAnioderegistro() {
		return Anioderegistro;
	}





	public void setAnioderegistro(int anioderegistro) {
		Anioderegistro = anioderegistro;
	}





	public int getEstado() {
		return Estado;
	}





	public void setEstado(int estado) {
		Estado = estado;
	}





	public int getLocalidad() {
		return Localidad;
	}





	public void setLocalidad(int localidad) {
		Localidad = localidad;
	}





	public int getMunicipio() {
		return Municipio;
	}





	public void setMunicipio(int municipio) {
		Municipio = municipio;
	}





	public int getEmision() {
		return Emision;
	}





	public void setEmision(int emision) {
		Emision = emision;
	}





	public int getSeccion() {
		return Seccion;
	}





	public void setSeccion(int seccion) {
		Seccion = seccion;
	}





	public int getVigencia() {
		return Vigencia;
	}





	public void setVigencia(int vigencia) {
		Vigencia = vigencia;
	}





	public String toString() {
		return "Usuario de INE: "+ nombrePersona + " " +  apellidoPPersona + " " + apellidoMPersona
				+ " \n Fecha de nacimiento: " + Fechadenaci + " \n Sexo: " + sexo + " \n Domicilio: " + Domicilio
				+"  \n Clave de elector: " + clavedeelector +" \n Curp: " + curp + ", \n Año de registro: " + Anioderegistro 
				+", Estado: " + Estado + ", Municipio: " + Municipio +", Sección " + Seccion 
				+ ",Localidad: " + Localidad + ", Emisión: " + Emision +", Vigencia: " + Vigencia + " ";

    }
}
