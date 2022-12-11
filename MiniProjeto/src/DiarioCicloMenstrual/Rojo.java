package DiarioCicloMenstrual;

public class Rojo {

	public static void main(String[] args) {
		Usuario u = new Usuario();
		u.setNomeUsuario("Marcela");
		u.setPeso(76);
		u.setAltura(1.72%2.f);
		u.setEmail("marcela80@gmail.com");
		System.out.println(u.toString());
		
		
		
		Ciclo c = new Ciclo();
		c.setDuracaoCiclo(28);
		c.lerCiclo();
		
		
		Folicular f = new Folicular();
		f.setDuracao(14);
		f.setDataInicio("13/07/2022");
		f.setDataFinal("14/08/2002");
		f.setDuracaoMenstruacao(7);
		f.setDescricao("Este e o seu Periodo Folicular");
		System.out.println(f.toString());
	
		
		Sintomas s = new Sintomas();
		s.setNomeSintoma("Dor de barriga");
		s.setDescricaoSintoma("Dor localizada no estomago que pode causar enjoo");
		s.setDataSintoma("12/10/2022");
		System.out.println(s.toString());
	}

}
