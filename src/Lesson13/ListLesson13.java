package Lesson13;

import java.util.List;

public abstract class ListLesson13 {
    private List <Integer>list;
    private final MethodsLesson13 methodsLesson13;

    public ListLesson13(MethodsLesson13 methodsLesson13) {
        this.methodsLesson13 = methodsLesson13;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public void writeList(int size) {
        methodsLesson13.setRandom(list, size);
    }

    public void returnRandomList(int quantity) {
        methodsLesson13.getRandom(list, quantity);
    }

    public void writeRandomList(int quantity) {
      methodsLesson13.setRandomList(list,quantity);
    }

}
