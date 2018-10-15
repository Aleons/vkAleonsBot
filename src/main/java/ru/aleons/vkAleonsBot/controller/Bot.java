package ru.aleons.vkAleonsBot.controller;
import org.springframework.web.bind.annotation.*;
import ru.aleons.vkAleonsBot.act.ToMessage;
import ru.aleons.vkAleonsBot.model.Message;

@RestController
public class Bot {
    private String secKey = "homeTest";
    private int group_id = 172491478;

    @RequestMapping(value = "/", method = RequestMethod.POST, headers = {"Content-type=application/json"})
    public String startBot(@RequestBody Message message) {
        switch (message.getType()) {
            case "confirmation":
                return "b637c38b";
            case "message_reply":
                return "ok";
            case "message_new":
                new ToMessage().go(message);
                return "ok";
            default:
                return "ok";
        }
    }

}
