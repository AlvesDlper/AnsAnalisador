package com.ansanalyzer.resources;

import com.amazonaws.auth.AWSCredentialsProviderChain;
import com.amazonaws.auth.EnvironmentVariableCredentialsProvider;
import com.amazonaws.auth.SystemPropertiesCredentialsProvider;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;

public class AWSCredentialsCon {

	public static AWSCredentialsProviderChain getCredentials() { 
		
		AWSCredentialsProviderChain DefaultAWSCredentialsProviderChain = new AWSCredentialsProviderChain(
     		new SystemPropertiesCredentialsProvider(),
	        new EnvironmentVariableCredentialsProvider(),
            new ProfileCredentialsProvider()
     );
		return DefaultAWSCredentialsProviderChain;
     }
}
