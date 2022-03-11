package com.codegym.blog.controller;


import com.codegym.blog.model.Blog;
import com.codegym.blog.service.Blog.IBlogService;
import com.codegym.blog.service.category.ICateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class BlogController {


    @Autowired
    IBlogService iBlogService;

    @Autowired
    ICateService iCateService;

    @GetMapping({"", "blog"})
    public String showHomePage(Model model, RedirectAttributes ra,
                               Optional<String> findTitle,
                               @PageableDefault(size = 5) @SortDefault(sort = "category" ) Pageable pageable) {
        ra.addFlashAttribute("msg", "");

        if (!findTitle.isPresent() || findTitle.equals("")) {
            model.addAttribute("list", iBlogService.findAll(pageable));
        } else {
            model.addAttribute("findTitle", findTitle.get());
            model.addAttribute("list", iBlogService.findByTitleContaining(findTitle.get(), pageable));
        }
        return "home";
    }

    @GetMapping("delete/{id}")
    public String showEdit(@PathVariable Integer id, RedirectAttributes ra) {
        iBlogService.delete(id);
        ra.addFlashAttribute("msg", "Delete success");
        return "redirect:/blog";
    }

    @GetMapping("create")
    public String showCreateForm(Model model) {

        Blog newBlog = new Blog();
        model.addAttribute("blog", newBlog);
        model.addAttribute("categoryList", iCateService.findAll());
        return "create";
    }

    @PostMapping("save")
    public String save(Blog myBlog, RedirectAttributes ra) {
        iBlogService.save(myBlog);
        ra.addFlashAttribute("msg", "Add new blog successfully");
        return "redirect:/blog";
    }

    @GetMapping("update/{id}")
    public ModelAndView showUpdateForm(@PathVariable Integer id, Model model) {
        model.addAttribute("categoryList",  iCateService.findAll());
        Optional<Blog> updateBlog = iBlogService.findById(id);
        if (updateBlog.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("update");
            modelAndView.addObject("updateBlog", updateBlog.get());
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error404");
            return modelAndView;
        }
    }

    @PostMapping("/save-update")
    public String saveUpdate(Blog myBlog, RedirectAttributes ra) {
        iBlogService.save(myBlog);
        ra.addFlashAttribute("msg", "Update blog successfully");
        return "redirect:/blog";
    }

    @GetMapping("reading/{id}")
    public ModelAndView showReadPage(@PathVariable Integer id) {
        Optional<Blog> readBlog = iBlogService.findById(id);
        return new ModelAndView("show", "readBlog", readBlog);

    }

}