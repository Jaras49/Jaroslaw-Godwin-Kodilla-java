package com.kodilla.good.patterns.challenges.Food2Door.couriers;

import com.kodilla.good.patterns.challenges.Food2Door.user.User;

import java.util.List;

public class CouriersService {
    private List<User> availableCouriers;

    public CouriersService(){
        availableCouriers = CouriersRepository.getFreeCouriers();
    }

    public User getCourier() {

        User user = availableCouriers.get(availableCouriers.size() - 1);

        return user;
    }
}
