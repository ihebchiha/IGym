package gymapp.ihebchiha.com.igym;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class FeedActivity extends Activity {

    RecyclerView mRv;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        //initializing

        mRv=findViewById(R.id.list);
        mRv.setLayoutManager(new LinearLayoutManager(this));
        RssAdapter adapter=new RssAdapter();
        mRv.setAdapter(adapter);
        XMLAsyncTask task=new XMLAsyncTask(adapter);
        task.execute("https://defi-fitness.webnode.fr/rss/all.xml");
    }
}
