package com.test;

import java.util.*;

public class Test3 {

    public  static void  main(String args[]){




        List<Agent> agents = new ArrayList<>();

        Agent a1= new Agent("Chandra", 01);
        Agent a2= new Agent("Chandra", 01);
        Agent a3= new Agent("Chandra1", 011);

        if (a1.equals(a2)) {
            System.out.println("************ 1");
        }
       if (a2.equals(a3)) {
            System.out.println("************ 2");
        }  if (a3.equals(a1)) {
            System.out.println("************ 3");
        }

        agents.add(new Agent("Chandra", 01));
        agents.add(new Agent("Chandra", 02));
        agents.add(new Agent("sekar", 03));


        Collections.sort(agents);

        for (Agent agen1 :agents){
            System.out.println(agen1.getAgentname() +" :: "+ agen1.getAgentId());
        }

        Set<String> skipDupliAgent = new HashSet<>();

        for(Agent agent : agents){
            skipDupliAgent.add(agent.agentname);
        }

        System.out.println(skipDupliAgent);

        //table - EMPLOYEE
        //columns - ID,NAME,MGR_ID
        //1, Kumar, 3
        //2, Raju, 4
        //3, Mahesh,
        //4, Vedhansh,
        //5, Prabhanjan,

        //list of all employees info - EMP_ID, EMP_NAME, MGR_NAME
        //1, Kumar, Mahesh
        //2, Raju, Vedhansh
        //3, Mahesh, null
        //4, Vedhansh, null
        //5, Prabhanjan, null



    }

}
