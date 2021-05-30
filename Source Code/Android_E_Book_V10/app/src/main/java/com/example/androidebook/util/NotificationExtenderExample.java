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

}