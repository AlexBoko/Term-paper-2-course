import java.time.LocalDate;

public class DailyTask extends Task {

    /**
     * Конструктор
     */
    public DailyTask(String title, Type type, String description) throws IncorrectArgumentException {
        super(title, type, description);
    }

    /**
     * Метод
     */
    public boolean appearsIn (LocalDate time) {
        return true;
    }

}