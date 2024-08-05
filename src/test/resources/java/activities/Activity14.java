package activites;

import java.io.File;


public class Activity14 {

	public static void main(String[] args) {
		try {
            File file = new File("src/session4/newfile.txt");
            boolean fStatus = file.createNewFile();
            if(fStatus) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("Filjava -version"
                		+ "e already exists at this path.");
            }
            File fileUtil = FileUtils.getFile("src/session4/newfile.txt");
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));
            File destDir = new File("resources");
            fileUtil.copyFileToDirectory(file, destDir);
            File newFile = FileUtils.getFile(destDir, "newfile.txt");
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
            System.out.println("Data in new file: " + newFileData);
        } catch(IOException errMessage) {
            System.out.println(errMessage);
        }

	}

}
