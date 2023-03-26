import java.time.LocalDate;

public class OneTimeTask extends Task {


    /**
     * Конструктор
     */
    public OneTimeTask(String title, Type type, String description) throws IncorrectArgumentException {
        super(title, type, description);
    }

    /**
     * Метод
     */
    public boolean appearsIn (LocalDate time) {
        return getDateTime().toLocalDate().equals(time);
    }
}