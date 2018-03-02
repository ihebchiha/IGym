package gymapp.ihebchiha.com.igym;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import gymapp.ihebchiha.com.igym.Extras.MenuList;

public class MenuActivity extends Activity {

    private MenuAdapter mMenuAdapter;
    MenuList[] myMenusArray = new MenuList[]{
            new MenuList("Actualités", "news" ,""),
            new MenuList("Localisation", "marker",""),
            new MenuList("Boutique", "shop",""),
            new MenuList("Abonnement", "pos", ""),
            new MenuList("Evenements", "event",""),
            new MenuList("Profil",  "user" , ""),
            new MenuList("A propos",  "about" , ""),

 };

    ListView mListView;
    ArrayAdapter<String> mArrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mListView=findViewById(R.id.mListView);

        mMenuAdapter=new MenuAdapter(getApplicationContext(),R.layout.row,myMenusArray);


        if(mListView != null){
             mListView.setAdapter(mMenuAdapter);
             }

         mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                 switch(i){
                     case 0:
                     {
                         startActivity(new Intent(MenuActivity.this,FeedActivity.class));
                         break;
                     }

                     case 1:{
                         startActivity(new Intent(MenuActivity.this,LocationActivity.class));
                         break;
                     }

                     case 2:{
                         break;
                     }
                     case 3:{
                            break;
                     }
                     case 4:{
                            break;
                     }
                     case 5:{
                            break;
                     }
                     case 6:
                     {
                         startActivity(new Intent(MenuActivity.this,AboutActivity.class));
                         break;
                     }
                 }
                 }
 });
         }



}

