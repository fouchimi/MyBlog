package example.com.myblog;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseUser;

import example.com.myblog.ui.MainActivity;
import example.com.myblog.utils.ParseConstants;

/**
 * Created by LeBoss on 7/29/2015.
 */
public class MyBlogApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this,
                "NKh52RWCRKTNEdH2PE5JgEXIaHNwkwfsj9Z6fZTd",
                "NdKkMM9SImS5Y7JlvdrdSMPH9XYcLQg4LUXElBlt");



        //PushService.setDefaultPushCallback(this, MainActivity.class);
/*        PushService.setDefaultPushCallback(this, MainActivity.class,
                R.drawable.ic_stat_ic_launcher);
        ParseInstallation.getCurrentInstallation().saveInBackground();*/
    }

   public static void updateParseInstallation(ParseUser user) {
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
        installation.saveInBackground();
    }
}
