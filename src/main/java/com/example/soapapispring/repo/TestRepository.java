package com.example.soapapispring.repo;

import https.www_google_com.apis.ads.publisher.v202205.GetAdUnitsByStatementResponse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.LinkedHashMap;

@Component
public interface TestRepository {
    LinkedHashMap<String, GetAdUnitsByStatementResponse> map = new LinkedHashMap<String,GetAdUnitsByStatementResponse>();

//    @PostConstruct
//    public initData(){
//
//    }
}
