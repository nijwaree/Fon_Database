package ice_pbru.suksaovavimon.nijwaree.fondatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    // Explicit

    private EditText nameEditText, surnameEditText, userEditText, passwordEditText, emailEditText;

    private String nameString, surnameString, userString, passwordString, emailString;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        // bindwidget

        bindwidget();



    } // Main method


    public void clickSignUp (View view) {
        nameString = nameEditText.getText().toString().trim();
        surnameString = surnameEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();
        emailString = emailEditText.getText().toString().trim();


        if (checkspace()) {
            // Have space
            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this, "มีช่องว่าง", "กรุณาตรวจสอบข้อมูลและกรอกให้ครบถ้วน");


        } else {
            // No space

        }

    } // clickSignUp

    private boolean checkspace() {

        return nameString.equals("")||
                surnameString.equals("")||
                userString.equals("")||
                passwordString.equals("")||
                emailString.equals("");


    }


    private void bindwidget() {
        nameEditText = (EditText) findViewById(R.id.editText);
        surnameEditText = (EditText) findViewById(R.id.editText2);
        userEditText = (EditText) findViewById(R.id.editText3);
        passwordEditText = (EditText) findViewById(R.id.editText4);
        emailEditText = (EditText) findViewById(R.id.editText5);


    } // bindwidget


} // Main class
