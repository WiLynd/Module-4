package medical.controller;

import medical.model.MedicalForm;
import medical.service.IMedicalForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MedicalFormController {
    IMedicalForm iMedicalForm;

    @GetMapping("/list")
    public String findAll(Model model) {
        List<MedicalForm> medicalFormList = iMedicalForm.findAll();
        model.addAttribute("medicalFormList",medicalFormList);
        return "list";
    }

    @PostMapping("/list")
    public String create(@ModelAttribute MedicalForm medicalForm) {
        iMedicalForm.creat(medicalForm);
        return "redirect:/list";
    }
}
