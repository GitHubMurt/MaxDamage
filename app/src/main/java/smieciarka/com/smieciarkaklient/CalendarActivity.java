package smieciarka.com.smieciarkaklient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.squareup.timessquare.CalendarPickerView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

public class CalendarActivity extends AppCompatActivity {
    public static final int CODE = 1;

    CalendarPickerView mCalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        mCalendarView = (CalendarPickerView ) findViewById(R.id.calendar) ;
        initializeCalendar();
    }

    private void initializeCalendar(){
        Calendar nextYear = Calendar.getInstance();
        nextYear.add(Calendar.YEAR, 1);

        Date today = new Date();

//            Calendar day1 = Calendar.getInstance();
//            day1.add(Calendar.DATE, 1);
//            Calendar day1 = Calendar.getInstance();
//            day1.add(Calendar.DATE, 1);
        Collection<Date> dateCollection = new ArrayList<>();
        for(int i = 1 ; i < 10 ; i = i+2){
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, i);
            dateCollection.add(cal.getTime());
        }

//        mCalendarView.init(today, nextYear.getTime()).withSelectedDates(dateCollection);
        mCalendarView.init(today, nextYear.getTime()).withSelectedDate(today);

    }


    private void markCollaction(){

    }
}
