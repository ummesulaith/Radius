package com.example.radiusassessment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.radiusassessment.API.UserApi;
import com.example.radiusassessment.Adapter.RecyclerViewAdapter;
import com.example.radiusassessment.Model.Userdata;
import com.example.radiusassessment.Model.children.Stats_Credits;
import com.example.radiusassessment.Model.children.Trips;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    CircleImageView imageView;
    TextView firstname,secondname,city,country,rides,freerides,amt,sym;
    ArrayList<Trips> userdata = new ArrayList<>();
    private ArrayList<Trips> data;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView =(CircleImageView)findViewById(R.id.profilepic);
        firstname = (TextView)findViewById(R.id.fname);
        secondname = (TextView)findViewById(R.id.lname);
        city = (TextView)findViewById(R.id.city);
        country = (TextView)findViewById(R.id.country);
        rides = (TextView)findViewById(R.id.rides);
        freerides = (TextView)findViewById(R.id.freerides);
        amt = (TextView)findViewById(R.id.value);
        sym = (TextView)findViewById(R.id.currency_sym);



        RecyclerView myrv;
        myrv = (RecyclerView) findViewById(R.id.past);
        final RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,userdata);
        myrv.setAdapter(myAdapter);
        myrv.setLayoutManager(new LinearLayoutManager(this));

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(UserApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();

        UserApi api = retrofit.create(UserApi.class);

        Call<Userdata> call = api.getUserdata();
        call.enqueue(new Callback<Userdata>() {
            @Override
            public void onResponse(Call<Userdata> call, Response<Userdata> response) {



                System.out.println("API HIT" +response.body());

                Log.d(TAG, "onResponse: Server Response: " + response.toString());
                Log.d(TAG, "onResponse: received information: " + response.body().toString());


                Userdata userdata = (Userdata) response.body();
                String fname= userdata.getData().getProfile().getFirst_name();
                firstname.setText(fname);

                String sname= userdata.getData().getProfile().getLast_name();
                secondname.setText(sname);

                Glide.with(getApplicationContext())
                        .asBitmap()
                        .load(userdata.getData().getProfile().getMiddle_name())
                        .into(imageView);

                String c= userdata.getData().getProfile().getCity();
                city.setText(c);

                String countr= userdata.getData().getProfile().getCountry();
                country.setText(countr);


                String r= userdata.getData().getStats().getRides();
                rides.setText(r);

                String fr= userdata.getData().getStats().getFree_rides();
                freerides.setText(fr);

                String csym= userdata.getData().getStats().getCredits().getSymbol();
                sym.setText(csym);

                String value= userdata.getData().getStats().getCredits().getValue();
                amt.setText(value);


                myAdapter.setTrips(userdata.getData().getTrips());






            }

            @Override
            public void onFailure(Call<Userdata> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();

                System.out.println("Error"+t.getMessage());
            }
        });



    }
}
