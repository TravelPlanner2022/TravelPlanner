package com.flag.travelplanner.Dao;

import com.flag.travelplanner.entity.Option;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OptionsDao {
    @Autowired
    private SessionFactory sessionFactory;
    public List<Option> getOneDayOptions() {
        List<Option> result = new ArrayList<>();
        List<Option> optionList = getOptionList();
        for (Option option : optionList) {
            if (option.getDays() == 1) {
                result.add(option);
            }
        }
        return result;
    }
    public List<Option> getThreeDayOptions() {
        List<Option> result = new ArrayList<>();
        List<Option> optionList = getOptionList();
        for (Option option : optionList) {
            if (option.getDays() == 3) {
                result.add(option);
            }
        }
        return result;
    }
    public List<Option> getSevenDayOptions() {
        List<Option> result = new ArrayList<>();
        List<Option> optionList = getOptionList();
        for (Option option : optionList) {
            if (option.getDays() == 7) {
                result.add(option);
            }
        }
        return result;
    }

    public List<Option> getOptionList() {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            //return...
        } catch (Exception ex) {
            ex.printStackTrace();
            if (session != null) {
                session.getTransaction().rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
