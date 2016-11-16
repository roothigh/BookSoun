package cl.roothigh.booksoun.views.header;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import cl.roothigh.booksoun.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SelectionFragment extends Fragment {

    private TypeCallback callback;

    public SelectionFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        callback = (TypeCallback) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_selection, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button light = (Button) view.findViewById(R.id.lightBtn);
        light.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.lightings();

            }
        });

    }


}
