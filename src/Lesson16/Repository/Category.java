package Lesson16.Repository;

import java.util.HashSet;
import java.util.Set;

public class Category {
    private final String name;
    private final Set<Section> section = new HashSet<>();

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Set<Section> getSection() {
        return this.section;
    }

    public Section searchSection(String name) {
        for (Section e : section) {
            if (e.getName() == name) {
                return e;
            }
        }
        return null;
    }

    public void registerSection(Section section) {
        this.section.add(section);
    }
}
