import java.io.File;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SecondAssignment {
	static Map<String, String> months = null;
	static {
		months = new HashMap<String, String>();
			months.put("0", "Jan");
			months.put("1", "Feb");
			months.put("2", "Mar");
			months.put("3", "Apr");
			months.put("4", "May");
			months.put("5", "Jun");
			months.put("6", "Jul");
			months.put("7", "Aug");
			months.put("8", "Sep");
			months.put("9", "Oct");
			months.put("10", "Nov");
			months.put("11", "Dec");
	}

	private void countAndPrintFileCountsByCreationOfMonth(String str){
		try {
			File directoryPath = new File(str);
			BasicFileAttributes attributes = null;
			File filesList[] = directoryPath.listFiles();
			Map<String, Object> details = new HashMap<String, Object>();
			for (File file : filesList) {
				attributes = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
				Date creationDate = new Date(attributes.creationTime().toMillis());
				String month = months.get(String.valueOf(creationDate.getMonth()));
				details.put(month, details.get(month) == null ? 1 : Integer.parseInt(details.get(month).toString())+1);
			}
			System.out.println(details);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public static void main(String []args) {
		if(args.length == 0) {
			System.out.println("You have not provided directory name.");
			return;
		}
		new SecondAssignment().countAndPrintFileCountsByCreationOfMonth(args[0]);
	}

}