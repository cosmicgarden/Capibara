package controllers;

import play.*;
import play.mvc.*;
import play.libs.Json;
import views.html.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.common.collect.Lists;

import models.PlinianCard;

public class Testjson extends Controller {

    
    public Result testr() {
    	//TestPlinianCard test = Json.fromJson(request().body().asJson(), TestPlinianCard.class);
    	PlinianCard test = new PlinianCard();
    	//String[] alternateIdentifiers = {"Oscar", "Javier", "Jon"};
    	//String[] keys = {"ficha", "especies"};
    	List<String> alternateIdentifiers = new ArrayList<String>();
    	alternateIdentifiers.add("Oscar");
    	alternateIdentifiers.add("Javier");
    	alternateIdentifiers.add("Jon");
    	List<String> keys = new ArrayList<String>();
    	keys.add("ficha");
    	keys.add("especies");
    	test.setAlternateIdentifiers(alternateIdentifiers);
    	test.setContact("Oscar Duque");
    	//test.setCreator("Javier Duke");
    	test.setCreator();
    	test.setDatasetID("1487");
    	Date date = new Date();
    	test.setDateStamp(date);
    	test.setDescription("Esto es una ficha");
    	test.setKeywords(keys);
    	return ok(Json.toJson(test));
    }
    
    public Result persistence(){
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("twingo");
    	//return ok(Json.toJson(test));
    }

}
