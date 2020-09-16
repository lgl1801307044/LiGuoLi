package com.example.liguoli44;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Create by ankele
 * <p>
 * 2020/9/15 - 10:28
 */
public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private Context context;
    private List<MovieBean.ListBean> listBeans;


    public MovieAdapter(Context context, List<MovieBean.ListBean> listBeans) {
        this.context = context;
        this.listBeans = listBeans;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_movie, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MovieBean.ListBean listBean = listBeans.get(position);
        Glide.with(context).load(listBean.getThumbPath()).into(holder.mMoviePic);
        holder.mMovieName.setText(listBean.getTitle());
        holder.mMovieInfo.setText(listBean.getProfile());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW);
                Uri uri = Uri.parse(listBean.getFilePath());
                intent.setData(uri);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBeans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mMoviePic;
        private TextView mMovieName;
        private TextView mMovieInfo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mMoviePic = (ImageView) itemView.findViewById(R.id.moviePic);
            mMovieName = (TextView) itemView.findViewById(R.id.movieName);
            mMovieInfo = (TextView) itemView.findViewById(R.id.movieInfo);
        }
    }
}
