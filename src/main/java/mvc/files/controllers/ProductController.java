package mvc.files.controllers;

import mvc.files.entites.Product;
import mvc.files.entites.Products;
import mvc.files.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/list")
    public String list(Model model) {
        Product[] products = new Product[productService.getSizeProductsList()];
        for (int i = 0; i < productService.getSizeProductsList(); i++) {
            products[i] = productService.getProductById(i);
        }
        Products listProducts = new Products();
        listProducts.setProducts(products);
        model.addAttribute("products", listProducts);
        return "products";
    }

    @RequestMapping(path = "/byid", method = RequestMethod.GET)
    public Product productById(Model model, @RequestParam int id) {
        Product product = productService.getProductById(id);
        return product;
    }

    @RequestMapping("/showForm")
    public String showSimpleForm(Model model) {
        Product product = new Product();
        product.setId(-1);
        product.setTitle("");
        product.setCost(0);
        model.addAttribute("product", product);
        return "productform";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("product") Product product) {
        productService.addProductToRepository(product);
        product.setId(productService.getSizeProductsList());
        return "formresult";
    }
}
