package flowz.cloudflowz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import flowz.cloudflowz.domain.FlowzParamz;
import flowz.cloudflowz.services.FlowzParamzService;
import flowz.cloudflowz.services.FlowzService;

@Controller
public class FlowzParamzController {

	private FlowzService flowzService; 
    private FlowzParamzService flowzParamzService;

    @Autowired
    public void setFlowzService(FlowzService flowzService) {
        this.flowzService = flowzService;
    }
    
    @Autowired
    public void setFlowzParamzService(FlowzParamzService flowzParamzService) {
        this.flowzParamzService = flowzParamzService;
    }

    @RequestMapping(value = "/flowzParamz", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("flowzParamz", flowzParamzService.getAllFlowzParamz());
        return "flowzparamz";
    }

    @RequestMapping("flowzParamz/{id}")
    public String showFlowzParamz(@PathVariable Integer id, Model model){
        model.addAttribute("flowzParamz", flowzParamzService.getFlowzParamzById(id));
        return "flowzparamzshow";
    }

    @RequestMapping("flowzParamz/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("flowzParamz", flowzParamzService.getFlowzParamzById(id));
        model.addAttribute("flowz", flowzService.listAllFlowz());
        return "flowzparamzform";
    }

    @RequestMapping("flowzParamz/new")
    public String newFlowzParamz(Model model){
        model.addAttribute("flowzParamz", new FlowzParamz());
        model.addAttribute("flowz", flowzService.listAllFlowz());
        model.addAttribute("user", "mike@cloudflowz.com");
        return "flowzparamzform";
    }

    @RequestMapping(value = "flowzParamz", method = RequestMethod.POST)
    public String saveFlowzParamz(FlowzParamz flowzParamz){
        flowzParamzService.saveFlowzParamz(flowzParamz);
        return "redirect:/flowzParamz/" + flowzParamz.getId();
    }

    @RequestMapping("flowzParamz/delete/{id}")
    public String delete(@PathVariable Integer id){
        flowzParamzService.deleteFlowzParamz(id);
        return "redirect:/flowzParamz";
    }

}
