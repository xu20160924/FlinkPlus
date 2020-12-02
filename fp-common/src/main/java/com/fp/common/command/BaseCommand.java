package com.fp.common.command;

import com.beust.jcommander.DynamicParameter;
import com.beust.jcommander.Parameter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Denial.AO
 * @date: 2020-12-01 15:11
 * @description: Base command
 **/
public class BaseCommand implements Serializable {
    @DynamicParameter(names = "-D", description = "Dynamic parameters go here")
    private Map<String, String> params = new HashMap<String, String>();

    @Parameter(names = {"--help", "-help", "-h"}, help = true, description = "help info")
    private boolean help;

    @Parameter(names = {"--version", "-version", "-v"}, description = "FlinkPlus framework client version")
    private boolean verbose;

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public boolean isHelp() {
        return help;
    }

    public void setHelp(boolean help) {
        this.help = help;
    }

    public boolean isVerbose() {
        return verbose;
    }

    public void setVerbose(boolean verbose) {
        this.verbose = verbose;
    }
}
