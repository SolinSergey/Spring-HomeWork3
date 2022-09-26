package mvc.files.service;

import mvc.files.entites.Product;
import mvc.files.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
    ProductsRepository productsRepository;

    @Autowired
    public void setProductsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public Product getProductById(int id) {
        return productsRepository.getProductsById(id);
    }

    public void addProductToRepository(Product product) {
        productsRepository.addProducts(product);
    }

    public int getSizeProductsList() {
        return productsRepository.getSizeProductList();
    }

}
