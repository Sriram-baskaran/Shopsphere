package com.jvlcode.Shopsphere.seed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jvlcode.Shopsphere.entity.Product;
import com.jvlcode.Shopsphere.repository.ProductRepository;

@Component
public class ProductSeeder implements CommandLineRunner{
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		if(productRepository.count()==0) {
			List<Product> demoProducts = List.of(
					new Product(null,"sony xperia 1vii",90000.0,"qualcomm snapdragon 8gen2","Smartphones",4.8,"Amazon",10,List.of("/products/sony-xperia-1vii.jpg")),
					new Product(null,"samsung galaxy s24 ultra",120000.0,"exynos 2400","Smartphones",4.9,"Flipkart",15,List.of("/products/s24ultra.jpg")),
					new Product(null,"apple iphone 15 pro max",150000.0,"apple a17 pro","Smartphones",4.7,"Apple Store",20,List.of("/products/iphone-15pro-max.jpg")),
					new Product(null,"oneplus 12",80000.0,"qualcomm snapdragon 8gen3","Smartphones",4.6,"Amazon",12,List.of("/products/oneplus-12.jpg")),
					new Product(null,"google pixel 9 pro",95000.0,"google tensor g4","Smartphones",4.5,"Google Store",8,List.of("/products/google-pixel-9-pro.jpg")),
					new Product(null,"xiaomi 14 ultra",70000.0,"qualcomm snapdragon 8gen3","Smartphones",4.4,"Mi Store",18,List.of("/products/xiaomi-14-ultra.jpg")),
					new Product(null,"dell xps 15 laptop",140000.0,"intel core i7 13th gen","Laptops",4.6,"Dell Store",10,List.of("/products/dell-xps-15.jpg")),
					new Product(null,"apple macbook pro 16",220000.0,"apple m3 pro","Laptops",4.9,"Apple Store",5,List.of("/products/apple macbook-pro-16.jpg")),
					new Product(null,"sony wh-1000xm5 headphones",35000.0,"sony integrated processor v1","Headphones",4.8,"Amazon",25,List.of("/products/sony wh-1000xm5.jpg")),
					new Product(null,"canon eos r7 camera",110000.0,"digic x processor","Cameras",4.7,"Canon Store",7,List.of("/products/canon-eosr7.jpg")),
					new Product(null,"apple watch series 10",55000.0,"apple s10 chip","Wearables",4.6,"Apple Store",30,List.of("/products/apple-watch-series-10.jpg"))
					);
			productRepository.saveAll(demoProducts);
			System.out.println("Seeded Demo products");
					
		}else {
			System.out.println("Products already exists, skipping seed....");
		}
		
	}

}
