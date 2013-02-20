package org.jenkinsci.plugins.helgrind;

import hudson.model.AbstractBuild;

import org.jenkinsci.plugins.helgrind.model.ValgrindProcess;

public class ValgrindProcessDetails
{
	private ValgrindProcess process;
	final private AbstractBuild<?, ?> owner;
	
	public ValgrindProcessDetails( AbstractBuild<?, ?> owner, ValgrindProcess process )
	{
		this.owner = owner;
		this.process = process;

	}
	
	public ValgrindProcess getProcess()
	{
		return process;
	}

	public AbstractBuild<?, ?> getOwner()
	{
		return owner;
	}
}
