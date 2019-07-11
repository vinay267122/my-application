package pluralsight.com.horizontalrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getImages();
    }

    private void getImages(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/11/06/23/51/frankfurt-1804481_1280.jpg");
        mNames.add("frankfurt");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/08/25/19/10/mill-1620440_1280.jpg");
        mNames.add("mill");

        mImageUrls.add("https://image.shutterstock.com/image-photo/frankfurt-old-town-square-romerberg-600w-556973500.jpg");
        mNames.add("oldtownsquare");

        mImageUrls.add("https://image.shutterstock.com/z/stock-photo-frankfurt-germany-financial-district-skyline-173501681.jpg");
        mNames.add("stockphoto");


        mImageUrls.add("https://pixabay.com/photos/milky-way-starry-sky-night-sky-star-2695569/");
        mNames.add("milkyway");

        mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames.add("Frozen Lake");


        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("White Sands Desert");

        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("Austrailia");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("Washington");

        initRecyclerView();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
    }
}

















