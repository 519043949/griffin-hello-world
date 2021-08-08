package com.example.helloworld;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RMM")
public class HelloWorld {

	@RequestMapping(value = "/employee")
	public ResponseEntity<Object> getHello() throws IOException {

		/*
		 * AWSCredentials awsCredentials = new
		 * BasicAWSCredentials("AKIAXV5YPSGWSHVOLEHI",
		 * 
		 * "PSisxXxOK9tdCgSpvA34Hn0ae3Q3nRzG/ey0Vi3Z");
		 * 
		 * EndpointConfiguration endpointConfiguration = new
		 * EndpointConfiguration(Constant.AWSEndPoint.KINESIS,
		 * Constant.SINGAPORE_REGION);
		 * 
		 * AmazonKinesis kinesisclient = AmazonKinesisClientBuilder.standard() //
		 * .withClientConfiguration(clientConfiguration)
		 * .withEndpointConfiguration(endpointConfiguration) .withCredentials(new
		 * AWSStaticCredentialsProvider(awsCredentials)).build();
		 * 
		 * // .withCredentials(new
		 * AWSStaticCredentialsProvider(awsCredentials)).build();
		 * 
		 * Date date = new Date(); Long timeMilli = date.getTime(); String leadid =
		 * timeMilli.toString();
		 * System.out.println(kinesisclient.listStreams().toString());
		 * List<PutRecordsRequestEntry> entries = new ArrayList<>();
		 * 
		 * LeadAndEnquries leadAndEnquries = new LeadAndEnquries();
		 * leadAndEnquries.setOwnerId("thunderbird");
		 * leadAndEnquries.setDueDate("2020-01-01");
		 * leadAndEnquries.setLeadStatus("Open");
		 * leadAndEnquries.setLeadandenquriesId(leadid); PutRecordsRequestEntry entry =
		 * new PutRecordsRequestEntry();
		 * 
		 * 
		 * ByteArrayOutputStream bos = new ByteArrayOutputStream(); ObjectOutputStream
		 * oos = new ObjectOutputStream(bos); oos.writeObject(leadAndEnquries);
		 * oos.flush(); byte[] data = bos.toByteArray();
		 * 
		 * Gson gson = new GsonBuilder().setPrettyPrinting().create();
		 * entry.setData(ByteBuffer.wrap(gson.toJson(leadAndEnquries).getBytes()));
		 * entry.setPartitionKey(leadid); entries.add(entry);
		 * 
		 * PutRecordsRequest createRecordsRequest = new PutRecordsRequest();
		 * createRecordsRequest.setStreamName("griffinKinesisDataStream");
		 * createRecordsRequest.setRecords(entries);
		 * 
		 * kinesisclient.putRecords(createRecordsRequest);
		 */

		return new ResponseEntity<>("Welcome to Griffin", HttpStatus.OK);
	}

}
