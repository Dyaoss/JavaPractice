package ch13.web.userinfo;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbTybe = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("이순신");
        userInfo.setUserId("12345");
        userInfo.setPassword("383838");

        UserInfoDao userInfoDao = null;

        if (dbTybe.equals("Oracle")) {
            userInfoDao = new UserInfoOracleDao();
        }
        else if(dbTybe.equals("MYSQL")){
            userInfoDao = new UserInfoMysqlDao();
        }
        else {
            System.out.println("DB ERROR!!");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

    }
}
