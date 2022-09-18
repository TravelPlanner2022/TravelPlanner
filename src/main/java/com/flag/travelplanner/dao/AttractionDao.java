package com.flag.travelplanner.Dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AttractionDao { //save for later ue if necessary
    @Autowired
    private SessionFactory sessionFactory;

}
