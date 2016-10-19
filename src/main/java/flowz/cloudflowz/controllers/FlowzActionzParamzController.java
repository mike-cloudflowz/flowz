package flowz.cloudflowz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import flowz.cloudflowz.domain.FlowzActionzParamz;
import flowz.cloudflowz.services.FlowzActionzParamzService;
import flowz.cloudflowz.services.FlowzService;
import flowz.cloudflowz.services.UsersService;
import flowz.cloudflowz.services.UserzEndpointzService;

@Controller
public class FlowzActionzParamzController {

	private FlowzService flowzService; 
    private FlowzActionzParamzService flowzActionzParamzService;
    private UserzEndpointzService userzEndpointzService;
    private UsersService usersService;

    @Autowired
    public void setFlowzService(FlowzService flowzService) {
        this.flowzService = flowzService;
    }
    
    @Autowired
    public void setFlowzActionzParamzService(FlowzActionzParamzService flowzActionzParamzService) {
        this.flowzActionzParamzService = flowzActionzParamzService;
    }
    
    @Autowired
    public void setUserzEndpointzService(UserzEndpointzService userzEndpointzService) {
        this.userzEndpointzService = userzEndpointzService;
    }
    
    @Autowired
    public void setFlowzActionzParamzService(UsersService usersService) {
        this.usersService = usersService;
    }

    /*@RequestMapping(value = "/showFlowzActionzParamz/{flowzId}", method = RequestMethod.GET)
    public String list(@PathVariable Integer flowzId, Model model){
    	User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("flowzActionzParamz", flowzActionzParamzService.getFlowzActionzParamzByFlowzId(flowzId));
        model.addAttribute("flowz", flowzService.getUsersFlowz(user.getUsername()));
        model.addAttribute("currId", flowzId);
        return "flowzactionzparamz";
    }*/
    
    @RequestMapping(value = "/flowzActionzParamz", method = RequestMethod.GET)
    public String list(@RequestParam(value = "flowzId", required=false) Integer flowzId, Model model){
    	User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    	model.addAttribute("flowzActionzParamz", flowzActionzParamzService.getFlowzActionzParamzByFlowzId(flowzId));
        model.addAttribute("flowz", flowzService.getExistingFlowz());       
        model.addAttribute("userzEndpointz", userzEndpointzService.findByUsername(user.getUsername()));
        model.addAttribute("currId", flowzId);
        return "flowzactionzparamz";
    }

    @RequestMapping("flowzActionzParamz/{id}")
    public String showFlowzParamz(@PathVariable Integer id, Model model){
    	FlowzActionzParamz flowzActionzParamz = flowzActionzParamzService.getFlowzActionzParamzById(id);
        model.addAttribute("flowzActionzParamz", flowzActionzParamz);
        model.addAttribute("userEndpointz", userzEndpointzService.findById(flowzActionzParamz.getUserz_endpointz_id()));        
        return "flowzactionzparamzshow";
    }

    @RequestMapping("flowzActionzParamz/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
    	FlowzActionzParamz flowzActionzParamz = flowzActionzParamzService.getFlowzActionzParamzById(id);
        model.addAttribute("flowzActionzParamz", flowzActionzParamz);
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("flowz", flowzService.getUsersFlowz(user.getUsername()));
        model.addAttribute("user", usersService.findByUsername(user.getUsername()));
        model.addAttribute("userzEndpointz", userzEndpointzService.findByUsername(user.getUsername()));
        model.addAttribute("currId", id);
        return "flowzactionzparamzform";
    }

    @RequestMapping("flowzActionzParamz/new")
    public String newFlowzParamz(Model model){    	
        model.addAttribute("flowzActionzParamz", new FlowzActionzParamz());
        model.addAttribute("flowz", flowzService.getCreatedFlowz());
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("user", usersService.findByUsername(user.getUsername()));
        model.addAttribute("userzEndpointz", userzEndpointzService.findByUsername(user.getUsername()));
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
