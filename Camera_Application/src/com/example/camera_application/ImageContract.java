package com.example.camera_application;

import android.provider.BaseColumns;

// Companion class, known as a contract class, which explicitly, 
// specifies the layout of your schema in a systematic and self-documenting way
public class ImageContract { 
	
	// To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public ImageContract() {}
    
    /* Inner class that defines the table contents */
    public static abstract class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "images";
        public static final String COLUMN_NAME_FILENAME = "image_filename";
        public static final String COLUMN_NAME_DESCRIPTION = "image_description";
        public static final String COLUMN_NAME_TIMESTAMP = "image_timestamp";
        public static final String COLUMN_NAME_LOCATION = "image_location";
    }

}
