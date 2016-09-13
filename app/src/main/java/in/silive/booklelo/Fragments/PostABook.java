package in.silive.booklelo.Fragments;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

import org.json.JSONObject;

import in.silive.booklelo.Network.CheckConnectivity;
import in.silive.booklelo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PostABook extends Fragment {
    //UI Elements
    LinearLayout post_a_book;
    EditText book_title,book_details;
    Spinner book_branch,book_sem;
    Button post_book;


    public PostABook() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View pview = inflater.inflate(R.layout.fragment_post_abook, container, false);
        post_a_book = (LinearLayout)pview.findViewById(R.id.post_a_book);
        book_title = (EditText)pview.findViewById(R.id.book_title);
        book_details = (EditText)pview.findViewById(R.id.book_details);
        book_branch = (Spinner)pview.findViewById(R.id.book_branch);
        book_sem = (Spinner)pview.findViewById(R.id.book_sem);
        post_book = (Button)pview.findViewById(R.id.post_book);
        post_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckConnectivity checkConnectivity = new CheckConnectivity();
                if (checkConnectivity.isNetConnected(getContext())){
                    getBookData();
                }
                else {
                    Snackbar snackbar = Snackbar
                            .make(post_a_book, "No internet connection!", Snackbar.LENGTH_SHORT);
                    snackbar.show();
                }


            }
        });
        return pview;
    }
    public void getBookData(){
        JSONObject bookData = new JSONObject();
        try {
            bookData.put("BOOKTITLE",book_title.getText().toString());
            bookData.put("BOOKBRANCH",book_branch.getSelectedItemPosition()+1);
            bookData.put("BOOKSEM",book_sem.getSelectedItemPosition()+1);
            bookData.put("BOOKDETAILS",book_details.getText().toString());
        }
        catch (Exception e){

        }

    }

}
