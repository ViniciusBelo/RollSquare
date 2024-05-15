package org.valorantunveil.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AgentesDto {

    private String uuid;
    private String displayName;
    private String description;
    private String displayIconSmall;
    private String roleuuid;
    private String roleDisplayName;
    private String roleDescription;
    private String roleDisplayIcon;
    private String ability1Name;
    private String ability1Description;
    private String ability1Icon;
    private String ability2Name;
    private String ability2Description;
    private String ability2Icon;
    private String grenadeName;
    private String grenadeDescription;
    private String grenadeIcon;
    private String ultimateName;
    private String ultimateDescription;
    private String ultimateIcon;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplayIconSmall() {
        return displayIconSmall;
    }

    public void setDisplayIconSmall(String displayIconSmall) {
        this.displayIconSmall = displayIconSmall;
    }

    public String getRoleuuid() {
        return roleuuid;
    }

    public void setRoleuuid(String roleuuid) {
        this.roleuuid = roleuuid;
    }

    public String getRoleDisplayName() {
        return roleDisplayName;
    }

    public void setRoleDisplayName(String roleDisplayName) {
        this.roleDisplayName = roleDisplayName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public String getRoleDisplayIcon() {
        return roleDisplayIcon;
    }

    public void setRoleDisplayIcon(String roleDisplayIcon) {
        this.roleDisplayIcon = roleDisplayIcon;
    }

    public String getAbility1Name() {
        return ability1Name;
    }

    public void setAbility1Name(String ability1Name) {
        this.ability1Name = ability1Name;
    }

    public String getAbility1Description() {
        return ability1Description;
    }

    public void setAbility1Description(String ability1Description) {
        this.ability1Description = ability1Description;
    }

    public String getAbility1Icon() {
        return ability1Icon;
    }

    public void setAbility1Icon(String ability1Icon) {
        this.ability1Icon = ability1Icon;
    }

    public String getAbility2Name() {
        return ability2Name;
    }

    public void setAbility2Name(String ability2Name) {
        this.ability2Name = ability2Name;
    }

    public String getAbility2Description() {
        return ability2Description;
    }

    public void setAbility2Description(String ability2Description) {
        this.ability2Description = ability2Description;
    }

    public String getAbility2Icon() {
        return ability2Icon;
    }

    public void setAbility2Icon(String ability2Icon) {
        this.ability2Icon = ability2Icon;
    }

    public String getGrenadeName() {
        return grenadeName;
    }

    public void setGrenadeName(String grenadeName) {
        this.grenadeName = grenadeName;
    }

    public String getGrenadeDescription() {
        return grenadeDescription;
    }

    public void setGrenadeDescription(String grenadeDescription) {
        this.grenadeDescription = grenadeDescription;
    }

    public String getGrenadeIcon() {
        return grenadeIcon;
    }

    public void setGrenadeIcon(String grenadeIcon) {
        this.grenadeIcon = grenadeIcon;
    }

    public String getUltimateName() {
        return ultimateName;
    }

    public void setUltimateName(String ultimateName) {
        this.ultimateName = ultimateName;
    }

    public String getUltimateDescription() {
        return ultimateDescription;
    }

    public void setUltimateDescription(String ultimateDescription) {
        this.ultimateDescription = ultimateDescription;
    }

    public String getUltimateIcon() {
        return ultimateIcon;
    }

    public void setUltimateIcon(String ultimateIcon) {
        this.ultimateIcon = ultimateIcon;
    }

    @Override
    public String toString() {
        return "AgentesDto{" +
                "uuid='" + uuid + '\'' +
                ", displayName='" + displayName + '\'' +
                ", description='" + description + '\'' +
                ", displayIconSmall='" + displayIconSmall + '\'' +
                ", roleuuid='" + roleuuid + '\'' +
                ", roleDisplayName='" + roleDisplayName + '\'' +
                ", roleDescription='" + roleDescription + '\'' +
                ", roleDisplayIcon='" + roleDisplayIcon + '\'' +
                ", ability1Name='" + ability1Name + '\'' +
                ", ability1Description='" + ability1Description + '\'' +
                ", ability1Icon='" + ability1Icon + '\'' +
                ", ability2Name='" + ability2Name + '\'' +
                ", ability2Description='" + ability2Description + '\'' +
                ", ability2Icon='" + ability2Icon + '\'' +
                ", grenadeName='" + grenadeName + '\'' +
                ", grenadeDescription='" + grenadeDescription + '\'' +
                ", grenadeIcon='" + grenadeIcon + '\'' +
                ", ultimateName='" + ultimateName + '\'' +
                ", ultimateDescription='" + ultimateDescription + '\'' +
                ", ultimateIcon='" + ultimateIcon + '\'' +
                '}';
    }
}
