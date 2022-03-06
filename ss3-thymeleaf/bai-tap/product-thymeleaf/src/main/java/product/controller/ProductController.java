package product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import product.model.Product;
import product.service.IProductService;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("")
    public String home(Model model) {
        List<Product> productList = iProductService.findAll();
        model.addAttribute("products", productList);
        return "home";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "edit";
    }

    @PostMapping("/update")
    public String update(Product product, RedirectAttributes redirect) {
        iProductService.edit(product.getId(), product);
        redirect.addFlashAttribute("success", "Updated product successfully!");
        return "redirect:/product";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("product", new Product());
        return "add";
    }

    @PostMapping("/add")
    public String save(Product product, RedirectAttributes redirect) {
        iProductService.add(product);
        redirect.addFlashAttribute("success", "Added product successfully!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(Product customer, RedirectAttributes redirect) {
        iProductService.delete(customer.getId());
        redirect.addFlashAttribute("success", "Deleted product successfully!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "view";
    }

    @GetMapping("/search")
    public String searchName() {
        return "search";
    }

    @PostMapping("/search")
    public String search(@RequestParam String name, Model model) {
        model.addAttribute("products", iProductService.searchByName(name));
        return "home";
    }
}
