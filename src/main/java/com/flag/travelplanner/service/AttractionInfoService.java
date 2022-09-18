package com.flag.travelplanner.Service;

import com.flag.travelplanner.Dao.AttractionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttractionInfoService { //save for later ue if necessary

    @Autowired
    private AttractionDao attractionDao;
}
