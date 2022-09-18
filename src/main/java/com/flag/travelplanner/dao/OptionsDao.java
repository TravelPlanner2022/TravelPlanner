package com.flag.travelplanner.Dao;

import com.flag.travelplanner.entity.Option;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OptionsDao {
    @Autowired
    private SessionFactory sessionFactory;
    public List<Option> getOneDayOptions() {
        return null;
    }

    public List<Option> getThreeDayOptions() {
        return null;
    }

    public List<Option> getSevenDayOptions() {
        return null;
    }

}
