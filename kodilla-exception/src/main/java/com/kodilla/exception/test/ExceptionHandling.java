package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) throws MyOwnIllegalArgumentException {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {

            secondChallenge.probablyIWillThrowException(2, 3);

        } catch (Exception e) {

            throw new MyOwnIllegalArgumentException("Podano złe argumenty");
        }
    }
}
class MyOwnIllegalArgumentException extends Exception{

    public MyOwnIllegalArgumentException(String message){
        super(message);

    }

}
