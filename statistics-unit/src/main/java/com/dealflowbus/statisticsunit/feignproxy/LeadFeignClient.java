package com.dealflowbus.statisticsunit.feignproxy;

import com.dealflowbus.statisticsunit.models.Lead;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@FeignClient(name = "database-main-reader", url = "${DATABASE_MAIN_READER_URI:http://localhost}:8081")
public interface LeadFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/api/leadscrude")
    List<Lead> getLeads();
}
