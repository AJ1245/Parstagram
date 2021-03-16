package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Q97Ls7Ez0GEmc5mwd2koYXKfsbW11yfU6XbhCkw8")
                .clientKey("6n6wcgkSaeI1Dx87WoJaeq6xGTnyTrY6MhSlXFpf")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
