package sg.edu.rp.c346.id20018354.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView name;
    ImageView image;
    Contact contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        name=findViewById(R.id.tvName);
        image=findViewById(R.id.ivGender);

        Intent i =getIntent();
        contact = (Contact) i.getSerializableExtra("Contact");

        name.setText(contact.getName());
        if (contact.getGender()=='F') {
            image.setImageResource(R.drawable.female);
        }else {
            image.setImageResource(R.drawable.male);
        }
    }
}