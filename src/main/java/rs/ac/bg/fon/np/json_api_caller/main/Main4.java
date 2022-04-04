package rs.ac.bg.fon.np.json_api_caller.main;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Main4 {

	public static void main(String[] args) {
		JsonObject jsonObject = new JsonObject();

		jsonObject.addProperty("date", "1999-06-22");
		jsonObject.addProperty("media_type", "image");
		jsonObject.addProperty("explanation", "Picture of Curiosity Rover");
		jsonObject.addProperty("title", "Nasa Rover");
		jsonObject.addProperty("url", "https://api.nasa.gov/");

		try (FileWriter out = new FileWriter("rucni_upis.json")) {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			out.write(gson.toJson(jsonObject));
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
