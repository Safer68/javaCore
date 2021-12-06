package Lesson9;

public abstract class Student {

    private final String name;
    private final double talent;
    private Skill skill;
    private MasteringASkill masteringASkill;

    public Student(String name, MasteringASkill masteringASkill) {
        this.name = name;
        this.masteringASkill = masteringASkill;
        this.talent = Math.floor((Math.random()+0.1) * 10)/10;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void timeSpentLearning() {
        if (skill != null) {
            masteringASkill.mastering(skill, talent);
        } else {
            System.out.println(" У студента нет навыков ! ");
        }
    }
}
