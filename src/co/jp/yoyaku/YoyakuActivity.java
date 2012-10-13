package co.jp.yoyaku;

import java.util.Calendar;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class YoyakuActivity extends Activity implements View.OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final Button bt = ( Button ) findViewById( R.id.button1 );
        bt.setOnClickListener( this );
    }

	public void onClick(View v) {
		System.out.println( "画面遷移します " );
		Log.v( "YoyakuActivity", "画面遷移します。" );
//		Intent intent = new Intent();
//		intent.setClassName( "co.jp.yoyaku", "co.jp.yoyaku.NextActivity");
//		startActivity(intent);

		Calendar cal = Calendar.getInstance();
//		DatePickerDialog dpd = new DatePickerDialog(
//				this, new OnDateSetListener() {

//				public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//
//				}
//			};
//		);
	}
}