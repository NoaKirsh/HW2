package android.technion.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class sign_in_activity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_activity);
    }

    public void go_to_sign_up(View view){
        Intent i = new Intent(this, sign_up_activity.class);
//        EditText editTextEmail = findViewById(R.id.Email);
//        String email = editTextEmail.getText().toString();
//        EditText editTextPassword = findViewById(R.id.Email);
//        String password = editTextPassword.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, email, password);
        startActivity(i);
    }

    public void go_to_list_activity(View view){
        Intent i = new Intent(this, list_activity.class);
//        EditText editTextEmail = findViewById(R.id.Email);
//        String email = editTextEmail.getText().toString();
//        EditText editTextPassword = findViewById(R.id.Email);
//        String password = editTextPassword.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, email, password);
        startActivity(i);
        finish();
    }
}
