package sg.edu.rp.c346.id20018354.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact> alContactList;
    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact=findViewById(R.id.listviewContacts);
        alContactList = new ArrayList<>();
        Contact item1 = new Contact("Mary",65,1234567,'F');
        Contact item2 = new Contact("Ken",65,7654321,'M');
        alContactList.add(item1);
        alContactList.add(item2);
        caContact = new CustomAdapter(this, R.layout.row,alContactList);
        lvContact.setAdapter(caContact);
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                Contact contact = alContactList.get(position);
                intent.putExtra("Contact",contact);
                startActivity(intent);
            }
        });
    }
}