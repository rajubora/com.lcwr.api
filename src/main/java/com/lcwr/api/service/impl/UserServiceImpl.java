package com.lcwr.api.service.impl;

import com.lcwr.api.model.PostOfficeDetails;
import com.lcwr.api.model.PostOfficeResponse;
import com.lcwr.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public PostOfficeResponse FetchPostOfficeDetailsByCity(String cityValue) {
      String url="https://api.postalpincode.in/postoffice/{city}";
       url=url.replace("{city}",cityValue);

      ResponseEntity<PostOfficeResponse[]> response= restTemplate.getForEntity(url,PostOfficeResponse[].class);

       PostOfficeResponse[] postOfficeResponses=response.getBody();


       for(PostOfficeResponse responseBean: postOfficeResponses  )
       {

           List<PostOfficeDetails> postOffice=responseBean.getPostOffice();
           for (PostOfficeDetails pob: postOffice)

           {
             System.out.println(pob.getName()+ " "+ pob.getCountry()+" "+ pob.getPinCode());


           }
       }




        return postOfficeResponses[0];

    }

}
