package com.drone.feature;

import android.app.Activity;
import android.os.Bundle;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.mapview.MapView;

public class MapActivity extends Activity {

    private MapView mapview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_map);
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.mapview);
        MapKitFactory.setApiKey("00331a2b-dc91-4c46-a74d-a2a685daac5e");
        MapKitFactory.initialize(this);

        mapview = (MapView)findViewById(R.id.mapview);
        mapview.getMap().move(
                new CameraPosition(new Point(55.751574, 37.573856), 11.0f, 0.0f, 0.0f),
                new Animation(Animation.Type.SMOOTH, 0),
                null);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mapview.onStop();
        MapKitFactory.getInstance().onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mapview.onStart();
        MapKitFactory.getInstance().onStart();
    }
}
