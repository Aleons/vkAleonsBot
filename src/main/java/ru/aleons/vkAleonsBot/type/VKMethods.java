package ru.aleons.vkAleonsBot.type;
import ru.aleons.vkAleonsBot.method.HTTPMethod;

public class VKMethods {

    public HTTPMethod messagesSend(String message, String accessToken, long userId, double apiVersion){
        String replaceMessage =  message.replace(" ","%20");
        String request = "https://api.vk.com/method/messages.send?message="+replaceMessage+"&access_token="+accessToken+"&user_id="+userId+"&v="+apiVersion;
        return new HTTPMethod(request);
    }

    public HTTPMethod userGet(String accessToken, long userId, double apiVersion){
        String request = "https://api.vk.com/method/users.get?user_ids="+userId+"&access_token="+accessToken+"&v="+apiVersion;
        return new HTTPMethod(request);
    }



}
