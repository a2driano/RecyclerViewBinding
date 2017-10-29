package ua.recycler.binding.recyclerviewbinding;

/**
 * Created by kunde on 25.10.2017.
 */

public class User {
    public String name;
    public String url;
    public boolean sex;

    public User(String mName, String mUrl, boolean mSex) {
        this.name = mName;
        this.url = mUrl;
        this.sex = mSex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
