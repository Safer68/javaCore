package Lesson14.Service;

import Lesson14.Bean.Pet;

import java.util.HashMap;
import java.util.Map;

public class PetServiceImpl implements PetService {

    private final Map<String, Pet> map = new HashMap<>();

    public Map<String, Pet> getMap() {
        return map;
    }

    @Override
    public void printListPet() {
        for (String e : map.keySet()) {
            System.out.println(e);
        }

    }

    @Override
    public void registerListGroup(Pet pet) {
        map.put(pet.getName(),pet);
    }
}
