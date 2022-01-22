package Lesson16.Repository;

import java.util.HashSet;
import java.util.Set;

public final class Section {
    private final String name;
    private final Set<Subsection> subsection = new HashSet<>();

    public Section(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Set<Subsection> getSubsection() {
        return this.subsection;
    }

    public Subsection searchSubsection(String name) {
        for (Subsection e : subsection) {
            if (e.getName() == name) {
                return e;
            }
        }
        return null;
    }

    public void registerSubsection(Subsection subsection) {
        this.subsection.add(subsection);
    }

}
