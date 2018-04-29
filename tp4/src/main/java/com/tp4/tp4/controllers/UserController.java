package com.tp4.tp4.controllers;


import com.tp4.tp4.Model.User;
import com.tp4.tp4.repository.UserRepository;
import eu.bitwalker.useragentutils.UserAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserRepository userDao;

    @RequestMapping(method = RequestMethod.GET, value = "/user-agent",produces = "text/plain")
    public String getMostrarDatos(@RequestHeader(value ="User-Agent") String request) {

        UserAgent useragent= UserAgent.parseUserAgentString(request);
        User user = new User(useragent.getOperatingSystem().getName(),useragent.getBrowser().getName());
        this.userDao.save(user);
        return user.toString();
    }
//text/plain   application/json
    @RequestMapping(method = RequestMethod.GET, value= "/mostrarSO", produces = "application/json")
    public List<?> getSo(){

        List<?> so = this.userDao.soMostUsed();

        return so;
    }

    @RequestMapping(method = RequestMethod.GET, value= "/mostrarBrowser", produces = "application/json")
    public List<?> getBrowser(){

        //List<User> users =this.userDao.findAll();
        List<?> browser = this.userDao.browserMostUsed();

        return browser;
    }

    @RequestMapping(method = RequestMethod.GET, value= "/mostrarGrupoMasUsado", produces = "application/json")
    public List<?> getGroupMostUsed(){

        List<?> group = this.userDao.groupMostUsed();

        return group;
    }


}
