package android.technion.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ArrayAdapter;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

//---------------------------------------------------------------------------------

public class list_activity extends AppCompatActivity {
    ListView list;
    Button insert_bottun;
    private String[] arrayList;
    Costum_Array_Adapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);
        list = findViewById(R.id.myList);
        customAdapter = new Costum_Array_Adapter(this, arrayList);

        insert_bottun = findViewById(R.id.insert);
        list.setAdapter(customAdapter);
        insert_bottun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e = findViewById(R.id.new_item);
                customAdapter.add(e.getText().toString());
            }
        });
    }

    public void on_sign_out(View view) {
        Intent i = new Intent(this, sign_in_activity.class);
        startActivity(i);
        finish();
    }
}