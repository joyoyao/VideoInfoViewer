/**
 * Copyright (c) 2016 Rory Hool
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

package com.roryhool.videoinfoviewer;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;


public class MainActivity extends AppCompatActivity {

   protected Toolbar     mToolbar;
   protected FrameLayout mAdFrame;

   @Override
   public void onCreate( Bundle savedInstanceState ) {
      super.onCreate( savedInstanceState );

      setContentView( R.layout.activity_main );

      mAdFrame = (FrameLayout) findViewById( R.id.adFrame );
      mToolbar = (Toolbar) findViewById( R.id.toolbar );

      if ( savedInstanceState == null ) {
         FragmentManager manager = getSupportFragmentManager();
         FragmentTransaction fragTransaction = manager.beginTransaction();
         fragTransaction.add( R.id.fragment_frame, new RecentVideosFragment() );
         fragTransaction.commit();
      }

      setSupportActionBar( mToolbar );
   }

   @Override
   public void onStart() {
      super.onStart();

      if ( !BuildConfig.DEBUG ) {
      }

   }

}
