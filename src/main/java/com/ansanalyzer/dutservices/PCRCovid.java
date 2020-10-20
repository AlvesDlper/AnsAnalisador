package com.ansanalyzer.dutservices;


import java.util.List;

public class PCRCovid {

		private final List<String> criteriosMS = 
				List.of("AAA","BBB","CCC","DDD");
		private final List<String >criteriosMSPed = List.of("AAS","ABB");
		
		
	
	public void CoverageCheck(List <String> sintoms, int age) {
		
		//final List<String> criteriosMS=new ArrayList<>();
		int score=0;
		if (sintoms.isEmpty()) {
			
			System.out.println("O segurado não preenche os critérios "
					+ "da diretriz de utilização da ANS.");
		}
		else if (age<=12) {
			
			for (String sint : sintoms) {
				
				if (criteriosMS.contains(sint)) {
					score+=1;
				
				}
			}
			if (score >=2) {
				System.out.println("O Exame deve ser autorizado. O segurado preenche"
						+ "os critérios da Diretrizde Utilização da ANS");
			}
			else
				System.out.println("O segurado não preenche os critérios "
						+ "da diretriz de utilização da ANS.");
		}
		else if (age>=65) {
			
			for (String sint : sintoms) {
				
				if (criteriosMS.contains(sint)) {
					score+=1;
				}
			}
			if (score >=2) {
				System.out.println("Exame autorizado. O segurado preenche"
						+ "os critérios da Diretrizde Utilização da ANS");
			}
			else
				System.out.println("O segurado não preenche os critérios "
						+ "da diretriz de utilização da ANS.");
			
		} else
			System.out.println("Terminar");
		
	}

}
