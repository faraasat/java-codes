package com.myCompany;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrow = new Team<>("Adelaide Crow");
        adelaideCrow.addPlayer(joe);
//        adelaideCrow.addPlayer(pat);
//        adelaideCrow.addPlayer(beckham);

        System.out.println(adelaideCrow.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

//        Team<String> brokenTeam = new Team<>("This won't work");
//        brokenTeam.addPlayer("no-one");

        Team<SoccerPlayer> soccerTeam = new Team<>("Soccer");
        soccerTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrow, 3, 8);

        adelaideCrow.matchResult(fremantle, 2, 1);

        System.out.println("Rankings");
        System.out.println(adelaideCrow.getName() + ": " + adelaideCrow.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrow.compareTo(melbourne));
        System.out.println(adelaideCrow.compareTo(hawthorn));

        System.out.println(hawthorn.compareTo(adelaideCrow));
        System.out.println(melbourne.compareTo(fremantle));
    }
}