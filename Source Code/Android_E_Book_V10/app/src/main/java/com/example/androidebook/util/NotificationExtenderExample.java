package com.example.androidebook.util;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
public class NotificationExtenderExample extends NotificationExtenderService {

    private NotificationManager mNotificationManager;
    private String NOTIFICATION_CHANNEL_ID = "android_e_book";
    private String message, bigpicture, title, id, subId, type, titleName, url;

        Random random_code = new Random();
        int code = random_code.nextInt(9999 - 1000) + 1000;

        PendingIntent contentIntent = PendingIntent.getActivity(this, code, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        Uri uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID)
                .setAutoCancel(true)
                .setSound(uri)
                .setAutoCancel(true)
                .setChannelId(NOTIFICATION_CHANNEL_ID)
                .setLights(Color.RED, 800, 800);

        mBuilder.setSmallIcon(getNotificationIcon(mBuilder));

        mBuilder.setContentTitle(title);
        mBuilder.setTicker(message);

        if (bigpicture != null) {
            mBuilder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(getBitmapFromURL(bigpicture)).setSummaryText(message));
        } else {
            mBuilder.setStyle(new NotificationCompat.BigTextStyle().bigText(message));
        }

        Random random = new Random();
        int m = random.nextInt(9999 - 1000) + 1000;

        mBuilder.setContentIntent(contentIntent);
        mNotificationManager.notify(m, mBuilder.build());
    }

    private int getNotificationIcon(NotificationCompat.Builder notificationBuilder) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            notificationBuilder.setColor(getColour());
            return R.drawable.ic_stat_onesignal_default;
        } else {
            return R.mipmap.ic_launcher;
        }
    }

    private int getColour() {
        return getResources().getColor(R.color.notification_color);
    }

    public static Bitmap getBitmapFromURL(String src) {
        try {
            URL url = new URL(src);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            Bitmap myBitmap = BitmapFactory.decodeStream(input);
            return myBitmap;
        } catch (IOException e) {
            // Log exception
            return null;
        }
    }
}