package com.venkatesh.springbootdemo.respository;

import com.venkatesh.springbootdemo.model.Session;
import com.venkatesh.springbootdemo.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker,Long> {
}
