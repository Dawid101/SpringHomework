package pl.coderslab.advanced.dao;

import java.sql.Connection;
import java.util.List;

public class Main {

	public static void main(String[] args) {


		// create group
		try (Connection conn = DbUtil.getConnection()) {
			GroupDao groupDao = new GroupDao();
			Group g = new Group("sample name");
			//save group to database
			groupDao.save(g);


			//get all groups
			List<Model> groups = groupDao.loadAll();
			for (Model model : groups) {
				Group group = (Group) model;
				System.out.println(group.getName());
			}


			//update group
			g.setName("other name");
			groupDao.save(g);

			for (Model model : groups) {
				Group group = (Group) model;
				System.out.println(group.getName());
			}

			//remove group
			Group firstElement = (Group) groupDao.loadById(1);
			if (firstElement != null) {
				groupDao.delete(firstElement);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
