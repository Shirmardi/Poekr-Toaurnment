package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyController {

    private static final Logger log = LoggerFactory.getLogger(MyController.class);

    @RequestMapping(value = "/blah", method = {RequestMethod.DELETE, RequestMethod.PUT})
    public ResponseEntity<String> doStuff() {
        return ResponseEntity.ok("todo");
    }

    @GetMapping("/retrieve")
    public ResponseEntity<Setup> getSetup() {
        log.info("called the getSetup method!!!");

        Setup setup = new Setup();
//        setup.setFinalBlindLevel(8);

        return ResponseEntity.ok(setup);
    }

    @PostMapping("/insert")
    public ResponseEntity<Setup> postSetup(final Setup setup) {
        // call a db and save the setup

        if(setup.getBigBlind() > 10) {
            return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).header("aslidufhaspidufg", "poop").build();
        }

        return ResponseEntity.ok(setup);
    }
}
