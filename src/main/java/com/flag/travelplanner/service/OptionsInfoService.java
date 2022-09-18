package com.flag.travelplanner.Service;

import com.flag.travelplanner.Dao.OptionsDao;
import com.flag.travelplanner.entity.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionsInfoService {
    @Autowired
    private static OptionsDao optionsDao;

    public List<Option> getOneDayOptions() {return optionsDao.getOneDayOptions();}

    public List<Option> getThreeDayOptions() {return optionsDao.getThreeDayOptions();}

    public List<Option> getSevenDayOptions() {return optionsDao.getSevenDayOptions();}

    public static List<Option> getOptionList() {return optionsDao.getOptionList();}
}
