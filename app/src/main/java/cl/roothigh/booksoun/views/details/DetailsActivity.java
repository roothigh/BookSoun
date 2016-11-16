package cl.roothigh.booksoun.views.details;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import cl.roothigh.booksoun.R;
import cl.roothigh.booksoun.models.Pending;
import cl.roothigh.booksoun.views.main.PendingListFragment;

public class DetailsActivity extends AppCompatActivity {
    private Pending pending;
    private EditText descriptionInput;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        long pendingId = getIntent().getLongExtra(PendingListFragment.PENDING_ID, 0);

        pending = Pending.findById(Pending.class, pendingId);

        getSupportActionBar().setTitle(pending.getName());

        descriptionInput= (EditText) findViewById(R.id.descriptionEt);
        radioGroup = (RadioGroup) findViewById(R.id.typeRg);

    }

    @Override
    protected void onResume() {
        super.onResume();
        descriptionInput.setText(pending.getDescription());
        if (pending.getType() != null) {
            //TODO set previous stored value
        }
    }

    @Override
    protected void onPause() {
        String description = descriptionInput.getText().toString();
        pending.setDescription(description);
        if (radioGroup.getCheckedRadioButtonId() != -1) {
            RadioButton radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            pending.setType(radioButton.getText().toString());
        }
        pending.save();
        super.onPause();
    }
}

