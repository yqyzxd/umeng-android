package com.wind.umengsharelib.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * Created by wind on 2016/11/8.
 */

public class ShareInfo implements Serializable {

    private String title;
    @JSONField(name = "desc")
    private String content;
    @JSONField(name = "pic")
    private String iconUrl;
    @JSONField(name = "linkUrl")
    private String shareUrl;   // 分享链接，需要拼接商品id和拼团id

    public ShareInfo(){

    }
    public ShareInfo(Builder builder){
        this.title=builder.title;
        this.content=builder.content;
        this.iconUrl=builder.image_url;
        this.shareUrl=builder.share_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public static Builder newBuilder(){
        return new Builder();
    }
    public static class Builder {

        private String title;
        @JSONField(name = "desc")
        private String content;
        @JSONField(name = "pic")
        private String image_url;
        @JSONField(name = "linkUrl")
        private String share_url;   // 分享链接，需要拼接商品id和拼团id


        public Builder setTitle(String title){
            this.title=title;
            return this;
        }

        public Builder setContent(String content){
            this.content=content;
            return this;
        }

        public Builder setImageUrl(String imageUrl){
            this.image_url=imageUrl;
            return this;
        }

        public Builder setShareUrl(String shareUrl){
            this.share_url=shareUrl;
            return this;
        }

        public ShareInfo build(){
            ShareInfo shareInfo=new ShareInfo(this);
            return shareInfo;
        }


    }
}
