package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class FireBaseCloudMessagingService extends FirebaseInstanceIdService {

    private static final String TAG = FireBaseCloudMessagingService.class.getSimpleName();


    @Override
    public void onTokenRefresh() {


        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + token);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(token);
    }



    private void sendRegistrationToServer(String token) {
        // TODO: Implement this method to send token to your app server.
    }

}