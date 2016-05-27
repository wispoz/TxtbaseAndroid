package com.wispoz.txtbase.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wispoz.txtbase.R;
import com.wispoz.txtbase.models.Competition;

import java.util.List;

/**
 * Created by wispoz on 27.05.16.
 */
public class CompetitionAdapter extends RecyclerView.Adapter<CompetitionAdapter.PersonViewHolder> {

    public static class PersonViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView name;
        TextView date;
        ImageView personPhoto;

        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            name = (TextView)itemView.findViewById(R.id.name);
            date = (TextView)itemView.findViewById(R.id.date);
            //personPhoto = (ImageView)itemView.findViewById(R.id.person_photo);
        }
    }

    List<Competition> competitions;

    CompetitionAdapter(List<Competition> persons){
        this.competitions = persons;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.competition_item, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        personViewHolder.name.setText(competitions.get(i).name);
        personViewHolder.date.setText(competitions.get(i).date);
    }

    @Override
    public int getItemCount() {
        return competitions.size();
    }
}
