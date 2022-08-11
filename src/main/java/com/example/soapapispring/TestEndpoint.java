package com.example.soapapispring;

import com.example.soapapispring.repo.TestRepository;
import https.www_google_com.apis.ads.publisher.v202205.GetAdUnitsByStatementResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@RequiredArgsConstructor
public class TestEndpoint {

    public static final String REQUEST_URI = "https://www.google.com/apis/ads/publisher/v202205";

//    private final TestRepository testRepository;

    @PayloadRoot(namespace = REQUEST_URI, localPart = "GetAdUnitsByStatementResponse")
    @ResponsePayload
    public void getTest(@RequestPayload GetAdUnitsByStatementResponse test) {
        GetAdUnitsByStatementResponse test1 = new GetAdUnitsByStatementResponse();

//        GetAdUnitsByStatementResponse.Rval rval = new GetAdUnitsByStatementResponse.Rval();
//        rval.setTotalResultSetSize((byte) 1);
//        rval.setStartIndex((byte) 0);
//        Result
//        rval.setResults();
//        test1.setRval(rval);

        GetAdUnitsByStatementResponse.Rval rval = test.getRval();
        GetAdUnitsByStatementResponse.Rval.Results results = rval.getResults();
        System.out.println(results.getName());
        System.out.println(results.getDescription());
        System.out.println(rval.getStartIndex());
        System.out.println(rval.getTotalResultSetSize());
    }

}
