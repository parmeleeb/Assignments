package com.skillstorm.athletes;

import java.util.Comparator;

public class WinLossRatioComparator implements Comparator<Athlete>{

	@Override
	public int compare(Athlete athlete1, Athlete athlete2) {
		int athlete1TotalGames = 0;
		int athlete2TotalGames = 0;
		double athlete1WinPercent = 1.0;
		double athlete2WinPercent = 1.0;
		if (athlete1 == null || athlete2 == null) {
			throw new NullPointerException("cannot compare null Athletes");
		} 
		athlete1TotalGames = athlete1.getCareerWins() + 
							 athlete1.getCareerLosses();
		athlete2TotalGames = athlete2.getCareerWins() + 
							 athlete2.getCareerLosses();
		if (athlete1TotalGames >= 30 || athlete2TotalGames >= 30) {
			return athlete1.getCareerWins() - athlete2.getCareerWins();
		}
		athlete1WinPercent = athlete1.getCareerWins() / athlete1TotalGames;
		athlete2WinPercent = athlete2.getCareerWins() / athlete2TotalGames;
		if (athlete1WinPercent >= athlete2WinPercent) {
			return 1;
		} else { return -1;}
	}
}
