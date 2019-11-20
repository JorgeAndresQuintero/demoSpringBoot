package com.se.group2.demo.databasemockup;

import com.se.group2.demo.infopoint.InfoPoint;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository //Like @Server, @Repository is an extension of @Component with added semantics.
public class InfoPointDB {

    private static List<InfoPoint> infoPointList = new ArrayList<>();

    public void saveInfoPoint(InfoPoint infoPoint){
        infoPointList.add(infoPoint);
    }

    public List<InfoPoint> getInfoPoints(String name){
        return infoPointList.stream().filter(infoPoint -> infoPoint.getUser().getName().equals(name)).
                collect(Collectors.toList());

    }
}
