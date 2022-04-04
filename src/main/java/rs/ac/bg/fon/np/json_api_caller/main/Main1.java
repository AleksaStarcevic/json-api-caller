package rs.ac.bg.fon.np.json_api_caller.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import rs.ac.bg.fon.np.json_api_caller.domen.NasaImage;

public class Main1 {
	public static final String DATE = "1999-06-22";

	public static String readApiKey() throws FileNotFoundException {

		Scanner in = new Scanner(new FileReader("api_key.properties"));
		return in.next();

	}

	public static void main(String[] args) {

		try {

			URL url = new URL("https://api.nasa.gov/planetary/apod?api_key=" + readApiKey() + "&date=" + DATE);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			con.setRequestMethod("GET");

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			NasaImage nasaImage = gson.fromJson(in, NasaImage.class);
			System.out.println(nasaImage);
			in.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
