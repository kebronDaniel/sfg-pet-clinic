package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.service.OwnerService;
import guru.springframework.sfgpetclinic.service.map.OwnerServiceMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owner", "/owner/index", "/owner/index.html"})
    public String listOwner(Model model){
        model.addAttribute("owners", ownerService.findAll());
        return "owner/index";
    }
}
