package ua.recycler.binding.recyclerviewbinding;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ua.recycler.binding.recyclerviewbinding.databinding.ItemViewBinding;

/**
 * Created by kunde on 25.10.2017.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    private List<User> mUserList;

    public UserAdapter(List<User> mUserList) {
        this.mUserList = mUserList;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemViewBinding binding = ItemViewBinding.inflate(inflater, parent, false);
        return null;
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        User user = MainActivity.getUsers().get(position);
//        holder.binding.set

    }

    @Override
    public int getItemCount() {
        return mUserList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        ItemViewBinding binding;

        public UserViewHolder(View itemView) {
            super(itemView);
        }
    }
}
