package algos.Algos_and_ds.miscellaneous;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ProblemGenerator {
	public static void main(String[] args) {
		Document doc = null;
		try {
			doc = Jsoup.connect("http://www.practice.geeksforgeeks.org/tag-page.php?tag=Amazon&isCmp=1").get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Elements tables = doc.getElementsByClass("col-sm-7").first().getElementsByTag("table");
		ArrayList<String> quesList = new ArrayList<String>();
		ArrayList<String> quesComplete = new ArrayList<String>();
		// add complete questions in this list
			quesComplete.add("Lowest Common Ancestor in a BST");
			quesComplete.add("Square root");
			quesComplete.add("Print all nodes that don’t have sibling");
			quesComplete.add("Root to leaf path sum");
			quesComplete.add("Array to BST");
		//
		for (Element table : tables) {
			Elements links = table.getElementsByTag("strong");
			for (Element e : links) {
				// System.out.println(e.text());
				if (!quesComplete.contains(e.text())) {
					quesList.add(e.text());
				}
			}
		}

		System.out.println(quesComplete.size() + " Questions complete !");

		/* for(String x: quesComplete){ System.out.println(x); } */

		System.out.println();

		System.out.println(quesList.size() + " Questions remaining !");
		/*
		 * for(String x: quesList){ System.out.println(x); }
		 */
		Random random = new Random();
		System.out.println("You shuld now do Question : "+quesList.get(random.nextInt(quesList.size())));
	}
}
