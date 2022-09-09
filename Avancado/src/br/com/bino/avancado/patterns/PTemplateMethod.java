package br.com.bino.avancado.patterns;

import br.com.bino.avancado.abstracts.AbstractPattern;
import br.com.bino.avancado.annotations.PatternMap;
import br.com.bino.avancado.constants.Constants;
import br.com.bino.avancado.repositories.template.method.Category;
import br.com.bino.avancado.repositories.template.method.CategoryDB;
import br.com.bino.avancado.repositories.template.method.CategoryPersist;
import br.com.bino.avancado.repositories.template.method.Product;
import br.com.bino.avancado.repositories.template.method.ProductPersist;
import br.com.bino.avancado.repositories.template.method.ProductsDB;

@PatternMap(patternName = Constants.P_TEMPLATE_METHOD, call = true)
public class PTemplateMethod extends AbstractPattern {

	private CategoryDB categoryDB;
	private ProductsDB productDB;
	
	private CategoryPersist categoryPersist;
	private ProductPersist productPersist;
	private int contCategory;
	private int contProduct;
	
	public PTemplateMethod() {
		
		super.setPatternName(Constants.P_TEMPLATE_METHOD);
		
		categoryDB = CategoryDB.getInstance();
		productDB = ProductsDB.getInstance();
		
		categoryPersist = new CategoryPersist();
		productPersist = new ProductPersist();
		
		contCategory = 0;
		contProduct = 0;
		
	}
	
	@Override
	public void cleanCode() {
	
		Category c1 = saveCategory("Bebidas");
		Category c2 = saveCategory("Doces");
		Category c3 = saveCategory("Tintas");
		
		Product p1 = saveProduct(c1, "Coca Cola", 8.99);
		Product p2 = saveProduct(c1, "Fanta Uva", 7.88);
		Product p3 = saveProduct(c2, "Prestigio", 3.56);
		Product p4 = saveProduct(c2, "Laka Branco", 3.12);
		Product p5 = saveProduct(c2, "Lolo", 3.89);
		
		showProducts();
		
		productPersist.delete(productDB.getList(), p4.getId());
		
		showProducts();
		
		categoryPersist.delete(categoryDB.getList(), c2.getId());
		
		showProducts();
		
		categoryPersist.delete(categoryDB.getList(), c3.getId());
		
		showProducts();
		
	}
	
	public Category saveCategory(String name) {
		
		contCategory++;
		
		Category category = new Category(contCategory, name);
		
		categoryPersist.save(categoryDB.getList(), category, category.getId());
		
		return category;
		
	}
	
	public Product saveProduct(Category category, String name, double value) {
		
		contProduct++;
		
		Product product = new Product()
				.setId(contProduct)
				.setCategory(category)
				.setName(name)
				.setValue(value);
		
		productPersist.save(productDB.getList(), product, product.getId());
		
		return product;
		
	}
	
	public void showProducts() {
		
		StringBuilder result = new StringBuilder();
		
		for(Integer categoryId : categoryDB.getList().keySet()) {
			
			Category c = (Category) categoryDB.getList().get(categoryId);
			
			result.append("CATEGORY: " + c.toString());
			result.append("\n");
			
			for(Integer productId : productDB.getList().keySet()) {
				
				Product p = (Product) productDB.getList().get(productId);

				if( p.getCategory().getId() == c.getId() ) {

					result.append("\t");
					result.append(p.toString());
					result.append("\n");
					
				}
				
			}
			
		}
		
		System.out.println(result.toString());
		System.out.println("---------------------------------------------------------------------");
		
	}
	
}
