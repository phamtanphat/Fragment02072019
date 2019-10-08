package phamtanphat.ptp.khoaphamtraining.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
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
        Log.d("BBB","onCreateView");
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("BBB","onattach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BBB","onCreate");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("BBB","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("BBB","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("BBB","onResume");
    }

    @Override
    public void onStop() {
        super.onStop();

        Log.d("BBB","onStop");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("BBB","onPause");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("BBB","onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("BBB","onDestroyView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("BBB","onDetach");
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
