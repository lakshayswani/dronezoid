package com.dronezoid.ls.serviceImpl;

import com.dronezoid.ls.model.request.DroneDetails;
import com.dronezoid.ls.model.request.DroneRulesetDetails;
import com.dronezoid.ls.model.response.DroneDetailsResponse;
import com.dronezoid.ls.model.response.DroneRulesetDetailsResponse;
import com.dronezoid.ls.service.DroneService;
import org.springframework.stereotype.Service;

@Service
public class DroneServiceImpl implements DroneService {

    @Override
    public DroneDetailsResponse createDrone(DroneDetails droneDetails) {
        return null;
    }

    @Override
    public DroneRulesetDetailsResponse createDroneRuleset(DroneRulesetDetails droneRulesetDetails) {
        return null;
    }
}
