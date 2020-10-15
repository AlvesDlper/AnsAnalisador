package com.amazonaws.analisador;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.amazonaws.auth.AWSCredentialsProviderChain;
//import com.amazonaws.utils.SentenceSegmenter;
import com.ansanalyzer.resources.AWSCredentialsCon;
import com.ansanalyzer.resources.DocTranslater;
import com.ansanalyzer.resources.MedicalTextAnalyzer;
import com.ansanalyzer.utils.DocumentReader;

public class Program {

	public static void main(String[] args) throws IOException {
		
		AWSCredentialsProviderChain con = AWSCredentialsCon.getCredentials();
		
		File file = new File("C:\\Users\\Dell Optiplex 790 DT\\Desktop\\Docs testes\\RM TESTE.pdf");
		
		//String teste = "MEDICAL REPORT Patient with cough, fever, precordial pain and tiredness. He had contact with a confirmed case of COVID 19. Request PCR test.";
	
		List<String> litt = DocumentReader.txtSentences(file);
		litt=DocTranslater.doTraduction(litt,"pt",con);
	 
		
	
		MedicalTextAnalyzer rm = new MedicalTextAnalyzer();
		List<String> sintomas = rm.MConditionExtract(litt.toString(), con);
		sintomas=DocTranslater.doTraduction(sintomas, "en", "pt", con);
		
		
		for (String list : sintomas) {
			
			System.out.println(list);
		}
		
	}}


