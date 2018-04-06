package com.kodilla.good.patterns.challenges.Food2Door.informationService;

import com.kodilla.good.patterns.challenges.Food2Door.user.User;

public class SmsInformationService implements InformationService {


    @Override
    public void inform(User user) {
        System.out.println("Mr/Ms " + user.getName() + " We are preparing your order");
    }
}
