package DiarioCicloMenstrual;

public class Folicular extends Periodo{
		//Atributos
	private int duracaoMenstruacao;
	private String inicioMenstruacao;
	
	public Folicular() {
		super();
	}
	
		//Metodo Construtor
	public Folicular(int du, String dtIn, String dtFn, String desc) {
		
		this.setDuracao(du); 
		this.setDataInicio(dtIn);
		this.setDataFinal(dtFn);
		this.setDescricao(desc);
	}
	
	
	
		//Metodo toString
	@Override
	public String toString() {
		return "-------------------------------------------------\nDuracao: " + getDuracao() + "\nData de Inicio: " + getDataInicio() + "\nData Final: "
				+ getDataFinal() + "\nDuracao da Menstruacao: " + getDuracaoMenstruacao() + " dias" + "\nDescricao: " + getDescricao();
	}

	
	//Metodos Especiais
	public int getDuracaoMenstruacao() {
		return duracaoMenstruacao;
	}
	public void setDuracaoMenstruacao(int duracaoMenstruacao) {
		this.duracaoMenstruacao = duracaoMenstruacao;
	}
	public String getInicioMenstruacao() {
		return inicioMenstruacao;
	}
	public void setInicioMenstruacao(String inicioMenstruacao) {
		this.inicioMenstruacao = inicioMenstruacao;
	}
	
	
		//Metodos Publicos
	public void calculaMenstruacao() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
