package Lesson16.Bean;

import Lesson16.Repository.Category;

import java.util.HashSet;
import java.util.Set;

public class Catalog {
    private final String name;
    private final Set<Category> category = new HashSet<>();

    public Catalog(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Set<Category> getCategory() {
        return this.category;
    }

    public Category searchCategory(String name) {

        for (Category category: category) {
            if (category.getName() == name){
                return category;
            }
        }
        return null;
    }

    public void registerCategory(Category category) {
        this.category.add(category);
    }
}
