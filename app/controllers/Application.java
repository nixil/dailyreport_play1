package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

@With(Security.class)
public class Application extends Controller {

    public static void index() {
        List<ReportItem> items = ReportItem.findAll();
        render(items);
    }

    public static void bootstrap(){
        render();
    }

}