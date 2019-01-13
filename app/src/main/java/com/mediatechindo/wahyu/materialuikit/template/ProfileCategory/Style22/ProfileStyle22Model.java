package com.mediatechindo.wahyu.materialuikit.template.ProfileCategory.Style22;

/**
 * Created by Wahyu on 06/08/2015.
 */
public class ProfileStyle22Model {

    public ProfileStyle22Model(String mTitle, String url){
        title = mTitle;
        imageUrl = url;
    }

    public ProfileStyle22Model(){

    }

    private String id;
    private String imageUrl;
    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
