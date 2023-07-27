package com.user.sinhgadupdates.model;

public class UserModel {
    private String userID, username, password, emailId, mobile;

    public UserModel() {
    }

    public UserModel(String userID, String username, String password, String emailId, String mobile) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.emailId = emailId;
        this.mobile = mobile;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public class LikedBlog {
        private String blogId, time;

        public LikedBlog() {
        }

        public String getBlogId() {
            return blogId;
        }

        public void setBlogId(String blogId) {
            this.blogId = blogId;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
