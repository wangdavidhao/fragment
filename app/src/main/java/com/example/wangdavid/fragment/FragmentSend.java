package com.example.wangdavid.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import java.util.Scanner;



/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentSend.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentSend#newInstance} factory method to
 * create an instance of this fragment.
 */



public class FragmentSend extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Button button1;
    private TextView textView1;

    private TextInputLayout input;
    private EditText editText;



    private OnFragmentInteractionListener mListener;

    public FragmentSend() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentSend.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentSend newInstance(String param1, String param2) {
        FragmentSend fragment = new FragmentSend();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }



    ///On ouvre l'interface du fragment
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //Déclaration spéciale au fragment
        View view=inflater.inflate(R.layout.fragment_fragment_send, container, false);

        input=(TextInputLayout)view.findViewById(R.id.input);
        input.setHint("Votre message");
        button1 = (Button)view.findViewById(R.id.button1);
        editText= (EditText)view.findViewById(R.id.editText);


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                mListener.sendMessage(editText.getText().toString());
            }
        });
        return view;
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */

    ///Mettre les prototypes des fonctions codées dans le mainActivity
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void sendMessage(String message);
    }
}
