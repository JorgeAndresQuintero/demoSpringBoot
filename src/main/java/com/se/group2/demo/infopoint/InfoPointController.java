package com.se.group2.demo.infopoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*Marks this class as REST controller. Similar to Controller, this means the class defines methods that are called upon
HTTP requests. But, unlike @Controller, the returns are built into the payload of the request. Practically, this means that
even returning "index" would not load the index.html file, but simply send a response that contains the file.
 */
@RestController
/* Tag that specifies which HTTP request should be served to the class. So calling "localhost:8080/" does nothing to this class
but "localhost:8080/infoPoint" does.
*/
@RequestMapping("/infoPoint")
public class InfoPointController {

    private final InfoPointService infoPointService;

    /*
    @Autowired automatically sets up the dependency injection for this class.
    That means, Spring handles the injection of the object infoPointService into an instance of InfoPointController.
    */
    @Autowired
    public InfoPointController(InfoPointService infoPointService) {
        this.infoPointService = infoPointService; //Instead of this.infoPointService = new infoPointService, Spring injects an instance by calling the constructor.
    }

    //Marks this method as a the answer for a HTTP POST request.
    @PostMapping
    public void saveInfoPoint(@RequestBody InfoPoint infoPoint) {
        infoPointService.insertInfoPoint(infoPoint);
    }

    //Marks this method as a the answer for a HTTP GET request.
    @GetMapping
    public List<InfoPoint> getInfoPoints(@RequestParam("name") String name){
        return infoPointService.getInfoPoints(name);
    }

}
