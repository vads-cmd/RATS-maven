package org.tests.rats.workers;

import com.google.gson.JsonObject;
import io.restassured.specification.RequestSpecification;

public class RestRequest {

    public JsonObject headers;
    public JsonObject params;
    public JsonObject query;
    public JsonObject cookie;
    public RequestSpecification httpRequest;

}
