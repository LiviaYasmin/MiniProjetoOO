package DiarioCicloMenstrual;

public class Usuario {
		//Atributos
	private String nomeUsuario;
	private double peso;
	private double altura;
	private String email;
	
	
		//Metodos Especiais
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
		//Metodos Publicos
	public void cadastrarUsuario() {
		
	}
	@Override
	public String toString() {
		return "Nome do Usuario: " + getNomeUsuario() + "\nPeso: " + getPeso() + 
				" kg" + "\nAltura: " + getAltura() + "\nE-mail: " + getEmail() + "\n-------------------------------------------------";
	}
	
	
	
	
}
