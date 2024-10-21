package test.xmlapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class XmlHomeController {

    @GetMapping(value = "hi",produces = {"application/xml",""})
    public SampleDTO hi() {
        return new SampleDTO("샘플", 10);
    }
}
