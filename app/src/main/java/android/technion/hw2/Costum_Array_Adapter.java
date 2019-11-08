package android.technion.hw2;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Costum_Array_Adapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] elements;
//    private final Integer[] indeces;

    public Costum_Array_Adapter(Activity context, String[] elements) {
        super(context, -1, elements);
        this.context = context;
        this.elements = elements;
//        this.indeces = indeces;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=context.getLayoutInflater();
        View v = inflater.inflate(R.layout.row, null,true);
        TextView element = v.findViewById(R.id.element);
        TextView index = v.findViewById(R.id.index);
        element.setText(elements[i]);
        index.setText(i);
        return v;
    }
}
