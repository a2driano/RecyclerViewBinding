package ua.recycler.binding.recyclerviewbinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new UserAdapter(getUsers()));
    }

    public static List<User> getUsers() {
        List<User> list = new ArrayList<>();
        list.add(new User("Vasya", "https://pbs.twimg.com/profile_images/458483874071191552/wwgNWH0j.jpeg", true));
        list.add(new User("Mila", "http://ichef.bbci.co.uk/news/976/cpsprodpb/B381/production/_92235954_getty_kunis.jpg", false));
        list.add(new User("Petya", "http://www.viva-press.com/wp-content/uploads/jake-gilen.jpg", true));
        return list;
    }
}
