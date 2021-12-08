package Lesson9;

public class SecondType implements MasteringASkill {
    @Override
    public void mastering(Skill skill, double talent) {
        System.out.println("Cтудент потратил " + Math.floor((skill.getStudyTime() / talent) * 10) / 10 + " часа на разборы,"
                + Math.floor((skill.getStudyTime() / talent) * 10) / 10 + " часа на практику.");
    }
}
