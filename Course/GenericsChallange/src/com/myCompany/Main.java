package com.myCompany;

public class Main {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrow = new Team<>("Adelaide Crow");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        footballLeague.add(adelaideCrow);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);
//        footballLeague.add(baseballTeam);

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrow, 3, 8);

        adelaideCrow.matchResult(fremantle, 2, 1);

        footballLeague.showLeagueTable();
    }
}
