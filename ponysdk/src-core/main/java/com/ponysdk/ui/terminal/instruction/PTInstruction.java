/*============================================================================
 *
 * Copyright (c) 2000-2015 Smart Trade Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of Smart Trade Technologies
 * Use is subject to license terms. Duplication or distribution prohibited.
 *
 *============================================================================*/
package com.ponysdk.ui.terminal.instruction;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONBoolean;
import com.google.gwt.json.client.JSONNumber;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.json.client.JSONValue;
import com.ponysdk.ui.terminal.model.ClientToServerModel;

/**
 * @author nvelin
 */
public class PTInstruction extends JSONObject {

    public PTInstruction() {
    }

    public PTInstruction(final JavaScriptObject javaScriptObject) {
        super(javaScriptObject);
    }

    public void setObjectID(final int objectID) {
        put(ClientToServerModel.OBJECT_ID, objectID);
    }

    public int getObjectID() {
        return (int) get(ClientToServerModel.OBJECT_ID.toStringValue()).isNumber().doubleValue();
    }

    public void put(final ClientToServerModel key) {
        put(key, "");
    }

    public void put(final ClientToServerModel key, final boolean value) {
        put(key.toStringValue(), JSONBoolean.getInstance(value));
    }

    public void put(final ClientToServerModel key, final int value) {
        put(key.toStringValue(), new JSONNumber(value));
    }

    public void put(final ClientToServerModel key, final double value) {
        put(key.toStringValue(), new JSONNumber(value));
    }

    public void put(final ClientToServerModel key, final String value) {
        put(key.toStringValue(), new JSONString(value));
    }

    public void put(final ClientToServerModel key, final JavaScriptObject value) {
        put(key.toStringValue(), new JSONObject(value));
    }

    public JSONValue put(final ClientToServerModel key, final JSONValue jsonValue) {
        return put(key.toStringValue(), jsonValue);
    }

}
