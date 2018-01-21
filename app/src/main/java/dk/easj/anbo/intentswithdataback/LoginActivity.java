package dk.easj.anbo.intentswithdataback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    public static final String USERNAME = "username";
    public static final String PASSWORD = "passwor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }



    public void loginButtonClicked(View view) {
        Intent data = new Intent();
        EditText usernameView = findViewById(R.id.loginPasswordEditText);
        String username = usernameView.getText().toString();
        EditText passwordView = findViewById(R.id.loginUsernameEditText);
        String password = passwordView.getText().toString();
        data.putExtra(USERNAME, username);
        data.putExtra(PASSWORD, password);
        setResult(RESULT_OK, data);
        finish();
    }

    public void cancelButtonClicked(View view) {
        setResult(RESULT_CANCELED);
        finish();
    }
}
