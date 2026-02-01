package com.priynshuchouhn.learn_spring_framework.examples.c1;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataService {
    public int[] retrieveData() {
        return new int[]{11,22,33,44,55,66};
    }
}
