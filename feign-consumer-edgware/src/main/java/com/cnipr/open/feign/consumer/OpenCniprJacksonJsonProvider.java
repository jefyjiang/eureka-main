package com.cnipr.open.feign.consumer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

/**
 * Created by Administrator on 2018/2/13.
 */
public class OpenCniprJacksonJsonProvider extends JacksonJsonProvider {
    public OpenCniprJacksonJsonProvider(){
        super(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL));
//        super._mapperConfig.getConfiguredMapper().setSerializationInclusion(JsonInclude.Include.NON_ABSENT);
    }

}
