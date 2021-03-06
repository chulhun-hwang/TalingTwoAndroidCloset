package com.example.hooney.tailing_week_two.DialogFragment;


import android.app.Dialog;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hooney.tailing_week_two.MainActivity;
import com.example.hooney.tailing_week_two.MainPageActivity;
import com.example.hooney.tailing_week_two.R;
import com.example.hooney.tailing_week_two.gridview_home.dressItem;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddInfoFragment extends DialogFragment {
    private Dialog dialog;
    private View view;

    private ArrayList<dressItem> list;
    private int Index;
    private int id;



    public AddInfoFragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        dialog = super.onCreateDialog(savedInstanceState);
        dialog.setCanceledOnTouchOutside(false);
        LayoutInflater inflater = getActivity().getLayoutInflater();
        view = inflater.inflate(R.layout.fragment_add_info, null);
        dialog.setContentView(view);


        //String string[] = tempString.split(", ");
       // string[0].replaceAll("#", "");
        // "#내용" > "내용"

        list = ((MainPageActivity)getActivity()).getList();

        list.get(id).setDressTag(new String[]{""});

       ((MainPageActivity) getActivity()).setList(list);




        return dialog;
    }

}
