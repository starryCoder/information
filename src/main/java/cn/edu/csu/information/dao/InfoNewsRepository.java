package cn.edu.csu.information.dao;

import cn.edu.csu.information.dataObject.InfoNews;
import org.springframework.data.jpa.repository.JpaRepository;


public interface InfoNewsRepository  extends JpaRepository<InfoNews, Integer> {


}