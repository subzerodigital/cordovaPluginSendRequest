package com.subzerodigital;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import android.widget.Toast;
import android.util.Log;
import android.app.Activity;
import android.content.Intent;


public class SendRequestPlugin extends CordovaPlugin
{

    //define actions
    public static final String PASS_PERSON_INFO = "passPersonInfo";
    public static final String PASS_VEHICLE_INFO = "passVehicleInfo";

    public SendRequestPlugin(){

    }

	/*
        @Override
        public void initialize(CordovaInterface cordova, CordovaWebView webView) {
            super.initialize(cordova, webView);
            // your init code here
        }
    */

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException{

        cordova.getActivity().runOnUiThread(new Runnable() {
            public void run() {
                Toast.makeText(webView.getContext(), "plugin running my own", Toast.LENGTH_SHORT).show();
            }
        });
            //Toast.makeText(cordova.getActivity().getApplicationContext(),"plugin running",Toast.LENGTH_SHORT).show();

/*
        try {
            if (PASS_PERSON_INFO.equals(action)) {
                JSONObject arg_object = args.getJSONObject(0);

                //define a intent
                Intent reqestIntent = new Intent(Intent.ACTION_SEND_MULTIPLE)

                        .setType("vnd.android.cursor.item/event")

                        .putExtra("firstName", arg_object.getString("firstName"))
                        .putExtra("lastName", arg_object.getString("lastName"))
                        .putExtra("address1", arg_object.getString("address1"))
                        .putExtra("address2", arg_object.getString("address2"));

                //this.cordova.getActivity().startActivity(reqestIntent);
                //show some log and toast

                //Toast.makeText(this.cordova.getActivity().getApplicationContext(),"plugin running",Toast.LENGTH_SHORT).show();
                Log.i("PLUGIN","plugin is working! "+arg_object.getString("firstName"));

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

*/
            return true;
        }

    }