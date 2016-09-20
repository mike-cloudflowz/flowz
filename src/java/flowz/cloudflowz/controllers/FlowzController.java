package flowz.cloudflowz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import flowz.cloudflowz.domain.Flowz;
import flowz.cloudflowz.services.FlowzService;

@Controller
public class FlowzController {

    private FlowzService flowzService;

    @Autowired
    public void setFlowzService(FlowzService flowzService) {
        this.flowzService = flowzService;
    }

    @RequestMapping(value = "/flowz", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("flowz", flowzService.listAllFlowz());
        return "flowz";
    }

    @RequestMapping("flowz/{id}")
    public String showFlowz(@PathVariable Integer id, Model model){
        model.addAttribute("flowz", flowzService.getFlowzById(id));
        return "flowzshow";
    }

    @RequestMapping("flowz/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("flowz", flowzService.getFlowzById(id));
        return "flowzform";
    }

    @RequestMapping("flowz/new")
    public String newFlowz(Model model){
        model.addAttribute("flowz", new Flowz());
        return "flowzform";
    }

    @RequestMapping(value = "flowz", method = RequestMethod.POST)
    public String saveFlowz(Flowz flowz){
        flowzService.saveFlowz(flowz);
        return "redirect:/flowz/" + flowz.getId();
    }

    @RequestMapping("flowz/delete/{id}")
    public String delete(@PathVariable Integer id){
        flowzService.deleteFlowz(id);
        return "redirect:/flowz";
    }
    
    @RequestMapping("flowz/manage/{id}")
    public String manage(@PathVariable Integer id, Model model){
    	flowzService.manageFlowz(id);
        return "redirect:/flowz";
    }

}
