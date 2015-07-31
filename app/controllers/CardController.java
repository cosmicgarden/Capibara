package controllers;

import play.*;
import play.mvc.*;
import play.libs.Json;

import views.html.*;

public class CardController extends Controller {

    public static class Test {
        public String name;
        public String password;
    }

    public Result testr() {
    	Test test = Json.fromJson(request().body().asJson(), Test.class);
    	return ok(Json.toJson(test));
    }

}
