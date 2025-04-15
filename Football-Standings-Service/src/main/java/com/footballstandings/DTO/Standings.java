package com.footballstandings.DTO;

import com.footballstandings.model.Team;
import lombok.Data;

@Data
public class Standings {
    private CountryDTO country;
    private League league;
    private Team team;
    private int position;
}
