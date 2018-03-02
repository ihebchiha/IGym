package gymapp.ihebchiha.com.igym;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import gymapp.ihebchiha.com.igym.Config.ConfigRetroFit;
import gymapp.ihebchiha.com.igym.Modeles.Client;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LogInActivity extends Activity {

    private EditText user;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);


        user=findViewById(R.id.usertxt);
        pass=findViewById(R.id.passtxt);
        final Button connect = findViewById(R.id.CntBtn);
        final Button reset = findViewById(R.id.ResetBtn);


        //Button Listeners
        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               final String username=user.getText().toString();
                final String password=pass.getText().toString();
                if(validateLogin(username, password)){
                    //do login
                    InterClient ic= ConfigRetroFit.retrofit.create(InterClient.class);
                    Call<Client> call =ic.login(username,password);
                    call.enqueue(new Callback<Client>() {
                        @Override
                        public void onResponse(@NonNull Call<Client> call, @NonNull Response<Client> response) {

                            if (response.body()!= null) {
                                Toast.makeText(getApplicationContext(),"Connecté",Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(LogInActivity.this, MenuActivity.class);
                                startActivity(intent);

                            }else
                            {

                               Toast.makeText(getApplicationContext(),"Erreur d'authentification"+response.errorBody(),Toast.LENGTH_LONG).show();

                            }
                        }

                        @Override
                        public void onFailure(@NonNull Call<Client> call, @NonNull Throwable t) {

                            Log.i("erreur: ",t.getMessage());
                            Toast.makeText(getApplicationContext(),"Nom d'utlisateur ou mot de passe est erroné !",Toast.LENGTH_LONG).show();
                            Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_LONG).show();
                        }
                    });

                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getText().toString().equals("")&&pass.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Champs déja vide!",Toast.LENGTH_LONG).show();

                }else
                {
                user.setText("");
                pass.setText("");
            }
            }
        });

    }

    private boolean validateLogin(String username, String password){
        if(username == null || username.trim().length() == 0){
            Toast.makeText(this, "Nom utilisateur requis", Toast.LENGTH_SHORT).show();
            return false;
        }
        if(password == null || password.trim().length() == 0){
            Toast.makeText(this, "Mot de Passe requise", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
