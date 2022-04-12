package com.krishantha.rentacar.demoapplication;

import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id = "stage")
public class StageEndPoint {

    Map<String,Stage> stages = new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String,Stage> getAllStages(){
        return stages;
    }
    @ReadOperation
    public Stage getStage(@Selector String name){
        return stages.get(name);
    }
    @WriteOperation
    public void setStageValue(@Selector String name,@RequestBody int value){
        stages.put(name,new Stage(value));
    }

    @DeleteOperation
    public void removeStage(@Selector String name){
        stages.remove(name);
    }


    static class Stage{
        int value;

        public Stage(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
