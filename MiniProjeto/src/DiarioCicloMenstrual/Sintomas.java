package DiarioCicloMenstrual;

public class Sintomas {
		//Atributos
	private String nomeSintoma;
	private String descricaoSintoma;
	private String dataSintoma;
	

		//Metodos Especiais
	
	public String getNomeSintoma() {
		return nomeSintoma;
	}

	public void setNomeSintoma(String nomeSintoma) {
		this.nomeSintoma = nomeSintoma;
	}

	public String getDescricaoSintoma() {
		return descricaoSintoma;
	}

	public void setDescricaoSintoma(String descricaoSintoma) {
		this.descricaoSintoma = descricaoSintoma;
	}

	public String getDataSintoma() {
		return dataSintoma;
	}

	public void setDataSintoma(String dataSintoma) {
		this.dataSintoma = dataSintoma;
	}

	public void criarSintoma() {
		System.out.println("Adicionar sintoma: " +getNomeSintoma());
	}
	
	public void lerSintoma() {
		
	}
	public void alterarSintoma() {
	
	}
	public void deletarSintoma() {
	
	}
	public void buscarSintomaData() {
	
	}
	public void listarSintomaData() {
	
	}
	@Override
	public String toString() {
		return "-------------------------------------------------\nNome do sintoma: " + getNomeSintoma() + "\nDescricao do Sintoma: " 
	+ getDescricaoSintoma() + "\nDataSintoma: " + getDataSintoma() + "\n-------------------------------------------------";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
