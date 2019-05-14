package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2018-9-11.
 */
@RestController
public class LoadBalanceController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/client/hello", method = RequestMethod.GET)
    public String clientHello(){
        return restTemplate.getForEntity("http://eureka-client/hello", String.class).getBody();
    }

    @RequestMapping(value = "/client/hello1", method = RequestMethod.GET)
    public String client1Hello(){
        return restTemplate.getForEntity("http://EUREKA-CLIENT-ORDER/hello", String.class).getBody();
    }
}
