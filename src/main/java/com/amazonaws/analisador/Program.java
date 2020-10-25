package com.amazonaws.analisador;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.amazonaws.auth.AWSCredentialsProviderChain;
import com.ansanalyzer.dutservices.PCRCovid;
import com.ansanalyzer.entities.MedicalOrder;
import com.ansanalyzer.entities.Patient;
import com.ansanalyzer.resources.AWSCredentialsCon;
import com.ansanalyzer.resources.DocTranslater;
import com.ansanalyzer.resources.MedicalTextAnalyzer;
import com.ansanalyzer.utils.DocumentReader;

public class Program {

	public static void main(String[] args) throws IOException {
		
		AWSCredentialsProviderChain con = AWSCredentialsCon.getCredentials();
		
		Patient paciente = new Patient("Arthur", 26, 'm');
		File file = new File("C:\\Users\\Dell Optiplex 790 DT\\Desktop\\Docs testes\\RM TESTE.pdf");
		
		MedicalOrder medicalOrder = new MedicalOrder(0L, paciente, file);
		//File file = new File("C:\\Users\\Dell Optiplex 790 DT\\Desktop\\Docs testes\\RM TESTE.pdf");
		
		//String teste = "MEDICAL REPORT Patient with cough, fever, precordial pain and tiredness. He had contact with a confirmed case of COVID 19. Request PCR test.";
	
		List<String> litt = DocumentReader.txtSentences(medicalOrder.getFile());
		litt=DocTranslater.doTraduction(litt,"pt",con);
	 
		
	
		MedicalTextAnalyzer rm = new MedicalTextAnalyzer();
		List<String> sintomas = new ArrayList<String>(rm.MConditionExtract(litt.toString(), con));
		sintomas=DocTranslater.doTraduction(sintomas, "en", "pt", con);
		
		
		PCRCovid analisador = new PCRCovid();
					
		analisador.CoverageCheck(sintomas, paciente.getIdade());
		
	}}


