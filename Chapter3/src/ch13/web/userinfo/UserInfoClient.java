package ch13.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userinfo = new UserInfo();
		userinfo.setUserId("1234");
		userinfo.setPassword("!@#$");
		userinfo.setUserName("Lee");
		
		UserInfoDao userInforDao = null;
		
		if(dbType.equals("ORCLE")) {
			userInforDao = new UserInfoOracleDao();
		}
		else if (dbType.equals("MYSQL")) {
			userInforDao = new UserInfoMySqlDao();
		} else {
			System.out.println("DB error");
			return;
		}
		
		userInforDao.insertUserInfo(userinfo);
		userInforDao.updateUserInfo(userinfo);
		userInforDao.deleteUserInfo(userinfo);
	}

}
