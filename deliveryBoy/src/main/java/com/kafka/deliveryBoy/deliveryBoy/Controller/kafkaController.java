package com.kafka.deliveryBoy.deliveryBoy.Controller;

import com.kafka.deliveryBoy.deliveryBoy.Service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class kafkaController {
    @Autowired
    private KafkaService kafkaService;
    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){
        for(int i = 0;i<100000;i++) {
            this.kafkaService.updateLocation("(" + Math.round(Math.random() * 100) + ")" + "," + "(" + Math.round(Math.random() * 100) + ")");
        }
        return new ResponseEntity<>(Map.of("message","Location Updated"), HttpStatus.OK);
    }
}
