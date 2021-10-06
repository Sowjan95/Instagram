package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MOPqpbx1qCJOMmQGMk4M8jyEKuYu2bifj3o3ax0O")
                .clientKey("WQdenzUzwzo8rYRtMfVkM5GB6nYF1bnspTy8o0yJ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
