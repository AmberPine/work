package com.ambersec.cloud.domain.model.user;

import com.ambersec.cloud.domain.shared.AbstractEntity;

/**
 * Created by pine on 2016/6/6.
 */
public class User extends AbstractEntity<User> {

    private String account;
    private String name;
    private String password;
    private String email;
    private String phonenum;
    private String mobilephone;

    public User(){}

    public User(String id,String account,String name, String password, String email, String phonenum, String mobilephone) {
        this.id = id;
        this.account = account;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phonenum = phonenum;
        this.mobilephone = mobilephone;
    }

    @Override
    public boolean sameIdentityAs(final User other) {
        return other != null && id.equals(other.id);
    }

    public String getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final User user = (User) o;
        return sameIdentityAs(user);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phonenum='" + phonenum + '\'' +
                ", mobilephone='" + mobilephone + '\'' +
                '}';
    }
}
