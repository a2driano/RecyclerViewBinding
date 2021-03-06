package ua.recycler.binding.recyclerviewbinding;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

import ua.recycler.binding.recyclerviewbinding.databinding.ItemViewBinding;

/**
 * Created by kunde on 25.10.2017.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>
        implements UserClickHandler {
    private List<User> mUserList;

    public UserAdapter(List<User> mUserList) {
        this.mUserList = mUserList;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemViewBinding binding = ItemViewBinding.inflate(inflater, parent, false);
        return new UserViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        User user = MainActivity.getUsers().get(position);
        holder.binding.setUser(user);
        holder.binding.setClick(this);
    }

    @Override
    public int getItemCount() {
        return mUserList.size();
    }

    @Override
    public void clickToUser(View view) {
        View viewSex = view.findViewById(R.id.frameLayout);
        int color = ResourcesCompat.getColor(view.getResources(), R.color.colorAccent, null);
        viewSex.setBackgroundColor(color);
        Log.d("TAG", "*************************** click");
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        ItemViewBinding binding;

        public UserViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }

    @BindingAdapter("bind:imageUrl")
    public static void loadImage(ImageView view, String url) {
        Picasso.with(view.getContext()).load(url).into(view);
    }
}
