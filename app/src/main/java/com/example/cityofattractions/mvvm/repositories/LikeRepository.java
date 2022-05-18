package com.example.cityofattractions.mvvm.repositories;


import com.example.cityofattractions.R;
import com.example.cityofattractions.mvvm.models.News;

import java.util.ArrayList;
import java.util.Collections;

public class LikeRepository {
    ArrayList<News> holder;

    public LikeRepository() {
        holder = new ArrayList<>();

        News n1 = new News(R.drawable.skachok, "Квантовый скачок", "600 Руб.");
        holder.add(n1);

        News n2 = new News(R.drawable.skachok, "Квантовый скачок", "600 Руб.");
        holder.add(n2);

        News n3 = new News(R.drawable.skachok, "Квантовый скачок", "600 Руб.");
        holder.add(n3);

        News n4 = new News(R.drawable.skachok, "Квантовый скачок", "600 Руб.");
        holder.add(n4);
    }

    public ArrayList<News> getHolder() {
        Collections.reverse(holder);
        return holder;
    }
}
