package com.dronezoid.ls.controller;

import com.dronezoid.ls.model.request.DroneDetails;
import com.dronezoid.ls.model.request.DroneRulesetDetails;
import com.dronezoid.ls.model.response.DroneDetailsResponse;
import com.dronezoid.ls.model.response.DroneRulesetDetailsResponse;
import com.dronezoid.ls.service.DroneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/drone/api")
public class DroneController {

    @Autowired
    private DroneService droneService;

    @PostMapping("/createDrone")
    public ResponseEntity<DroneDetailsResponse> createDrone(DroneDetails droneDetails) {
        return new ResponseEntity<>(droneService.createDrone(droneDetails), HttpStatus.OK);
    }

    @PostMapping("/createDroneRuleset")
    public ResponseEntity<DroneRulesetDetailsResponse> createDroneRuleset(DroneRulesetDetails droneRulesetDetails) {
        return new ResponseEntity<>(droneService.createDroneRuleset(droneRulesetDetails), HttpStatus.OK);
    }

}
