package it.discovery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Controller
@RequestMapping(path = "/date-time")
public class CurrentDateAndTime {

    @ResponseBody
    @RequestMapping(path = "/date")
    public String getDate(){
//        LocalDateTime dateTime = LocalDateTime.now();
//        return dateTime.getDayOfMonth() +"/"+
//                dateTime.getMonth() +"/"+
//                dateTime.getYear();

        return LocalDate.now().toString();
    }

    @ResponseBody
    @RequestMapping(path = "time")
    public String getTime(){
        return LocalTime.now().toString();
    }

    @ResponseBody
    @RequestMapping(path = "current-time")
    public String getCurrentTime(){
        LocalDateTime dateTime = LocalDateTime.now();
        return dateTime.getHour() +":"+
                dateTime.getMinute() +":"+
                dateTime.getSecond();

    }
}
