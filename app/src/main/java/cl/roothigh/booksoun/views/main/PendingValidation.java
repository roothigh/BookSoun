package cl.roothigh.booksoun.views.main;

import javax.security.auth.callback.Callback;

import cl.roothigh.booksoun.models.CreateCallback;
import cl.roothigh.booksoun.models.Pending;

/**
 * Created by SebastianVP on 14-11-2016.
 */

public class PendingValidation {
    private CreateCallback callback ;

    public PendingValidation(CreateCallback callback) {
        this.callback = callback;
    }
    public void init (String name) {
        if (name.trim().length() > 0) {
            Pending pending = new Pending();
            pending.setName(name);
            pending.setDone(false);
            pending.save();
            callback.success(pending);


        } else {
            callback.fail();
        }
    }
}
