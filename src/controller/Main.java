package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.SkillDAO;
import model.Skill;

public class Main {

	public static void main(String[] args) throws Exception 	{
		SkillDAO skilldao=new SkillDAO();
		ArrayList<Skill>  list= (ArrayList<Skill>) skilldao.listAllSkills();
		System.out.println("List of all Skills");
		for(Skill s: list)
		{
			System.out.println(s.getSkillId()+"    "+s.getSkillName());
		}
	}
}
