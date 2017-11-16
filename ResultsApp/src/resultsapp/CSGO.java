/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultsapp;

/**
 *
 * @author dell
 */
public class CSGO extends Results{
    String team;
    String role;
    String sponsor;
    

    public CSGO(String team, String role, String sponsor) {
        this.team = team;
        this.role = role;
        this.sponsor= sponsor;
    }
    
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public String getSponsor() {
        return sponsor;
    }
    
    public String setSponsor() {
        this.sponsor=sponsor;
    }
}
