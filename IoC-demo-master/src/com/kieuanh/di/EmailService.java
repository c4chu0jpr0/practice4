package com.kieuanh.di;

public class EmailService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Đây là chỗ triển khai Email");
    }
}

