package com.wan3761;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wan3761.GameObjects.GameCharacter;
import com.wan3761.GameObjects.GameStyleCard;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @author wan3761
 * @date ${DATE}
 * @apiNote
 */
public class Main {

    public static void downloadCharactersJsonFromDb() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://master.hbr.quest/characters.json"))
                .header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36 Edg/137.0.0.0")
                .GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("./characters.json"));
        byte[] b = response.body().getBytes();

        bufferedOutputStream.write(b);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();

    }


    public static void developing() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE);
        objectMapper.enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);

        GameCharacter[] character = objectMapper.readValue(new File("characters.json"), GameCharacter[].class);

        for(GameCharacter g : character){
            if (!"AliceA".equals(g.getLabel())){
                continue;
            }
            for (GameStyleCard c : g.getCards()) {
                if (1020103 != c.getId()) {
                    continue;
                }
                System.out.println(c);
            }
        }

    }


/*
    public static void dealFuckingEFromJson() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE);
        objectMapper.enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);

        GameCharacter[] character = objectMapper.readValue(new File("characters.json"), GameCharacter[].class);

        Set<String> es = new HashSet<>();

        for(GameCharacter g : character){
            for (GameStyleCard c : g.getCards()) {
                for (GamePassiveSkill s : c.getPassives()) {
                    for (List<String> e : s.getE()) {
                        es.addAll(e);
                    }
                }
            }
        }
        System.out.println(es);
    }
*/
    public static void main(String[] args) throws Exception {
        //dealFuckingEFromJson();
        developing();
    }

}