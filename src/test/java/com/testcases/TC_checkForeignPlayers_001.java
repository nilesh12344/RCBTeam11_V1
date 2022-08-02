package com.testcases;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_checkForeignPlayers_001 extends BaseClass{

	//Test case to check for total no of Indians and Foreign Players
	@Test
	public void checkForeignPlayer()
	{
		int totalPlayer = Teamlist.size();
		int IndianPlayers=0;
		int ForeignPlayers=0;
	
		for(Player player:Teamlist)
		{
		String Country = player.country;
			if(Country.equals("India"))
			{
				IndianPlayers++;	
			}
		}
		ForeignPlayers= totalPlayer-IndianPlayers;
		System.out.println("No of Indian Players :" + IndianPlayers);
		System.out.println("No of Foreign Player :"+ ForeignPlayers);
		if(ForeignPlayers<=4)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		}
		
	}

