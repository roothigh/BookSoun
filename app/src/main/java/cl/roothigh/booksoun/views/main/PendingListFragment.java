package cl.roothigh.booksoun.views.main;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.roothigh.booksoun.R;
import cl.roothigh.booksoun.adapters.PendingAdapters;
import cl.roothigh.booksoun.models.Pending;
import cl.roothigh.booksoun.views.details.DetailsActivity;
import cl.roothigh.booksoun.views.details.ListClickListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class PendingListFragment extends Fragment  implements ListClickListener {

    private PendingAdapters pendingsAdapters;
    public static final String PENDING_ID = "PENDING_ID";

    public PendingListFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_pending_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        
        RecyclerView recyclerView = (RecyclerView) view;
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);
        pendingsAdapters = new PendingAdapters(this);
        




        recyclerView.setAdapter(pendingsAdapters);



    }
    public  void addPendin(Pending pending){
        pendingsAdapters.add(pending);
    }

    public void ligthining() {
        pendingsAdapters.ligthing();
    }

    @Override
    public void click(long id) {
        Intent intent = new Intent(getActivity(), DetailsActivity.class);
        intent.putExtra(PENDING_ID, id);
        startActivity(intent);
    }
}
