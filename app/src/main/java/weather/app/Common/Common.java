package weather.app.Common;

import android.support.annotation.NonNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by reale on 05/10/2016.
 */

public class Common {
    public static String API_KEY = "b70cda1431f34c18172b4885b3b658a2";
    public static String API_LINK = "http://api.openweathermap.org/data/2.5/weather";

    @NonNull
    //Function to create functional link to the API path
    public static String apiRequest(String lat, String lng){
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric",lat,lng,API_KEY));
        return sb.toString();
    }
    //Function to convert unix time stamp to Date type format: HH:mm
    public static String unixTimeStampToDateTime(double unixTimeStamp){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long)unixTimeStamp*1000);
        return dateFormat.format(date);
    }
    //Function to get link image from OpenWebApp
    public static String getImage(String icon){
        return String.format("http://openweathermap.org/img/w/%s.png",icon);
    }
    //Function to format the date: "dd MMMM yyyy HH:mm"
    public static String getDateNow(){
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }
}

