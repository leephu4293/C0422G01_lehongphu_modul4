package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.Product;
import web.service.IProductService;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/")
    public String home(Model model) {
        List<Product> productList = this.productService.display();
        model.addAttribute("product", new Product());
        model.addAttribute("listProduct", productList);
        return "home";
    }

    @GetMapping("/create")
    public String showAdd(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Product product) {
        productService.create(product);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String showUpdate(Model model, @PathVariable String id) {
        Product product = this.productService.findById(id);
        model.addAttribute("product", product);
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Product product) {
        this.productService.update(product);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam String id) {
        this.productService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/details/{id}")
    public String details(@PathVariable String id, Model model) {
        Product product = this.productService.findById(id);
        model.addAttribute("product", product);
        return "details";
    }

    @PostMapping("/search")
    public String search(@RequestParam String name, Model model) {
        List<Product> productList = this.productService.search(name);
        model.addAttribute("listProduct", productList);
        return "search";
    }

}
