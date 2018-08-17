package com.dronezoid.ls.service;

import com.dronezoid.ls.model.request.DroneDetails;
import com.dronezoid.ls.model.request.DroneRulesetDetails;
import com.dronezoid.ls.model.response.DroneDetailsResponse;
import com.dronezoid.ls.model.response.DroneRulesetDetailsResponse;

public interface DroneService {

    public DroneDetailsResponse createDrone(DroneDetails droneDetails);

    public DroneRulesetDetailsResponse createDroneRuleset(DroneRulesetDetails droneRulesetDetails);

}
