package blog.controller;

import blog.model.Blog;
import blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    IBlogService iBlogService;
    @RequestMapping
    public String display(Model model){
        List<Blog> blogList = iBlogService.findAll();
        model.addAttribute("listBlog",blogList);
        return "home";
    }
    @GetMapping("/show-create-form")
    public String showCreateForm( Model model){
        model.addAttribute("blog",new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String create(Blog blog, RedirectAttributes redirectAttributes){
        iBlogService.add(blog);
        redirectAttributes.addFlashAttribute("success", "Created successfully!");
        return "redirect:/";
    }

    @GetMapping("/cancel/{id}")
    public String cancel(@PathVariable Long id, RedirectAttributes redirectAttributes){
        iBlogService.remove(id);
        redirectAttributes.addFlashAttribute("success", "Removed successfully!");
        return "redirect:/";
    }
    @GetMapping("/view/{id}")
    public String view(@PathVariable Long id,Model model){
        Blog blog = iBlogService.findById(id);
        model.addAttribute("blog",blog);
        return ("view");
    }
    @GetMapping("/edit/{id}")
    public  String showFormEdit(@PathVariable Long id,Model model){
        Blog blog = iBlogService.findById(id);
        model.addAttribute("blog",blog);
        System.out.println(blog.getId());
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(Blog blog, RedirectAttributes redirectAttributes){
        iBlogService.edit(blog);
        System.out.println(blog.getId());
        redirectAttributes.addFlashAttribute("success", "Updated successfully!");
        return "redirect:/";
    }

    @GetMapping("/search")
    public String search(){
        List<Blog> blogList = iBlogService.search();
        System.out.println(blogList.size());
        return "";
    }
}
