package Lesson9;

public class FirstType implements MasteringASkill {
    @Override
    public void mastering(Skill skill, double talent) {
        System.out.println("Cтудент потратил " + Math.floor(((skill.getStudyTime() / talent) / 3)*10)/10 + " часа на разборы,"
                + Math.floor(((skill.getStudyTime() / talent) / 3)*10)/10 + " часа на практику, "
                + Math.floor(((skill.getStudyTime() / talent) / 3)*10)/10 + " часа на нахождение в потоке.");
    }
}
