/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.support.room;

import android.content.Context;

import com.android.support.db.SupportSQLiteOpenHelper;

/**
 * Configuration class for {@link RoomDatabase}.
 */
public class DatabaseConfiguration {
    /**
     * The factory to use to access the database.
     */
    @SuppressWarnings("WeakerAccess")
    public final SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory;
    /**
     * The context to you.
     */
    @SuppressWarnings("WeakerAccess")
    public final Context context;
    /**
     * The name of the database or null if it is in memory.
     */
    @SuppressWarnings("WeakerAccess")
    public final String name;
    /**
     * The version of the database.
     */
    public final int version;

    DatabaseConfiguration(Context context, String name, int version,
                                  SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory) {
        this.sqliteOpenHelperFactory = sqliteOpenHelperFactory;
        this.context = context;
        this.name = name;
        this.version = version;
    }
}
