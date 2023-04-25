import java.lang.annotation.*;
//@Target({ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.METHOD,ElementType.LOCAL_VARIABLE}) we can use anywhere
@Target(ElementType.TYPE)//this only to a class
@Retention(RetentionPolicy.RUNTIME)
@interface footballPlayer
{
String country() default "argentina";
int age() default 35;
}
//@footballPlayer(country = "argentina" ,age=35)
@footballPlayer
class Messi
{

    //@footballPlayer
    // if we use this annotation to variable it will error because we have targeted to a class

    private int matches;
    private int goals;
    void setGoals(int goals)
    {
        this.goals=goals;
    }
    int getGoals()
    {
        return goals;
    }
    void setMatches(int matches)
    {
        this.matches=matches;
    }
    int getMatches()
    {
        return matches;
    }
}
public class Annotation1
{
    public static void main(String[] args)
    {
            Messi messi = new Messi();
            messi.setGoals(700);
            messi.setMatches(100);

        System.out.println(messi.getGoals());
        System.out.println(messi.getMatches());


         Class a =messi.getClass();
                Annotation aa = (Annotation) a.getAnnotation(footballPlayer.class);
                         footballPlayer fp =(footballPlayer)aa;
    int age =fp.age();
        System.out.println(age);
        String country = fp.country();
        System.out.println(country);

    }
}















