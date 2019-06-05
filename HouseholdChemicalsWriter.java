package ua.lviv.iot.toolsforcleaning.seller;
import ua.lviv.iot.toolsforcleaning.model.*;

import java.io.*;
import java.util.List;

public class HouseholdChemicalsWriter {
	
	public void writeToFile(List<ToolsForCleaning> toolsForCleaning)
		   throws IOException {
			   File file = new File("Tools.csv");

		        try (FileOutputStream fos = new FileOutputStream(file);
		             OutputStreamWriter osw = new OutputStreamWriter(fos);
		             BufferedWriter bufferedWriter = new BufferedWriter(osw)) {

		            toolsForCleaning.stream().forEach(tools -> {
		                try {
		                    bufferedWriter.write(tools.getHeaders());
		                    bufferedWriter.newLine();
		                    bufferedWriter.write(tools.toCSV());
		                } catch (IOException exception) {
		                    exception.printStackTrace();
		                }
		            });
		        } finally {
		            System.out.println("All ");
		        }
		       }
	}