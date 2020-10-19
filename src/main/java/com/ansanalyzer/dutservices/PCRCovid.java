package com.ansanalyzer.dutservices;

import java.util.ArrayList;
import java.util.List;

public class PCRCovid {

	public static void CoverageCheck(List <String> sintoms, int age) {
		
		final List<String> teste=new ArrayList<>();
		int score=0;
		if (sintoms.isEmpty()) {
			
			System.out.println("O segurado não preenche os critérios "
					+ "da diretriz de utilização da ANS.");
		}
		else if (age<=12) {
			
			for (String sint : sintoms) {
				
				if (teste.contains(sint)) {
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
		}
		else if (age>=65) {
			
			for (String sint : sintoms) {
				
				if (teste.contains(sint)) {
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
