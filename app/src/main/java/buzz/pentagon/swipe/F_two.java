package buzz.pentagon.swipe;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ProgressBar;


/**
 * A simple {@link Fragment} subclass.
 */
public class F_two extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_f_one,container,false);
        GridView gridView=view.findViewById(R.id.gridview);
        ProgressBar progressBar=view.findViewById(R.id.progress);
        MyAsync2 my = new MyAsync2(getContext(), progressBar, gridView,"prodigy");
        my.execute("http://500052000.000webhostapp.com/Event_name3.php", "http://500052000.000webhostapp.com/poster3.php","http://500052000.000webhostapp.com/Event_desc3.php");
        // Inflate the layout for this fragment
        return view;
    }

}
