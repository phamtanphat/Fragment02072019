package phamtanphat.ptp.khoaphamtraining.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AndroidFragment extends Fragment {

    Integer color;


    public AndroidFragment(Integer color) {
        // Required empty public constructor
        this.color = color;
    }



    View view;
    TextView txtAndroid;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_android, container, false);
        txtAndroid = view.findViewById(R.id.textviewAndroid);
        txtAndroid.setTextColor(this.color);
        return view;
    }

}
