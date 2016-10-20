package flowz.cloudflowz.controllers;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowzErrorController implements ErrorController{

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "There was an error and the error page isnt fully built yet so relax :-)";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}