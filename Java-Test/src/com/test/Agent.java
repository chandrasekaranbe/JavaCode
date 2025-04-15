package com.test;

import java.util.Comparator;
import java.util.Objects;

public class Agent implements Comparable<Agent> {

    public Agent(String agentname, int agentId) {
        this.agentname = agentname;
        this.agentId = agentId;
    }

    String agentname;

    int agentId;

    public String getAgentname() {
        return agentname;
    }

    public void setAgentname(String agentname) {
        this.agentname = agentname;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }


    @Override
    public int compareTo(Agent o) {
        return this.getAgentname().compareTo(o.getAgentname());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        return true;
        if(!(obj instanceof Agent))
            return false;

        Agent agent = (Agent) obj;
        return Objects.equals(this.agentname,agent.agentname);

    }

    @Override
    public int hashCode(){
        return Objects.hash(agentId,agentname);

    }
}
