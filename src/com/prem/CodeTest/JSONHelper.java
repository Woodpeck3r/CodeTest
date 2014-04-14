package com.prem.CodeTest;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONHelper {

  public static JSONObject jsonObject = new JSONObject();

  static {
    try {
      jsonObject.put("you", "u");
      jsonObject.put("what", "wat");
      jsonObject.put("your", "ur");
      jsonObject.put("doing", "dng");
      jsonObject.put("please", "pls");
      jsonObject.put("sorry", "sry");
      jsonObject.put("office", "ofc");
      jsonObject.put("going", "gng");
      jsonObject.put("whats", "wats");
      jsonObject.put("are", "r");
      jsonObject.put("how", "hw");


      /*We can map more words here*/

    } catch (JSONException e) {
      Log.e("Json Exception:", e.getMessage());
    }

  }


}
