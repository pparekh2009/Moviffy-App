package com.priyanshparekh.registerapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements View.OnClickListener{

    public HomeFragment() {
        // Required empty public constructor
    }

    SliderView sliderView;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        super.onCreate(savedInstanceState);

        // attack
        String src1 = "https://i.ytimg.com/vi/aUvwOK2N4V8/maxresdefault.jpg";
        // badhai do
        String src2 = "https://i.ytimg.com/vi/RF0cZx0z7Z8/maxresdefault.jpg";
        // code name
        String src3 = "https://moviekoop.com/Images/Cover_Photos/code-name-abdul.jpg";
        // kashmir files
        String src4 = "https://resize.indiatvnews.com/en/resize/newbucket/715_-/2021/11/pjimage-2021-01-16t164252-1610795676-1637311630.jpg";
        // mithu
        String src5 = "https://images.thequint.com/thequint%2F2021-12%2F63aa0610-28b9-4718-a537-a3e5800ba63a%2Ftaaps.jpg?rect=0%2C0%2C2100%2C1181";
        // prithviraj
        String src6 = "https://upload.wikimedia.org/wikipedia/en/a/ae/Prithviraj_poster.jpg";

        ArrayList<SliderData> sliderDataArrayList = new ArrayList<>();

        // initializing the slider view.
        sliderView = getView().findViewById(R.id.image);
//        sliderView = getActivity().findViewById(R.id.image);

        // adding the urls inside array list
        sliderDataArrayList.add(new SliderData(src1));
        sliderDataArrayList.add(new SliderData(src2));
        sliderDataArrayList.add(new SliderData(src3));
        sliderDataArrayList.add(new SliderData(src4));
        sliderDataArrayList.add(new SliderData(src5));
        sliderDataArrayList.add(new SliderData(src6));

        // passing this array list inside our adapter class.
        SliderAdapter adapter = new SliderAdapter(this, sliderDataArrayList);

        // below method is used to set auto cycle direction in left to
        // right direction you can change according to requirement.
        sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);

        // below method is used to
        // setadapter to sliderview.
        sliderView.setSliderAdapter(adapter);

        // below method is use to set
        // scroll time in seconds.
        sliderView.setScrollTimeInSec(3);

        // to set it scrollable automatically
        // we use below method.
        sliderView.setAutoCycle(true);

        // to start autocycle below method is used.
        sliderView.startAutoCycle();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(getContext(), "Toast", Toast.LENGTH_SHORT).show();
    }
}