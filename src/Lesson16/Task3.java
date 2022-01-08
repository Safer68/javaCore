package Lesson16;

import Lesson16.Bean.Catalog;
import Lesson16.Product.Phone;
import Lesson16.Repository.Category;
import Lesson16.Repository.Section;
import Lesson16.Repository.Subsection;
import Lesson16.Service.CatalogServiceImpl;

/**
 * Вместо массивов используйте коллекции.
 * Создать метод, распечатывающий товары каталога, отсортированные по имени, цене или рейтингу.
 * Добавить возможность сортировать в обратном порядке. (Творческое задание, как поняли так и делайте)
 */
public class Task3 {
    public Task3() {
    }

    public static void main(String[] args) {
        String category = "Электроника";
        String section = "Мобильные телефоны и аксессуары";
        String subsection = "Мобильные телефоны";
        Catalog catalog = new Catalog("Catalog.Onliner.by");
        CatalogServiceImpl service = new CatalogServiceImpl(catalog);
        catalog.registerCategory(new Category(category));
        service.searchCategory(category).registerSection(new Section(section));
        service.searchSection(section).registerSubsection(new Subsection(subsection));
        service.searchSubsection(subsection).registerProduct(new Phone("Iphone1", 456.5, 5));
        service.searchSubsection(subsection).registerProduct(new Phone("Iphone2", 4657.0, 4));
        service.searchSubsection(subsection).registerProduct(new Phone("Iphone3", 356.0, 10));
        service.searchSubsection(subsection).registerProduct(new Phone("Iphone4", 3168.0, 6));
        service.searchSubsection(subsection).registerProduct(new Phone("Iphone5", 18.0, 2));
        service.searchSubsection(subsection).getProduct().sort(new SortProduct(TypeSort.RATING, -1));
        service.printProduct(service.searchSubsection(subsection));
    }
}
