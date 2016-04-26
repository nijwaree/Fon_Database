package ice_pbru.suksaovavimon.nijwaree.fondatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Explicit



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // bindwidget

        bindwidget();








    } // main method

    private void bindwidget() {

    }

    public void clickRegis(View view) {
        startActivity(new Intent(MainActivity.this, SignUp.class));


    }





} // main class
