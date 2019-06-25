package com.suoron.ssm.dto;

import java.util.List;

/**
 * Auto-generated: 2019-06-19 16:41:54
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class LogisticsResp {

    private String LogisticCode;
    private String ShipperCode;
    private List<Traces> Traces;
    private String State;
    private String EBusinessID;
    private boolean Success;

    public void setLogisticCode(String LogisticCode) {
        this.LogisticCode = LogisticCode;
    }

    public String getLogisticCode() {
        return LogisticCode;
    }

    public void setShipperCode(String ShipperCode) {
        this.ShipperCode = ShipperCode;
    }

    public String getShipperCode() {
        return ShipperCode;
    }

    public void setTraces(List<Traces> Traces) {
        this.Traces = Traces;
    }

    public List<Traces> getTraces() {
        return Traces;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getState() {
        return State;
    }

    public void setEBusinessID(String EBusinessID) {
        this.EBusinessID = EBusinessID;
    }

    public String getEBusinessID() {
        return EBusinessID;
    }

    public void setSuccess(boolean Success) {
        this.Success = Success;
    }

    public boolean getSuccess() {
        return Success;
    }
}
