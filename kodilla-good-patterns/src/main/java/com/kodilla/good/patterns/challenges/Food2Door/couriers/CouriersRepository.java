package com.kodilla.good.patterns.challenges.Food2Door.couriers;

import com.kodilla.good.patterns.challenges.Food2Door.user.User;

import java.util.ArrayList;
import java.util.List;

public class CouriersRepository {

    public static List<User> getFreeCouriers() {

        List<User> couriers = new ArrayList<>();
        couriers.add(new User("Jarek", "dasda"));
        couriers.add(new User("Fryc", "uyy"));
        return couriers;
    }
}
