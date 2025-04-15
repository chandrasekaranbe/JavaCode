package com.footballstandings.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.footballstandings.DTO.CountryDTO;
import com.footballstandings.model.Country;
import com.footballstandings.model.Standings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class FootballStandingsServiceImpl {

    @Autowired FootballStandingsService footballStandingsService;

    public Optional<Standings> getStandings(String country, String league, String team) throws JsonProcessingException {

            if (country !=null){
               List<CountryDTO> countryDto =  FootballStandingsService.getCountries(footballStandingsService, country);

               for(CountryDTO countryDTO : countryDto){
                   Country country1 = new Country();
                   country1.setId(countryDTO.getCountry_id());
                   country1.setName(countryDTO.getCountry_name());
                   Standings standings = new Standings();
                   standings.setCountry(country1);
                   return Optional.of(standings);
               }
            } else if (league != null) {

            } else if (team != null) {

            }

        return Optional.empty();
    }
}
