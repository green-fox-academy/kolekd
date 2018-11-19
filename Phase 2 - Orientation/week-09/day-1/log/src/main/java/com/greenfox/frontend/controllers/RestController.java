package com.greenfox.frontend.controllers;

import com.greenfox.frontend.models.Result;
import com.greenfox.frontend.models.SumMultiplyDouble;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/doubling")
    public HashMap<String, Object> doubling(@RequestParam(required = false) Integer input){
        HashMap<String, Object> response = new HashMap<>();

        if (input != null) {
            int result = input * 2;

            response.put("received", input);
            response.put("result", result);
        } else {
            response.put("error", "Please provide an input!");
        }
        return response;
    }

    @GetMapping("/greeter")
    public HashMap<String, String> greeter (@RequestParam(required = false) String name,
                                            @RequestParam(required = false) String title){

        HashMap<String, String> response = new HashMap<>();

        System.out.println("Name: " + name + "  Title: " + title);

        if (name.length() < 1 && title.length() < 1){
            response.put("error", "Please provide a name and a title!");
        } else if (name.length() < 1){
            response.put("error", "Please provide a name!");
        } else if (title.length() < 1){
            response.put("error", "Please provide a title!");
        } else {
            response.put("welcome_message", "Oh, hi there " + name + ", my dear " + title + "!");
        }
        return response;
    }

    @GetMapping("appenda/{appendable}")
    public HashMap<String, String> appenda (@PathVariable String appendable){
        HashMap<String, String> response = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder(appendable);

        if (appendable.length() > 0){
            stringBuilder.append("a");
            response.put("appended", stringBuilder.toString());
        }

        return response;
    }

    @PostMapping("/dountil/{action}")
    public HashMap<String, Object> dountil (@PathVariable String action,
                                            @RequestBody(required = false) HashMap<String, Integer> input){
        HashMap<String, Object> response = new HashMap<>();
        if (!input.equals(null)) {
            if (action.equals("sum")) {
                int sum = 0;
                for (int i = 1; i <= input.get("until"); i++) {
                    sum += i;
                }
                response.put("result", sum);
            } else if (action.equals("factor")) {
                int sum = 1;
                for (int i = 1; i <= input.get("until"); i++) {
                    sum *= i;
                }
                response.put("result", sum);
            }
        } else {
            response.put("error", "Please provide a number!");
        }
        return response;
    }

    @PostMapping("/arrays")
    public Result arrays (@RequestBody(required = false) SumMultiplyDouble input){
        Result result = new Result();

        for (int i = 0; i < input.getNumbers().length; i++){
            if (input.getWhat().equals("sum")){
                int sum = 0;
                sum += input.getNumbers()[i];
                result.setResult(sum);
            } else if (input.getWhat().equals("multiply")) {
                int sum = 1;
                sum *= input.getNumbers()[i];
                result.setResult(sum);
            } else if (input.getWhat().equals("double")) {
                input.getNumbers()[i] *= 2;
                result.setResult(input.getNumbers());
            }
        }
        return result;
    }

}
