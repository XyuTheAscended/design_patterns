package observer;

public interface Observer {
/*
 * 
 * update method updates the warning and notes to play when there is a problem or when there isnt a problem in the city
 * @param warning
 * @param note
 */
    public void update(boolean warning, int note);
}
