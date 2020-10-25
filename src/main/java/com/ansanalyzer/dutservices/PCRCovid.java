package com.ansanalyzer.dutservices;


import java.util.List;

public class PCRCovid {

		private final List<String> criteriosMS = 
				List.of("febre","calafrios","dor de garganta","dor de cabeça",
						 "tosse","coriza","perda de olfato", "perda de paladar");
		private final List<String >criteriosMSPed = 
				List.of("febre","calafrios","dor de garganta","dor de cabeça",
				"tosse","coriza","perda de olfato", "perda de paladar","obstrução nasal");
		private final List<String >criteriosMSIdoso = 
				List.of("febre","calafrios","dor de garganta","dor de cabeça",
				"tosse","coriza","perda de olfato", "perda de paladar","sincope","confusão mental"
						+ "sonolência", "falta de apetite", "irritabilidade");
		
		
		
	
	public void CoverageCheck(List <String> sintoms, int age) {
		
		//final List<String> criteriosMS=new ArrayList<>();
		int score=0;
		String aux = "";
		
		if (sintoms.isEmpty()) {
			
			System.out.println("O segurado não preenche os critérios "
					+ "da diretriz de utilização da ANS.");
		}
		else if (age<=12) {
			
			for (String sint : sintoms) {
				
				if (criteriosMSPed.contains(sint.toLowerCase())) {
					score+=1;
					aux+= sint+" - ";
				}
			}
			if (score >=2) {
				System.out.println("O Exame deve ser autorizado.\nO segurado preenche"
						+ "os critérios da Diretriz de Utilização da ANS.\nConforme "
						+ "Relatório médico, o paciente tem "+age+" anos e apresenta: "+aux);
				
			}
			else
				System.out.println("O segurado não preenche os critérios "
						+ "da diretriz de utilização da ANS.");
		}
		else if (age>=65) {
			
			for (String sint : sintoms) {
				
				if (criteriosMSIdoso.contains(sint.toLowerCase())) {
					score+=1;
					aux+= sint+" - ";
				}
			}
			if (score >=2) {
				System.out.println("O Exame deve ser autorizado.\nO segurado preenche"
						+ "os critérios da Diretriz de Utilização da ANS.\nConforme "
						+ "Relatório médico, o paciente tem "+age+" anos e apresenta: "+aux);
			}
			else
				System.out.println("O segurado não preenche os critérios "
						+ "da diretriz de utilização da ANS.");
			
		} else
					
		for (String sint : sintoms) {
			
			if (criteriosMS.contains(sint.toLowerCase())) {
				score+=1;
				aux+= sint+" - ";
			
			}
		}
		if (score >=2) {
			System.out.println("O Exame deve ser autorizado.\nO segurado preenche"
					+ "os critérios da Diretriz de Utilização da ANS.\nConforme "
					+ "Relatório médico, o paciente tem "+age+" anos e apresenta: "+aux);
		}
		else
			System.out.println("O segurado não preenche os critérios "
					+ "da diretriz de utilização da ANS.");
	}

}
