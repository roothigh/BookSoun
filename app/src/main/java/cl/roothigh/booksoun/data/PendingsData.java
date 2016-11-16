package cl.roothigh.booksoun.data;

import java.util.ArrayList;
import java.util.List;

import cl.roothigh.booksoun.models.Pending;

/**
 * Created by SebastianVP on 15-11-2016.
 */

public class PendingsData {
    public List<Pending> notDone() {
        List<Pending> pendings = new ArrayList<>();
        List<Pending> pendingList = Pending.find(Pending.class, "done = 0");
        if (pendingList != null && pendingList.size() > 0) {
            pendings.addAll(pendingList);
        }
        return pendings;
    }

    public List<Pending> ligthing() {
        List<Pending> pendings = new ArrayList<>();
        List<Pending> pendingList = Pending.find(Pending.class, "type = ?", "Iluminacion");
        if (pendingList != null && pendingList.size() > 0) {
            pendings.addAll(pendingList);
        }
        return pendings;
    }


}
