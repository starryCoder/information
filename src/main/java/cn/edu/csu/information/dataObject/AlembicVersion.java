package cn.edu.csu.information.dataObject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class AlembicVersion implements Serializable {

    @Id
    private String versionNum;

    private static final long serialVersionUID = 1L;

    public String getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum;
    }
}