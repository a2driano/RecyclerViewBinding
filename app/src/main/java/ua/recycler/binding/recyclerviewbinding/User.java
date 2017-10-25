package ua.recycler.binding.recyclerviewbinding;

/**
 * Created by kunde on 25.10.2017.
 */

public class User {
    private String mName;
    private String mUrl;
    private boolean mSex;

    public User(String mName, String mUrl, boolean mSex) {
        this.mName = mName;
        this.mUrl = mUrl;
        this.mSex = mSex;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public boolean ismSex() {
        return mSex;
    }

    public void setmSex(boolean mSex) {
        this.mSex = mSex;
    }
}
