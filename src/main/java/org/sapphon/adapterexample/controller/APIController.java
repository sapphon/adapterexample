package org.sapphon.adapterexample.controller;

import org.sapphon.adapterexample.model.Orange;
import org.sapphon.adapterexample.model.User;
import org.sapphon.adapterexample.repository.jpa.OrangeRepository;
import org.sapphon.adapterexample.repository.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.hibernate.validator.internal.util.CollectionHelper.newArrayList;

@CrossOrigin
@RestController
public class APIController {

    private UserRepository userRepository;
    private OrangeRepository orangeRepository;

    @Autowired
    public APIController(UserRepository userRepository, OrangeRepository orangeRepository) {
        this.userRepository = userRepository;
        this.orangeRepository = orangeRepository;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return newArrayList(this.userRepository.findAll());
    }

    @RequestMapping(value = "/oranges", method = RequestMethod.GET)
    public List<Orange> getAllOranges() {
        return newArrayList(this.orangeRepository.findAll());
    }


    //region healthcheck
    @RequestMapping(value = "/health")
    public String healthEndpoint() {
        return this.getCannedResponse();
    }

    private String getCannedResponse() {
        return "Adaptertest API is up";
    }
//endregion

}
