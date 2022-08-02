package com.testcases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public JSONParser jsonparser = new JSONParser();
	public List<Player> Teamlist = new ArrayList<Player>();
	@BeforeClass
	public void ReadJOSNfile() throws IOException, ParseException {

		FileReader reader = new FileReader(".\\JSONFiles\\teamplayer.json");

		Object obj = jsonparser.parse(reader);

		JSONObject playerjsonobj = (JSONObject) obj;
		String name = (String) playerjsonobj.get("name");
		String location = (String) playerjsonobj.get("location");

		System.out.println("Team Name: " + name);
		System.out.println("Location : " + location);
		
		int id = 0;
		JSONArray playersarray = (JSONArray) playerjsonobj.get("player");
		for (int i = 0; i < playersarray.size(); i++) {
			JSONObject player = (JSONObject) playersarray.get(i);
			id = i;
			String playername = (String) player.get("name");
			String country = (String) player.get("country");
			String role = (String) player.get("role");
			String price = (String) player.get("price-in-crores");
			Teamlist.add(new Player(id, playername, country, role, price));
		}
	}

}
