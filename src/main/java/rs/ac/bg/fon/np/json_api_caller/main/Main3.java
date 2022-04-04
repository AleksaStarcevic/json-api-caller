package rs.ac.bg.fon.np.json_api_caller.main;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import rs.ac.bg.fon.np.json_api_caller.domen.NasaImage;

public class Main3 {

	public static void main(String[] args) {
		try (FileReader in = new FileReader("niz_objekata.json")) {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			List<NasaImage> nasaImages = Arrays.asList(gson.fromJson(in, NasaImage[].class));

			for (NasaImage img : nasaImages) {
				System.out.println(img);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
