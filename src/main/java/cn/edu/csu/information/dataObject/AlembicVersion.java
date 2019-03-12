package cn.edu.csu.information.dataObject;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class AlembicVersion implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alembic_version.version_num
     *
     * @mbg.generated Mon Mar 11 20:29:47 CST 2019
     */
    @Id
    private String versionNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table alembic_version
     *
     * @mbg.generated Mon Mar 11 20:29:47 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alembic_version.version_num
     *
     * @return the value of alembic_version.version_num
     *
     * @mbg.generated Mon Mar 11 20:29:47 CST 2019
     */
    public String getVersionNum() {
        return versionNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alembic_version.version_num
     *
     * @param versionNum the value for alembic_version.version_num
     *
     * @mbg.generated Mon Mar 11 20:29:47 CST 2019
     */
    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum;
    }
}