package cl.roothigh.booksoun.models;

/**
 * Created by SebastianVP on 14-11-2016.
 */

public interface CreateCallback {
    void success (Pending pending);
    void fail ();
}
