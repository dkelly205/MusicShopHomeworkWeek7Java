public class Lesson implements Sellable {

    private LessonType type;
    private double rate;

    public Lesson(LessonType type, double rate) {
        this.type = type;
        this.rate = rate;
    }


    public LessonType getType() {
        return type;
    }


//    public double getRate() {
//        return rate;
//    }


    @Override
    public double calculateMarkUp() {
        return rate;
    }
}
