package jp.co.plusize.motoyama_kazuya.calculate_sales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Calculate_sales {

	// ファイル読み込みメソッド
	void readFile(HashMap<String, String> fileDate, String filePath, String name) throws IOException {

		File file = new File(filePath);

		BufferedReader br = new BufferedReader(new FileReader(file));

		String str;

		while ((str = br.readLine()) != null) {
			String[] items = str.split(",");
			fileDate.put(items[0], items[1]);
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		// データを読み込む場所
		HashMap<String, String> branchFileDate = new HashMap<String, String>();
		HashMap<String, String> commodityFileDate = new HashMap<String, String>();

		// ファイルのパス
		String branchFilePath = (args[0] + "\\branch.lst");
		String commodityFilePath = (args[0] + "\\commodity.lst");

		// 名前
		String branchName = "支店";
		String commodityName = "商品";

		// インスタンス生成
		Calculate_sales sales = new Calculate_sales();

		// 支店定義ファイル読み込み
		sales.readFile(branchFileDate, branchFilePath, branchName);

		// 商品定義ファイル読み込み
		sales.readFile(commodityFileDate, commodityFilePath, commodityName);

		/*
		 * Calculate_sales_mathods branchFile = new
		 * Calculate_sales_mathods(args[0],"支店定義");
		 * 
		 * branchFile.readFile("\\branch.lst");
		 * 
		 * Calculate_sales_mathods commodityFile = new
		 * Calculate_sales_mathods(args[0],"商品定義"); commodityFile.readFile(
		 * "\\commodity.lst");
		 * 
		 * 
		 * System.out.println(branchFile.definitionFile);
		 * 
		 * System.out.println(commodityFile.definitionFile);
		 * 
		 * 
		 * 
		 * /* File file = new File(args[0]);
		 * 
		 * File files[] = file.listFiles();
		 * 
		 * 
		 * //取得した一覧を表示する for (int i=0; i<files.length; i++) {
		 * System.out.println("ファイル" + (i+1) + "→" + files[i].getName());
		 * 
		 * 
		 * 
		 * 
		 * }
		 */
	}
}
