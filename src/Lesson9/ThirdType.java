package Lesson9;

public class ThirdType implements MasteringASkill{
    @Override
    public void mastering(Skill skill, double talent) {
        System.out.println("Cтудент потратил " + Math.floor(((skill.getStudyTime() / talent)*3)*10)/10  + " часа на практику.");
    }
}
