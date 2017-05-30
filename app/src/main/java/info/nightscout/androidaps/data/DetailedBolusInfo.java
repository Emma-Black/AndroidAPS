package info.nightscout.androidaps.data;

import android.content.Context;

import org.json.JSONObject;

import java.util.Date;

import info.nightscout.androidaps.MainApp;
import info.nightscout.androidaps.db.CareportalEvent;
import info.nightscout.androidaps.db.Source;
import info.nightscout.androidaps.interfaces.InsulinInterface;

/**
 * Created by mike on 29.05.2017.
 */

public class DetailedBolusInfo {
    public long date = new Date().getTime();
    public InsulinInterface insulinInterface = MainApp.getConfigBuilder().getActiveInsulin();
    public String eventType = CareportalEvent.MEALBOLUS;
    public double insulin = 0;
    public double carbs = 0;
    public int source = Source.NONE;
    public double glucose = 0;             // Bg value in current units
    public String glucoseType = "";        // NS values: Manual, Finger, Sensor
    public int carbTime = 0;               // time shift of carbs in minutes
    public JSONObject boluscalc = null;    // additional bolus wizard info
    public Context context = null;         // context for progress dialog
    public boolean addToTreatments = true;
}