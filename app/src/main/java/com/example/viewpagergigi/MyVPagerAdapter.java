package com.example.viewpagergigi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;


public class MyVPagerAdapter extends PagerAdapter {

    Context context;
    ArrayList<Gigi> gigis;

    public MyVPagerAdapter(Context context, ArrayList<Gigi> gigis) {
        this.context = context;
        this.gigis = gigis;
    }



    @Override
    public int getCount() {

        return gigis.size();
    }


    // view.equals(object) bcuz we are inflating  our layout with this
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull final ViewGroup container, final int position) {
        //Inflate View
        View view = LayoutInflater.from(context).inflate(R.layout.card_item,container,false);
        //Views
         final ImageView gigiPic = view.findViewById(R.id.myImage);
        TextView textTitle = view.findViewById(R.id.textTitle);
        TextView picDescription = view.findViewById(R.id.description);


        Glide.with(context)
                .load(gigis.get(position).getImage())
                .apply(new RequestOptions().centerCrop())
                .into(gigiPic);

//        gigiPic.setImageResource(gigis.get(position).getImage());
        textTitle.setText(gigis.get(position).getName());
        picDescription.setText(gigis.get(position).getDescription());


        // Handle Item Clicks

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Add code to start relevant activity


                switch (position){
                    case 0: {
                        Intent intent = new Intent(context,WallpaperActivity.class);
                        context.startActivity(intent);
                        break;
                    }
                    case 1: {
                        Intent intent = new Intent(context,ExampleActivity.class);
                        context.startActivity(intent);
                        break;
                    }
                    default: {
                        Toast.makeText(context, gigis.get(position).getName(), Toast.LENGTH_SHORT).show();
                        break;
                    }
                }

            }
        });



        //add the view
        container.addView(view);



        return view;

    }
}
