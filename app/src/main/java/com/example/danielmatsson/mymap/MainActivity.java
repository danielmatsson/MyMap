package com.example.danielmatsson.mymap;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.esri.android.map.GraphicsLayer;
import com.esri.android.map.MapView;
import com.esri.core.geometry.Point;
import com.esri.core.map.Graphic;
import com.esri.core.symbol.SimpleMarkerSymbol;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get MapView from layout XML
// Alternatively, create new MapView object, set a basemap, then call setContentView(mMapView);
        MapView mMapView = (MapView) findViewById(R.id.map);
// Create and add a GraphicsLayer
        GraphicsLayer graphicsLayer = new GraphicsLayer();
        mMapView.addLayer(graphicsLayer);

        // create a point marker symbol (red, size 10, of type circle)
        SimpleMarkerSymbol simpleMarker = new SimpleMarkerSymbol(Color.RED, 10, SimpleMarkerSymbol.STYLE.CIRCLE);

// create a point at x=-302557, y=7570663 (for a map using meters as units; this depends         // on the spatial reference)
        // Detta är i metersystem
        Point pointGeometry = new Point(-302557, 7570663);

// create a graphic with the geometry and marker symbol
        Graphic pointGraphic = new Graphic(pointGeometry, simpleMarker);

// add the graphic to the graphics layer
        graphicsLayer.addGraphic(pointGraphic);
    }
}
