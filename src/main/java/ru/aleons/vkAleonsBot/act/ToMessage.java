package ru.aleons.vkAleonsBot.act;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.aleons.vkAleonsBot.model.Message;
import ru.aleons.vkAleonsBot.model.Users;
import ru.aleons.vkAleonsBot.type.VKMethods;

import java.io.IOException;

public class ToMessage {

    private Users users;
    private String tocken = "тут токен";
    private double apiVersion = 5.50;

    public void go(Message message){
        String mess;
        ObjectMapper mapper = new ObjectMapper();
        try {
            users = mapper.readValue(new VKMethods().userGet(tocken, message.getObject().getUser_id(), apiVersion).GET(), Users.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch (message.getObject().getBody()){
            case "Привет":
                mess = "Привет, "+users.getResponses().get(0).getFirstName()+"!";
                new VKMethods().messagesSend(mess,tocken, message.getObject().getUser_id(), apiVersion).GET();
                break;
            case "Пока":
                mess = "Пока, "+users.getResponses().get(0).getFirstName()+"!";
                new VKMethods().messagesSend(mess,tocken, message.getObject().getUser_id(), apiVersion).GET();
                break;
            default:
                mess = users.getResponses().get(0).getFirstName()+", на данный момент компания Aleons Group меня научила только здороваться и прощаться. Напишите мне Привет или Пока";
                new VKMethods().messagesSend(mess,tocken, message.getObject().getUser_id(), apiVersion).GET();
                break;
        }
    }


}
