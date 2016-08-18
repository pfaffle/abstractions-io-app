package nl.babbq.conference2015.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import nl.babbq.conference2015.R;

public class ViewHolderConference extends RecyclerView.ViewHolder {

    TextView dateStart;
    TextView location;
    TextView speaker;
    TextView headline;
    ImageView favorite;

    public ViewHolderConference(View v) {
        super(v);
        dateStart = (TextView) v.findViewById(R.id.dateStart);
        location = (TextView) v.findViewById(R.id.location);
        speaker = (TextView) v.findViewById(R.id.speaker);
        headline = (TextView) v.findViewById(R.id.headline);
        favorite = (ImageView) v.findViewById(R.id.favorite);
    }
}
