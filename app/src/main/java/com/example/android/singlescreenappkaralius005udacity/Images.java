package com.example.android.singlescreenappkaralius005udacity;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Justas on 2/23/2018.
 */

public class Images {

    private Random randNo;
    private ArrayList<Integer> imageId;

    public Images() {
        imageId = new ArrayList<Integer>();
        imageId.add(R.drawable.optics0);
        imageId.add(R.drawable.optics1);
        imageId.add(R.drawable.optics2);
        imageId.add(R.drawable.optics3);
        imageId.add(R.drawable.optics4);
        imageId.add(R.drawable.optics5);
        imageId.add(R.drawable.optics6);
    }



    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}
