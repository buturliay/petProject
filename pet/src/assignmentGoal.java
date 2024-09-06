import java.util.Calendar;

/**
 * A goal that regards an assignment-like task.
 * Completing a goal early rewards the user extra.
 * Completing a goal late harms the user.
 */
public class assignmentGoal implements Goal {
  private String name;
  private Calendar daySet;
  private Calendar dayDue;
  private int importance;
  private String notes;
  private boolean complete;
  private Calendar dayFin;

  /**
   * Sets a goal, creating a hold on pet health.
   * @param name name/description of the goal
   * @param daySet day the goal was set
   * @param dayDue day the goal is due/should be completed by
   * @param importance level of importance on a 1-5 scale
   */
  public assignmentGoal(String name, Calendar daySet, Calendar dayDue,
                        int importance, String notes) {
    this.name = name;
    this.daySet = daySet;
    this.dayDue = dayDue;
    this.importance = importance;
    this.notes = notes;
    this.complete = false;
    this.dayFin = null;
  }

@Override
  public void complete(Calendar dayComplete) {
    this.complete = true;
    this.dayFin = dayComplete;
  }

  @Override
  public void modifyDate(Calendar dayEnd) {

  }

  @Override
  public void modifyName(String name) {

  }

  @Override
  public void modifyNotes(String notes) {

  }

  @Override
  public void modifyImportance(int importance) {

  }
}
