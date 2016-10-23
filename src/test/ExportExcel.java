package test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.airwxtx.utils.ExportExcelUtil;

public class ExportExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		List<String[]> table = new ArrayList<>();
		table.add(new String[]{"#", "�û���", "��ɫ", "����"});
		table.add(new String[]{"1", "Saber", "����ʿ", sdf.format(new Date())});
		table.add(new String[]{"2", "Lancer", "ǹ��ʿ", sdf.format(new Date())});
		table.add(new String[]{"3", "Archer", "����ʿ", sdf.format(new Date())});
		ExportExcelUtil.xls("C:\\Users\\Administrator\\Desktop\\fate.xls", table);
		ExportExcelUtil.xlsx("C:\\Users\\Administrator\\Desktop\\fate.xlsx", table);
		System.out.println("done");
	}

}
