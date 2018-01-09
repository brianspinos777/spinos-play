package controllers;

// import play.mvc.Controller;
// import play.mvc.Result;

import play.mvc.*;

import views.html.*;

public class UsersController extends Controller{

    public Result index(){
        String name = "Erich";
        return ok(test.render("Tester", name)); // views/test.scala.html
    }

    public Result show(Integer id){
        return ok("Hello from show, id: " + id);
    }

    public Result _new(){
        return ok("Hello from _new");
    }

    public Result edit(Integer id){
        return ok("Hello from edit, id: " + id);
    }

    public Result create(){
        return ok("Hello from create");
    }

    public Result update(Integer id){
        return ok("Hello from update, id: " + id);
    }

    public Result destroy(Integer id){
        return ok("Hello from destroy, id: " + id);
    }

}
