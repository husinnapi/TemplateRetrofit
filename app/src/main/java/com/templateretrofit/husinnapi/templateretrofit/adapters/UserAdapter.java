package com.templateretrofit.husinnapi.templateretrofit.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.templateretrofit.husinnapi.templateretrofit.R;
import com.templateretrofit.husinnapi.templateretrofit.model.User;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by husinnapi on 9/17/16.
 */
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {

    private List<User.ItemsBean> itemsBeanList;

    public UserAdapter(List<User.ItemsBean> itemsBeanList) {
        this.itemsBeanList = itemsBeanList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.each_row_layout, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.title.setText(itemsBeanList.get(position).getGists_url());
        holder.count.setText(itemsBeanList.get(position).getLogin());
    }

    @Override
    public int getItemCount() {
        return itemsBeanList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView title, count;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.textView);
            count = (TextView) itemView.findViewById(R.id.textCount);
        }
    }
}
