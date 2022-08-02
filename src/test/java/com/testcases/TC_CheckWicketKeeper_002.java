package com.testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TC_CheckWicketKeeper_002 extends BaseClass {
	
	//Test case to validate there is at least one wicket-keeper
	@Test
	public void CheckWicketKeeper()
	{
		int wicket_keeper = 0;
		for(Player player:Teamlist)
		{
		String Role = player.role;
			if(Role.equals("Wicket-keeper"))
			{
				wicket_keeper++;
			}
		}
		System.out.println("No of wicket_Keepers"+ wicket_keeper);
		if(wicket_keeper>0)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
}
