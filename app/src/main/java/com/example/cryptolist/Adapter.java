package com.example.cryptolist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<Crypto> crypTo;
    private Context context;


    public Adapter(ArrayList<Crypto> crypTo, Context context) {
        this.crypTo = crypTo;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.crypto_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Crypto crypto = crypTo.get(position);
        // Glide digunakan untuk mengambil gambar dari internet
        Glide.with(holder.itemView.getContext())
                .load(crypto.getsPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.ivPhoto);
        holder.tvName.setText(crypto.getsName());
        holder.tvDetail.setText(crypto.getsDetail());
    }

    @Override
    public int getItemCount() {
        return crypTo.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvDetail;
        ImageView ivPhoto;
        CardView cvCardView;
        LinearLayout llLinearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tv_name);
            tvDetail = itemView.findViewById(R.id.tv_detail);
            ivPhoto = itemView.findViewById(R.id.iv_photo);
            cvCardView = itemView.findViewById(R.id.cv_cardview);
            llLinearLayout = itemView.findViewById(R.id.ll_linear);
        }

    }
}
