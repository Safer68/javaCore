package Lesson16.Service;

import Lesson16.Bean.Product;
import Lesson16.Repository.Category;
import Lesson16.Repository.Section;
import Lesson16.Repository.Subsection;

public interface CatalogService {
    void addProductCatalog(String subsection, Product product);

    Category searchCategory(String name);

    Section searchSection(String name);

    Subsection searchSubsection(String name);

    Product searchProduct(String name);
}
