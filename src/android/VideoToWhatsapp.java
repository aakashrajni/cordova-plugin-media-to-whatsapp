package com.aakash.cordova.plugin.video.to.whatsapp;

 import android.content.Context;
 import android.content.Intent;

 import org.apache.cordova.CallbackContext;
 import org.apache.cordova.CordovaPlugin;
 import org.json.JSONArray;
 import org.json.JSONException;

 import java.util.ArrayList;

 public class VideoToWhatsapp extends CordovaPlugin {
     public ArrayList itemsList = new ArrayList();
     public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
         try {
             if (action.equals("shareVideo")) {
                String url = args.getString(0);
                String package = args.getString(1);
                // Intent sendIntent = new Intent();
                // sendIntent.setAction(Intent.ACTION_SEND);
                // sendIntent.putExtra(Intent.EXTRA_TEXT,sharetext);
                // sendIntent.setType(item);
                // cordova.startActivityForResult(this,sendIntent,1);
                Uri uri = url;
                Intent videoshare = new Intent(Intent.ACTION_SEND);
                videoshare.setType("*/*");
                //"com.whatsapp"
                videoshare.setPackage(package);
                videoshare.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                videoshare.putExtra(Intent.EXTRA_STREAM,uri);
                cordova.startActivityForResult(this,videoshare,1);

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