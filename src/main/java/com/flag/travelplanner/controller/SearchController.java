package com.flag.travelplanner.controller;

import com.flag.travelplanner.Service.AttractionInfoService;
import com.flag.travelplanner.Service.OptionsInfoService;
import com.flag.travelplanner.entity.Attraction;
import com.flag.travelplanner.entity.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {

    @Autowired
    private OptionsInfoService optionsInfoService;

    @Autowired
    private AttractionInfoService attractionInfoService;

    @RequestMapping(value = "/days/{days}", method = RequestMethod.GET)
    @ResponseBody
    public List<Option> getSearchOptionsByDays
            (@PathVariable("days") int days) {
        if (days <= 2) {
            System.out.println("getOneDayOptions");
            return optionsInfoService.getOneDayOptions();
        } else if (days < 7) {
            System.out.println("getThreeDayOptions");
            return optionsInfoService.getThreeDayOptions();
        } else {
            System.out.println("getSevenDayOptions");
            return optionsInfoService.getSevenDayOptions();
        }
    }

    @RequestMapping(value = "/keyword/{keyword}", method = RequestMethod.GET)
    @ResponseBody
    public List<Option> getSearchOptionsByKeyword
            (@PathVariable("keyword") String keyword) {
        String word = keyword.toLowerCase();
        List<Option> result = new ArrayList<>();
        List<Option> optionList = OptionsInfoService.getOptionList();
        for (Option option : optionList) {
            List<Attraction> attractionList = option.getAttractionsList();
            for (Attraction attraction : attractionList) {
                if (word.equals(attraction.getAttractionsName())) {
                    result.add(option);
                }
            }
        }
        return result;
    }
}
