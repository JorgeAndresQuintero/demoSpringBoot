package com.se.group2.demo.infopoint;



import com.se.group2.demo.databasemockup.InfoPointDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/*Like @Component marks this class as a bean. @Service is functionally the same, but with the added (purely for documentation)
semantics that this class is used as a service. At least that's how I understood it.
 */
@Service
public class InfoPointService {

    private InfoPointDB infoPointDB;

    @Autowired
    public InfoPointService(InfoPointDB infoPointDB) {
        this.infoPointDB = infoPointDB;
    }

    public void insertInfoPoint(InfoPoint infoPoint){
        infoPointDB.saveInfoPoint(infoPoint);
    }

    public List<InfoPoint> getInfoPoints(String name){
        return infoPointDB.getInfoPoints(name);
    }
}
