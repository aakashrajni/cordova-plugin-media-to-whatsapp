package com.aakash.cordova.plugin.media.to.whatsapp;

 import android.content.Context;
 import android.content.Intent;

 import org.apache.cordova.CallbackContext;
 import org.apache.cordova.CordovaPlugin;
 import org.json.JSONArray;
 import org.json.JSONException;
 import android.net.Uri;
 import java.util.ArrayList;

 public class MediaToWhatsapp extends CordovaPlugin {
     
     public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
         try {
             if (action.equals("shareMedia")) {
                String url = args.getString(0);
                String text = args.getString(1);
                String package_name = args.getString(2);
                Uri uri = Uri.parse(url);
                Intent mediashare = new Intent(Intent.ACTION_SEND);        
                //"com.whatsapp"
                mediashare.setPackage(package_name);
                mediashare.putExtra(Intent.EXTRA_TEXT,text);
                mediashare.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                mediashare.setType("*/*");
                mediashare.putExtra(Intent.EXTRA_STREAM,uri);
                cordova.startActivityForResult(this,mediashare,1);
                callbackContext.success();
                return true;
             }
             callbackContext.error("Invalid action");
             return false;
         } catch(Exception e) {
             System.err.println("Exception: " + e.getMessage());
             callbackContext.error(e.getMessage());
             return false;
         }
     }
     public void onActivityResult(int requestCode, int resultCode, Intent data) {
         // Handle a result here if one set in the Activity class started
         System.out.println("Activity Result: " + resultCode); //-1 is RESULT_OK
         if (resultCode==cordova.getActivity().RESULT_OK) {
             System.out.println("All good!");
         }
     }     
 }