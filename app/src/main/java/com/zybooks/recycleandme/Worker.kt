package com.zybooks.recycleandme

import android.content.Context
import androidx.annotation.NonNull
import androidx.work.Worker
import androidx.work.WorkerParameters
import android.app.NotificationChannel
import android.app.NotificationManager
import androidx.core.app.NotificationCompat
import android.os.Build

const val CHANNEL_ID_ENCOURAGE = "encourage_message"
const val NOTIFICATION_ID = 0

class UploadWorker(appContext: Context, workerParams: WorkerParameters):
Worker(appContext, workerParams) {

    private val notificationManager =
        appContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

    override fun doWork(): Result
    {



        // Indicate whether the work finished successfully with the Result
        return Result.success()
    }

    private fun createTimerNotificationChannel()
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = applicationContext.getString(R.string.channel_name)
            val description = applicationContext.getString(R.string.channel_description)
            val importance = NotificationManager.IMPORTANCE_LOW
            val channel = NotificationChannel(CHANNEL_ID_ENCOURAGE, name, importance)
            channel.description = description

            // Register channel with system
            notificationManager.createNotificationChannel(channel)
        }
    }

    private fun createTimerNotification(text: String) {

        // Create notification with various properties
        val notification = NotificationCompat.Builder(applicationContext, CHANNEL_ID_ENCOURAGE)
            .setSmallIcon(android.R.drawable.ic_dialog_info)
            .setContentTitle(applicationContext.getString(R.string.app_name))
            .setContentText(text)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .build()

        // Post notification
        notificationManager.notify(NOTIFICATION_ID, notification)
    }
}