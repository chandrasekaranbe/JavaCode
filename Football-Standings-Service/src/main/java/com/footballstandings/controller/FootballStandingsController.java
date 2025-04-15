package com.footballstandings.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.footballstandings.model.Standings;
import com.footballstandings.service.FootballStandingsService;
import com.footballstandings.service.FootballStandingsServiceImpl;
import com.footballstandings.service.RedisService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/standings")
@RequiredArgsConstructor
public class FootballStandingsController {

    @Autowired
   FootballStandingsService service;

    @Autowired
    FootballStandingsServiceImpl serviceImpl;


    @GetMapping("/")
    public ResponseEntity<?> getStandings(@RequestParam(required = false) String country,
                          @RequestParam(required = false) String league,
                          @RequestParam(required = false) String team ) {

        Optional<Standings> result = service.getStandings(country, league, team);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/v1")
    public ResponseEntity<?> getStandingsV1(@RequestParam(required = false) String country,
                                          @RequestParam(required = false) String league,
                                          @RequestParam(required = false) String team ) throws JsonProcessingException {

        Optional<Standings> result = serviceImpl.getStandings(country, league, team);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }



}
