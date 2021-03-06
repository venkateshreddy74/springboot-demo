package com.venkatesh.springbootdemo.controller;


import com.venkatesh.springbootdemo.model.Session;
import com.venkatesh.springbootdemo.respository.SessionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/sessions")
public class SessionController {

    @Autowired
    private SessionRepository sessionRepository;

    @GetMapping
    public List<Session> list() {
        return sessionRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Session get(@PathVariable Long id) {
        return sessionRepository.getOne(id);
    }


    @PostMapping
    public Session create(@RequestBody Session session) {
        return sessionRepository.saveAndFlush(session);
    }

    @PutMapping(value = "{id}")
    public Session update(@PathVariable Long id, @RequestBody Session session) {
        Session existingSession = sessionRepository.getOne(id);
        BeanUtils.copyProperties(session, existingSession, "session_id");
        return sessionRepository.saveAndFlush(existingSession);
    }

    @DeleteMapping(value = "{id}")
    public void delete(@PathVariable Long id) {
        sessionRepository.deleteById(id);
    }

}
