package com.kieuanh.di;

public class SmsService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("day la cho trien khai SMS");
    }
}
