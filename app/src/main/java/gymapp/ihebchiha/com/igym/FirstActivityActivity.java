package gymapp.ihebchiha.com.igym;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivityActivity extends Activity {
    private Button register;
    private Button log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);

        //References
        log=findViewById(R.id.LogInBtn);
        register=findViewById(R.id.RegisterBtn);
        //Functionality

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FirstActivityActivity.this,LogInActivity.class);
                startActivity(i);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstActivityActivity.this,RegisterActivity.class));
            }
        });
    }
}
