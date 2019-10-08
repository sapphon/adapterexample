package org.sapphon.adapterexample.controller;

import org.sapphon.adapterexample.model.User;
import org.sapphon.adapterexample.repository.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.hibernate.validator.internal.util.CollectionHelper.newArrayList;

@CrossOrigin
@RestController
public class APIController {

    private UserRepository userRepository;

    @Autowired
    public APIController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value="/users", method=RequestMethod.GET)
    public List<User> getAllUsers(){
        return newArrayList(this.userRepository.findAll());
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
