package com.example.cityofattractions.mvvm.repositories;


import com.example.cityofattractions.R;
import com.example.cityofattractions.mvvm.models.Like;

import java.util.ArrayList;
import java.util.Collections;

public class LikeRepository {
    ArrayList<Like> holder;

    public LikeRepository() {
        holder = new ArrayList<>();

        Like n1 = new Like(R.drawable.skachok, "Квантовый скачок", "600 Руб.");
        holder.add(n1);

        Like n2 = new Like(R.drawable.skachok, "Квантовый скачок", "600 Руб.");
        holder.add(n2);

        Like n3 = new Like(R.drawable.skachok, "Квантовый скачок", "600 Руб.");
        holder.add(n3);

        Like n4 = new Like(R.drawable.skachok, "Квантовый скачок", "600 Руб.");
        holder.add(n4);
    }

    public ArrayList<Like> getHolder() {
        Collections.reverse(holder);
        return holder;
    }
}
