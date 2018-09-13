package com.typh.highlight_springmvc4.web.ch4_3;

import com.typh.highlight_springmvc4.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class DemoRestController {
    @RequestMapping(value = "/getjson", produces = "application/json;charset=UTF-8")
    public DemoObj getjson(DemoObj obj) {
        return new DemoObj(obj.getId()+1, obj.getName() + "yy");
    }

    @RequestMapping(value="/getxml", produces = "application/xml;charset=UTF-8")
    public DemoObj getgetxml(DemoObj obj) {
        return new DemoObj(obj.getId()+1, obj.getName() + "yy");
    }
}
