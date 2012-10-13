package co.jp.yoyaku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

public class NextActivity extends Activity implements View.OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next);


        final Button bt = ( Button ) findViewById( R.id.button2 );
        bt.setOnClickListener( this );

        final CalendarView cv = ( CalendarView ) findViewById( R.id.calView1 );
        cv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
        		System.out.println("日付選択されました");
        		Log.d( "CalendarView v.getId() = ", String.valueOf( v.getId() )  );
        		Log.v( "Date = ", String.valueOf( cv.getDate() ) );
            }
        });
    }

	public void onClick(View v) {
		Log.d( "v.getId() = ", String.valueOf( v.getId() )  );

		System.out.println( "前画面に戻ります。" );
		Log.v( "YoyakuActivity", "画面遷移します。" );
		Intent it = new Intent();
		it.setClassName( "co.jp.yoyaku", "co.jp.yoyaku.YoyakuActivity" );
		startActivity( it );
	}
}
