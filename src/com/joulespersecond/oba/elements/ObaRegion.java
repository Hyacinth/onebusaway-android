/*
 * Copyright (C) 2013 Paul Watts (paulcwatts@gmail.com)
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
package com.joulespersecond.oba.elements;



/**
 * Specifies a region in the OneBusAway multi-region system.
 */
public interface ObaRegion {
    /**
     * Specifies a single bound rectangle within this region.
     */
    public interface Bounds {
        public double getLat();
        public double getLon();
        public double getLatSpan();
        public double getLonSpan();
    }

    /**
     * @return The ID of this region.
     */
    public long getId();

    /**
     * @return The name of the region.
     */
    public String getName();

    /**
     * @return true if this server is active and should be presented in a list of working servers, false otherwise.
     */
    public boolean getActive();

    /**
     * @return The base OBA URL for this region, or null if it doesn't have a base OBA URL.
     */
    public String getObaBaseUrl();

    /**
     * @return The base SIRI URL for this region, or null if it doesn't use SIRI.
     */
    public String getSiriBaseUrl();

    /**
     * @return An array of bounding boxes for the region.
     */
    public Bounds[] getBounds();

    /**
     * @return The primary language for this region.
     */
    public String getLanguage();

    /**
     * @return The name of the party responsible for this region's OBA server.
     */
    public String getContactName();

    /**
     * @return The email of the party responsible for this region's OBA server.
     */
    public String getContactEmail();

    /**
     * @return true if this server supports OBA discovery APIs, false otherwise.
     */
    public boolean getSupportsObaDiscovery();

    /**
     * @return true if this server supports OBA real-time APIs, false otherwise.
     */
    public boolean getSupportsObaRealtime();

    /**
     * @return true if this server supports SIRI real-time APIs, false otherwise.
     */
    public boolean getSupportsSiriRealtime();
}