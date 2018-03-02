package gymapp.ihebchiha.com.igym;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class AboutActivity extends Activity {

    Button contact;
    Spinner mSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //References
        contact=findViewById(R.id.contactBtn);
        /*mSpinner=findViewById(R.id.mSpinner);
        //when Clicking on icons
       contact.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int position = mSpinner.getSelectedItemPosition();
               Intent implicit= null;
               switch(position){
                    case 0: {
                    implicit = new Intent(Intent.ACTION_VIEW,
                       Uri.parse("https://www.facebook.com/TheSpear10"));
                        }
                   case 1:{
                       implicit = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:(+000)8675309"));
                   }
               }
               }
       });*/


    }
}
