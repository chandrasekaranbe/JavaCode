package com.footballstandings.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.footballstandings.DTO.CountryDTO;
import com.footballstandings.model.Standings;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FootballStandingsService {

    @Value("${external.football-api.base-url}")
    private String apiBaseUrl;

    @Value("${external.football-api.key}")
    private String apiKey;

    private final static String API_KEY = "9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978";

    @Autowired(required = true)
    RestTemplate restTemplate;


    public Optional<Standings> getStandings(String country, String league, String team) {

        String url = apiBaseUrl + "?action=get_events&APIkey=" + apiKey + "&league_id=";
        if (league != null) {
            url = url + league;
        }
        System.out.println("Final API_URL ******* " + url);
        Standings[] response = restTemplate.getForObject(url, Standings[].class);

        if (response != null && response.length > 0) {
            return Optional.of(response[0]);
        }
        return Optional.empty();
    }

    public static List<CountryDTO> getCountries(FootballStandingsService footballStandingsService, String country) throws JsonProcessingException {

        String url = footballStandingsService.apiBaseUrl + "?action=get_countries&APIkey=" + footballStandingsService.apiKey;
        System.out.println("Final API_URL ******* " + url);
        String response = footballStandingsService.restTemplate.getForObject(url, String.class);


        ObjectMapper objectMapper = new ObjectMapper();
        try {
            if (response != null && response.length() > 0) {
                List<CountryDTO> countries = objectMapper.readValue(response, new TypeReference<List<CountryDTO>>() {});
                System.out.println("Response ********* : " + countries);
                return countries;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private Standings getOfflineStandings(String country, String league, String team) {
        // Implement offline logic

        return null;
    }
}
