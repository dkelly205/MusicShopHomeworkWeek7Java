import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LessonTest {

    Lesson lesson;

    @Before
    public void setUp() throws Exception {
        lesson = new Lesson(LessonType.GUITAR, 25.00);
    }

    @Test
    public void testLessonType() {
        assertEquals(LessonType.GUITAR, lesson.getType());
    }

    @Test
    public void testLessonPrice(){
        assertEquals(25.00, lesson.calculateMarkUp(), 0.01);
    }
}
