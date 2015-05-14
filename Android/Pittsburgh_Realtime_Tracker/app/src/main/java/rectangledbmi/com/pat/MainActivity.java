package rectangledbmi.com.pat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import rectangledbmi.com.pittsburghrealtimetracker.R;


public class MainActivity extends Activity {
    ListView listView;
    Button next;
    MovieAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        next = (Button)findViewById(R.id.show_map);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,SelectTransit.class);
                startActivity(it);
            }
        });
        listView = (ListView) findViewById(R.id.list_view);
        adapter = new MovieAdapter(getApplicationContext(), R.layout.row_layout);
        listView.setAdapter(adapter);
        listView.setDividerHeight(0);

        MovieDataProvider dataProvider1 = new MovieDataProvider(R.drawable.up);
        MovieDataProvider dataProvider2 = new MovieDataProvider(R.drawable.d);
        MovieDataProvider dataProvider3 = new MovieDataProvider(R.drawable.b);
        adapter.add(dataProvider1);
        adapter.add(dataProvider2);
        adapter.add(dataProvider3);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
