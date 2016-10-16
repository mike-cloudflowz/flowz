package flowz.cloudflowz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import flowz.cloudflowz.domain.FlowzActionzParamz;
import flowz.cloudflowz.services.FlowzActionzParamzService;
import flowz.cloudflowz.services.FlowzService;

@Controller
public class FlowzActionzParamzController {

	private FlowzActionzService flowzActionzService; 
    private FlowzActionzParamzService flowzActionzParamzService;

    @Autowired
    public void setFlowzService(FlowzService flowzService) {
        this.flowzService = flowzService;
    }
    
    @Autowired
    public void setFlowzActionzParamzService(FlowzActionzParamzService flowzActionzParamzService) {
        this.flowzActionzParamzService = flowzActionzParamzService;
    }

    @RequestMapping(value = "/flowzActionzParamz", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("flowzActionzParamz", flowzActionzParamzService.getAllFlowzActionzParamz());
        return "flowzactionzparamz";
    }

    @RequestMapping("flowzParamz/{id}")
    public String showFlowzParamz(@PathVariable Integer id, Model model){
        model.addAttribute("flowzParamz", flowzParamzService.getFlowzParamzById(id));
        return "flowzactionzparamzshow";
    }

    @RequestMapping("flowzParamz/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("flowzParamz", flowzParamzService.getFlowzParamzById(id));
        model.addAttribute("flowz", flowzService.listAllFlowz());
        return "flowzactionzparamzform";
    }

    @RequestMapping("flowzActionzParamz/new")
    public String newFlowzActionzParamz(Model model){
        model.addAttribute("flowzActionzParamz", new FlowzActionzParamz());
        model.addAttribute("flowz", flowzService.listAllFlowz());
        return "flowzactionzparamzform";
    }

    @RequestMapping(value = "flowzActionzParamz", method = RequestMethod.POST)
    public String saveFlowzActionzParamz(FlowzActionzParamz flowzActionzParamz){
        flowzActionzParamzService.saveFlowzActionzParamz(flowzActionzParamz);
        return "redirect:/flowzActionzParamz/" + flowzActionzParamz.getId();
    }

    @RequestMapping("flowzActionzParamz/delete/{id}")
    public String delete(@PathVariable Integer id){
        flowzActionzParamzService.deleteFlowzActionzParamz(id);
        return "redirect:/flowzActionzParamz";
    }

}
