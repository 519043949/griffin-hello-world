package com.example.helloworld;

public class Constant {
	public static final int STS_TIMEOUT = 3600;
	public static final String SINGAPORE_REGION = "ap-southeast-1";

	// TODO move these to PCF CRED

	public static final String ENAAS_ENDPOINT = "http://enaas-endpoint";
	public static final String PROXY = "bcproxy2.sgp.dbs.com";
	public static final int PROXY_PORT = 8080;
	// END OF CRED

	public static class AWSEndPoint {
		public static final String STS = "https://sts.ap-southeast-1.amazonaws.com";
		public static final String KMS = "https://kms.ap-southeast-1.amazonaws.com";
		public static final String DYNAMODB = "https://dynamodb.ap-southeast-1.amazonaws.com";
		public static final String SES = "https://email.ap-southeast-1.amazonaws.com";
		public static final String KINESIS = "https://kinesis.ap-southeast-1.amazonaws.com";
	}

}