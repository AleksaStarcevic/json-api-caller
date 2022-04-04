package rs.ac.bg.fon.np.json_api_caller.main;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import rs.ac.bg.fon.np.json_api_caller.domen.NasaImage;

public class Main2 {

	public static void main(String[] args) {
		NasaImage nasaImage1 = new NasaImage("2019-07-16", "image", "Picture of James Webb Telescope", "Telescope",
				"https://api.nasa.gov/");
		NasaImage nasaImage2 = new NasaImage("2018-11-12", "image", "Curiosity Rover", "Rover",
				"https://api.nasa.gov/");

		List<NasaImage> nasaImages = new LinkedList<NasaImage>();
		nasaImages.add(nasaImage1);
		nasaImages.add(nasaImage2);

		try (PrintWriter out = new PrintWriter(new FileWriter("niz_objekata.json"))) {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			out.print(gson.toJson(nasaImages));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
