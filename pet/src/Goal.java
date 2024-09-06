import java.util.Calendar;

/**
 * A goal has a clear timeline with a set start/finish
 * A goal must be attainable to follow the previous
 * Completing a goal rewards the user
 * Not completing a goal harms the user
 */
public interface Goal {
  /**
   * Represents completing the desired goal
   * @param dayComplete date of completion
   */
  public void complete(Calendar dayComplete);

  /**
   * To modify end date of a goal
   * @param dayEnd new end date
   */
  public void modifyDate(Calendar dayEnd);

  /**
   * To modify the name of a goal
   * @param name new name
   */
  public void modifyName(String name);

  /**
   * To modify the notes of a goal
   * @param notes the new notes
   */
  public void modifyNotes(String notes);

  /**
   * To modify the importance of a goal
   * @param importance the new importance level
   */
  public void modifyImportance(int importance);
}
