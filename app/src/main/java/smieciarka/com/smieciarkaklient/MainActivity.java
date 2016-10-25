package smieciarka.com.smieciarkaklient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == CalendarActivity.CODE && resultCode == RESULT_OK){
            // mozesz jakos zareagowac na wyjsceie z kalendarza
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent openCalendarActivity = new Intent(this, CalendarActivity.class);
        startActivity(openCalendarActivity);
//        startActivityForResult(openCalendarActivity, CalendarActivity.CODE);

    }



}
