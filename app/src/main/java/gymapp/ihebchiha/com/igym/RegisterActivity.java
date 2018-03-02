package gymapp.ihebchiha.com.igym;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import gymapp.ihebchiha.com.igym.Config.ConfigRetroFit;

public class RegisterActivity extends Activity {

    EditText cintxt,nomtxt,prenomtxt,teltxt,adrtxt,usertxt,passtxt;
    Button sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //References
        cintxt=findViewById(R.id.cintxt);
        nomtxt=findViewById(R.id.nomtxt);
        prenomtxt=findViewById(R.id.prenomtxt);
        teltxt=findViewById(R.id.teltxt);
        adrtxt=findViewById(R.id.adrtxt);
        usertxt=findViewById(R.id.usertxt);
        passtxt=findViewById(R.id.passtxt);


        sign=findViewById(R.id.signBtn);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final  int cin=Integer.parseInt(cintxt.getText().toString());
                final String nom=nomtxt.getText().toString();
                final String prenom=prenomtxt.getText().toString();
                final String adr=adrtxt.getText().toString();
                final int tel=Integer.parseInt(teltxt.getText().toString());
                final String user=usertxt.getText().toString();
                final String password=usertxt.getText().toString();
               /* if(validateFields()){
                    //do login
                    InterClient ic= ConfigRetroFit.retrofit.create(InterClient.class);
            }
        });


    }
    private boolean validateFields(){
        if(username == null || username.trim().length() == 0){
            Toast.makeText(this, "Nom utilisateur requis", Toast.LENGTH_SHORT).show();
            return false;
        }
        if(password == null || password.trim().length() == 0){
            Toast.makeText(this, "Mot de Passe requise", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;*/
    }
}
