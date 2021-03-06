package com.venkatesh.springbootdemo.respository;

import com.venkatesh.springbootdemo.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {

}
