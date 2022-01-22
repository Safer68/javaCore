package Lesson16.Service;

import Lesson16.Bean.Catalog;
import Lesson16.Bean.Product;
import Lesson16.Repository.Category;
import Lesson16.Repository.Section;
import Lesson16.Repository.Subsection;

public class CatalogServiceImpl implements CatalogService {
    private final Catalog catalog;

    public CatalogServiceImpl(Catalog catalog) {
        this.catalog = catalog;
    }

    @Override
    public void addProductCatalog(String subsection, Product product) {
        searchSubsection(subsection).registerProduct(product);
    }

    @Override
    public Category searchCategory(String name) {
        return catalog.searchCategory(name);
    }

    @Override
    public Section searchSection(String name) {

        for (Category category : catalog.getCategory()) {
            if (category.searchSection(name) != null) {
                return category.searchSection(name);
            }
        }
        return null;
    }

    @Override
    public Subsection searchSubsection(String name) {

        for (Category category : catalog.getCategory()) {
            for (Section section : category.getSection()) {
                if (section.searchSubsection(name) != null) {
                    return section.searchSubsection(name);
                }
            }
        }
        return null;
    }

    @Override
    public Product searchProduct(String name) {
        for (Category category : catalog.getCategory()) {
            for (Section section : category.getSection()) {
                for (Subsection subsection : section.getSubsection()) {
                    if (subsection.searchProduct(name) != null) {
                        return subsection.searchProduct(name);
                    }
                }
            }
        }
        return null;
    }

    public void printProduct(Subsection subsection) {
        for (Product product : subsection.getProduct()) {
            System.out.println(product.getName() + " Цена: " + product.getPrice() + " Рейтинг: " + product.getRating());
        }
    }

}
