package ice_pbru.suksaovavimon.nijwaree.fondatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Explicit

    private EditText nameEditText, passwoedEditText;

    private String nameString, passwordString;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // bindwidget

        bindwidget();








    } // main method


    public void clickSignIn(View view) {
        nameString = nameEditText.getText().toString().trim();
        passwordString = passwoedEditText.getText().toString().trim();

        if (checkspace()) {
            // Have space
            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this, "มีช่องว่าง", "กรุณาตรวจสอบข้อมูลให้ครบถ้วน");


        } else {
            // no space

        }


    } // clickSignIn

    private boolean checkspace() {

        return nameString.equals("")||passwordString.equals("");

    }

    private void bindwidget() {
        nameEditText = (EditText) findViewById(R.id.editText6);
        passwoedEditText = (EditText) findViewById(R.id.editText7);


    } // bindwidget

    public void clickRegis(View view) {
        startActivity(new Intent(MainActivity.this, SignUp.class));


    }


    public void testmyAlert(View view) {
        MyAlert myAlert = new MyAlert();
        myAlert.myDialog(this,"Alert", "ทดสอบ");

    }





} // main class
