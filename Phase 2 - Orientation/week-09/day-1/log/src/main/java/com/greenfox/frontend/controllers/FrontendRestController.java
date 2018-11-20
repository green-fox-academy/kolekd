package com.greenfox.frontend.controllers;

import com.greenfox.frontend.models.*;
import com.greenfox.frontend.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.HashMap;

@org.springframework.web.bind.annotation.RestController
public class FrontendRestController {

    LogRepository repo;

    @Autowired
    public FrontendRestController(LogRepository repo){
        this.repo = repo;
    }

    @GetMapping("/doubling")
    public Object doubling(@RequestParam(required = false) Integer input){
        Object response;
        if (input != null && input > 0) {
            response = new Doubling(input);
            repo.save(new Log("/doubling", ((Doubling) response).acquireData()));
        } else {
            response = new ErrorMessages("Please provide an input!");
        }
        return response;
    }

    @GetMapping("/greeter")
    public Object greeter (@RequestParam(required = false) String name,
                            @RequestParam(required = false) String title){
        Object response;

        if (name.length() < 1 && title.length() < 1){
            response = new ErrorMessages( "Please provide a name and a title!");
        } else if (name.length() < 1){
            response = new ErrorMessages( "Please provide a name!");
        } else if (title.length() < 1){
            response = new ErrorMessages( "Please provide a title!");
        } else {
            response = new Greeter(name, title);
            repo.save(new Log("/greeter", ((Greeter) response).acquireData()));
        }
        return response;
    }

    @GetMapping("appenda/{appendable}")
    public Object appenda (@PathVariable String appendable){
        Object response;
        if (appendable.length() > 0) {
            response = new AppendA(appendable);
            repo.save(new Log("/appenda/" + appendable, ((AppendA) response).acquireData()));
        } else {
            response = null;
        }
        return response;
    }

    @PostMapping("/dountil/{action}")
    public Object doUntil (@PathVariable String action, @RequestBody(required = false) HashMap<String, Integer> input) {
        Object response;
        if (!input.equals(null)) {
            response = new DoUntil(input.get("until"), action);
        } else {
            response = new ErrorMessages("Please provide a number!");
        }
        return response;
    }

    @PostMapping("/arrays")
    public Result arrays (@RequestBody(required = false) SumMultiplyDouble input){
        Result result = new Result();
        int sumSum = 0;
        int multiplySum = 1;

        for (int i = 0; i < input.getNumbers().length; i++){
            if (input.getWhat().equals("sum")){
                sumSum += input.getNumbers()[i];
                result.setResult(sumSum);
            } else if (input.getWhat().equals("multiply")) {
                multiplySum *= input.getNumbers()[i];
                result.setResult(multiplySum);
            } else if (input.getWhat().equals("double")) {
                input.getNumbers()[i] *= 2;
                result.setResult(input.getNumbers());
            }
        }


        return result;
    }

}
